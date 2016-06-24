package ua.org.pius.studtrain.services.impl;

import org.jooq.DSLContext;
import ua.org.pius.studtrain.db.Tables;
import ua.org.pius.studtrain.db.tables.records.LogsRecord;
import ua.org.pius.studtrain.services.api.AuditService;

import java.sql.Timestamp;

/**
 * Created by SKulik on 23.06.2016.
 */
public class AuditServiceImpl implements AuditService {

    private DSLContext context;

    @Override
    public void writeLog(String username, String domain, String description) {
        LogsRecord record = context.newRecord(Tables.LOGS);
        record.setUsername(username);
        record.setDomain(domain);
        record.setDescription(description);
        record.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        record.store();
    }

    public void setContext(DSLContext context) {
        this.context = context;
    }
}
