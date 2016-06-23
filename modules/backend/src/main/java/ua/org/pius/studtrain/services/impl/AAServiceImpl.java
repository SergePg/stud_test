package ua.org.pius.studtrain.services.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import ua.org.pius.studtrain.db.Tables;
import ua.org.pius.studtrain.db.tables.pojos.Privs;
import ua.org.pius.studtrain.db.tables.records.ShadowRecord;
import ua.org.pius.studtrain.db.tables.records.UsersRecord;
import ua.org.pius.studtrain.services.api.ServiceException;
import ua.org.pius.studtrain.services.api.AAService;
import ua.org.pius.studtrain.services.api.ServiceConstants;

import java.util.List;

/**
 * Created by SKulik on 22.06.2016.
 */
public class AAServiceImpl implements AAService {

    private DSLContext context;


    @Override
    public List<Privs> checkAuthentication(String username, String password) throws ServiceException {
        if (org.apache.commons.lang3.StringUtils.isBlank(username))
            throw new ServiceException(ServiceConstants.AUTH_USERNAME_IS_EMPTY);
        try {
            UsersRecord usersRecord = context.fetchOne(Tables.USERS, Tables.USERS.USERNAME.eq(username));
            if (usersRecord == null) {
                throw new ServiceException(ServiceConstants.USER_NOT_FOUND);
            }
            if (ServiceConstants.ENUM_USERS_ACTIVATION_DISABLED.equals(usersRecord.getActivation())) {
                throw new ServiceException(ServiceConstants.USER_DISABLED);
            }
            ShadowRecord shadowRecord = context.fetchOne(Tables.SHADOW, Tables.SHADOW.USERNAME.eq(username));
            if (shadowRecord == null)
                throw new ServiceException(ServiceConstants.USER_NOT_FOUND);
            if ((StringUtils.isBlank(shadowRecord.getPassword()) && StringUtils.isBlank(password)) || shadowRecord.getPassword().equals(DigestUtils.md5Hex(password))) {
//                all ok
                return context.selectDistinct(Tables.PRIVS.fields())
                        .from(Tables.USER_ROLES)
                        .join(Tables.ROLES)
                            .on(Tables.USER_ROLES.ROLENAME.eq(Tables.ROLES.ROLENAME))
                        .join(Tables.ROLE_PRIVS)
                            .on(Tables.ROLES.ROLENAME.eq(Tables.ROLE_PRIVS.ROLENAME))
                        .join(Tables.PRIVS)
                            .on(Tables.ROLE_PRIVS.PRIVILEGE_ID.eq(Tables.PRIVS.ID))
                        .where(Tables.USER_ROLES.USERNAME.eq(username))
                        .fetchInto(Privs.class);
            } else {
                throw new ServiceException(ServiceConstants.AUTH_BAD_PASSWD);
            }
        } catch (DataAccessException e) {
            throw new ServiceException(ServiceConstants.AUTH_INTERNAL_ERROR);
        }
    }

    @Override
    public void updateAuth(String username, String password) throws ServiceException {

    }

    @Override
    public void updateAuthPrivileged(String username, String password, String admin, String pswCache) throws ServiceException {

    }

    public void setContext(DSLContext context) {
        this.context = context;
    }
}
