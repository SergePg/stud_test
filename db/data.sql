/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     25.06.2012 14:26:28                          */
/*                                                              */
/* Created by skulik                                            */
/*==============================================================*/

DELIMITER ;

INSERT INTO roles(rolename)  VALUES('Administrators');

INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('a','a FirstName', 'a LastName', 'M', 'a@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('ua','a FirstName', 'a LastName', 'M', 'a@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('u','ua FirstName', 'ua LastName', 'F', 'ua@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('uu','uu FirstName', 'uu LastName', 'F', 'uu@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('manager1','manager1 FirstName', 'manager1 LastName', 'M', 'manager.1@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('manager2','manager2 FirstName', 'manager2 LastName', 'F', 'manager.2@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('user1','user1 FirstName', 'user1 LastName', 'M', 'user1@bestence.com', 'rhennes');
INSERT INTO users (username, first_name, last_name, gender, email, backend_id)  VALUES('user2','user2 FirstName', 'user2 LastName', 'F', 'user2@bestence.com', 'rhennes');

INSERT INTO shadow (username, password)  VALUES('a',        'ca978112ca1bbdcafac231b39a23dc4da786eff8147c4e72b9807785afee48bb');
INSERT INTO shadow (username, password)  VALUES('ua',       '844bc172f032bdd2d0baae3536c1d66c2dcba8481b1b6d8fc11fa3c5de29c6cb');
INSERT INTO shadow (username, password)  VALUES('u',        '0bfe935e70c321c7ca3afc75ce0d0ca2f98b5422e008bb31c00c6d7f1f1c0ad6');
INSERT INTO shadow (username, password)  VALUES('uu',       '5afab9a620f6f11284505be2fb9a975b4dccfdd30970dffc7ed875490160e4d0');
INSERT INTO shadow (username, password)  VALUES('manager1', '380f9771d2df8566ce2bd5b8ed772b0bb74fd6457fb803ab2d267c394d89c750');
INSERT INTO shadow (username, password)  VALUES('manager2', '9d05b6092d975b0884c6ba7fadb283ced03da9822ebbd13cc6b6d1855a6495ec');
INSERT INTO shadow (username, password)  VALUES('user1',    '0a041b9462caa4a31bac3567e0b6e6fd9100787db2ab433d96f6d178cabfce90');
INSERT INTO shadow (username, password)  VALUES('user2',    '6025d18fe48abd45168528f18a82e265dd98d421a7084aa09f61b341703901a3');

INSERT INTO user_roles(username, rolename)  VALUES('a', 'Administrators');
INSERT INTO user_roles(username, rolename)  VALUES('manager1', 'Installation 1 managers');
INSERT INTO user_roles(username, rolename)  VALUES('manager1', 'Installation 1 user');
INSERT INTO user_roles(username, rolename)  VALUES('manager2', 'Installation 2 managers');
INSERT INTO user_roles(username, rolename)  VALUES('manager2', 'Installation 2 user');
INSERT INTO user_roles(username, rolename)  VALUES('user1', 'Installation 1 user');
INSERT INTO user_roles(username, rolename)  VALUES('user2', 'Installation 2 user');  
INSERT INTO user_roles(username, rolename)  VALUES('u', 'Installation 1 user');  
INSERT INTO user_roles(username, rolename)  VALUES('uu', 'Installation 1 user');  
INSERT INTO user_roles(username, rolename)  VALUES('ua', 'Installation 1 user');  
INSERT INTO user_roles(username, rolename)  VALUES('ua', 'Administrators');  




