package ua.org.pius.studtrain.services.api;

/**
 * Created by SKulik on 22.06.2016.
 */
public interface ServiceConstants {
    int AUTH_SUCCESS = 0;
    int AUTH_BAD_PASSWD = 1;
    int AUTH_INTERNAL_ERROR = 2;
    int AUTH_PASSWD_EXPIRED = 3;
    int AUTH_USERNAME_IS_EMPTY = 4;

    int USER_NOT_FOUND = 5;
    int USER_DISABLED = 6;

    int UNKNOWN_ERROR = 999;

    String DOMAIN_AUTH = "AUTH";


    String ENUM_USERS_ACTIVATION_DISABLED = "0";
    String ENUM_USERS_ACTIVATION_ENABLED = "1";
    String ENUM_USERS_ACTIVATION_WAIT_ACTIVATION = "2";


}
