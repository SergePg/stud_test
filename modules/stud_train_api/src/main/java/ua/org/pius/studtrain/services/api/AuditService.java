package ua.org.pius.studtrain.services.api;

/**
 * Created by SKulik on 23.06.2016.
 */
public interface AuditService {
    void writeLog(String username, String domain, String description);
}
