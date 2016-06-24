package ua.org.pius.studtrain.services.api;

import ua.org.pius.studtrain.db.tables.pojos.Privs;
import ua.org.pius.studtrain.db.tables.pojos.Roles;

import java.util.List;

/**
 * Created by SKulik on 22.06.2016.
 */
public interface AAService {
    List<Privs> checkAuthentication(String username, String password) throws ServiceException;
    void updatePasswd(String username, String password) throws ServiceException;
    void updatePasswdPrivileged(String username, String password, String admin, String pswCache) throws ServiceException;
}
