package ua.org.pius.studtrain.services.api;

import ua.org.pius.studtrain.db.tables.pojos.Users;

/**
 * Created by SKulik on 22.06.2016.
 */
public interface UserService {
    Users getUser(String username);
    void addUser(Users user);
    void removeUser(String username);
}
