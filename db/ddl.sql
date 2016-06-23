CREATE SEQUENCE SEQ_PK_EDU_GROUP START 101;
CREATE SEQUENCE SEQ_PK_STUDENT START 101;
CREATE SEQUENCE SEQ_PK_STUDENT_STATISTICS START 101;
CREATE SEQUENCE SEQ_PK_THEME START 101;
CREATE SEQUENCE SEQ_PK_QUESTION_TYPE START 101;
CREATE SEQUENCE SEQ_PK_QUESTION START 101;
CREATE SEQUENCE SEQ_PK_QUESTION_STATISTICS START 101;
CREATE SEQUENCE SEQ_PK_STUDIES_COURSE START 101;
CREATE SEQUENCE SEQ_PK_EDU_GROUP_COURSE START 101;
CREATE SEQUENCE SEQ_PK_EXAM START 101;
CREATE SEQUENCE SEQ_PK_STUDENT_RESULT START 101;
CREATE SEQUENCE SEQ_PK_STUDENT_TASK START 101;
CREATE SEQUENCE SEQ_PK_ANSWER START 101;
CREATE SEQUENCE SEQ_PK_EXAM_RULE START 101;
CREATE SEQUENCE SEQ_PK_EXAM_TREE_NODE START 101;
CREATE SEQUENCE SEQ_PK_TASK_ANSWER START 101;
CREATE SEQUENCE SEQ_PK_TASK_QUESTIONS START 101;
CREATE SEQUENCE SEQ_PK_EXAMINATION_TICKET START 101;

/*==============================================================*/
/* Table: privs                                                 */
/*==============================================================*/
CREATE TABLE privs
(
  id          VARCHAR(11) NOT NULL,
  name        VARCHAR(30) NOT NULL,
  description VARCHAR(256),
  CONSTRAINT PK_PRIVS PRIMARY KEY (id)
);
-- alter table privs comment 'global privileges list for the system';
/*==============================================================*/
/* Table: role_privs                                            */
/*==============================================================*/
CREATE TABLE role_privs
(
  rolename     VARCHAR(30) NOT NULL,
  privilege_id VARCHAR(11) NOT NULL,
  CONSTRAINT PK_ROLE_PRIVS PRIMARY KEY (rolename, privilege_id)
);
/*==============================================================*/
/* Table: roles                                                 */
/*==============================================================*/
CREATE TABLE roles
(
  rolename   VARCHAR(30) NOT NULL,
  created_at TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
  printname  VARCHAR(30) NOT NULL,
  CONSTRAINT PK_ROLES PRIMARY KEY (rolename)
);
-- alter table roles comment 'list of roles';
-- -----------------------------------------------------
-- Table: user_roles                                    
-- -----------------------------------------------------
CREATE TABLE user_roles
(
  username VARCHAR(30) NOT NULL,
  rolename VARCHAR(30) NOT NULL,
  CONSTRAINT PK_USER_ROLES PRIMARY KEY (username, rolename)
);
-- alter table user_roles comment 'roles for users';

-- -----------------------------------------------------
-- Table: users                                   
-- -----------------------------------------------------
CREATE TABLE users
(
  username       VARCHAR(30)  NOT NULL,
  created_at     TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  activation     VARCHAR(1)   NOT NULL DEFAULT '0',
  first_name     VARCHAR(255) NOT NULL,
  last_name      VARCHAR(255) NOT NULL,
  gender         VARCHAR(1),
  email          VARCHAR(255),
  phone          VARCHAR(255),
  activation_key VARCHAR(255),
  params         VARCHAR(4096),
  CONSTRAINT PK_USERS PRIMARY KEY (username)
);
-- alter table users comment 'list of users';


-- -----------------------------------------------------
-- Table edu_group
-- -----------------------------------------------------
CREATE TABLE edu_group
(
  id         INT         NOT NULL,
  name       VARCHAR(25) NOT NULL,
  instructor VARCHAR(30) NOT NULL,
  CONSTRAINT PK_EDU_GROUP PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table student
-- -----------------------------------------------------
CREATE TABLE student (
  id           INT          NOT NULL,
  name         VARCHAR(25)  NOT NULL,
  full_name    VARCHAR(100) NOT NULL,
  username     VARCHAR(30)  NULL,
  edu_group_id INT          NOT NULL,
  CONSTRAINT PK_STUDENT PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table `student_statistics`
-- -----------------------------------------------------
CREATE TABLE student_statistics (
  id                    INT NOT NULL,
  number_exam_for_group INT NULL DEFAULT NULL,
  number_exam_for_stud  INT NULL DEFAULT NULL,
  number_corrects       INT NULL DEFAULT NULL,
  number_incorrects     INT NULL DEFAULT NULL,
  number_rejections     INT NULL DEFAULT NULL,
  number_timeout        INT NULL DEFAULT NULL,
  summ_ball_possible    INT NULL DEFAULT NULL,
  summ_ball             INT NULL DEFAULT NULL,
  student_id            INT NOT NULL,
  CONSTRAINT PK_STUDENT_STATISTICS PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table theme
-- -----------------------------------------------------
CREATE TABLE theme (
  id           INT         NOT NULL,
  parent       INT         NULL DEFAULT NULL,
  name         VARCHAR(55) NOT NULL,
  creator_name VARCHAR(30) NOT NULL,
  rgt          INT         NOT NULL,
  lft          INT         NOT NULL,
  CONSTRAINT PK_THEME PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table question_type
-- -----------------------------------------------------
CREATE TABLE question_type (
  id   INT         NOT NULL,
  name VARCHAR(55) NOT NULL,
  CONSTRAINT PK_QUESTION_TYPE PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table question
-- -----------------------------------------------------
CREATE TABLE question (
  id               INT  NOT NULL,
  text             TEXT NOT NULL,
  ball             INT  NOT NULL,
  question_type_id INT  NOT NULL,
  theme_id         INT  NOT NULL,
  CONSTRAINT PK_QUESTION PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table `question_statistics`
-- -----------------------------------------------------
CREATE TABLE question_statistics (
  id                       INT NOT NULL,
  number_exam_for_theme    INT NULL DEFAULT NULL,
  number_exam_for_question INT NULL DEFAULT NULL,
  number_corrects          INT NULL DEFAULT NULL,
  number_incorrects        INT NULL DEFAULT NULL,
  number_rejections        INT NULL DEFAULT NULL,
  number_timeout           INT NULL DEFAULT NULL,
  summ_ball_possible       INT NULL DEFAULT NULL,
  summ_ball                INT NULL DEFAULT NULL,
  question_id              INT NOT NULL,
  CONSTRAINT PK_QUESTION_STATISTICS PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table: shadow
-- -----------------------------------------------------
CREATE TABLE shadow
(
  username VARCHAR(30)  NOT NULL,
  password VARCHAR(512) NOT NULL,
  CONSTRAINT PK_SHADOW PRIMARY KEY (username)
);
-- alter table shadow comment 'user passwords';

-- -----------------------------------------------------
-- Table: logs
-- -----------------------------------------------------
CREATE TABLE logs
(
  username    VARCHAR(30) NOT NULL,
  domain      VARCHAR(30) NOT NULL,
  created_at  TIMESTAMP   NOT NULL,
  description VARCHAR(4096),
  CONSTRAINT PK_LOGS PRIMARY KEY (username, domain, created_at)
);
-- alter table logs comment 'log messages of the system';

-- -----------------------------------------------------
-- Table `studies_course`
-- -----------------------------------------------------
CREATE TABLE studies_course (
  id          INT           NOT NULL,
  name        VARCHAR(30)   NOT NULL,
  description VARCHAR(2048) NULL,
  date_start  TIMESTAMP     NULL,
  date_end    TIMESTAMP     NULL,
  state       INT           NULL,
  CONSTRAINT PK_STUDIES_COURSE PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table `edu_group_course`
-- -----------------------------------------------------
CREATE TABLE edu_group_course (
  id                INT NOT NULL,
  edu_group_id      INT NULL,
  studies_course_id INT NULL,
  CONSTRAINT PK_EDU_GROUP_COURSE PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table `exam`
-- -----------------------------------------------------
CREATE TABLE exam (
  id                  INT           NOT NULL,
  type                INT           NULL DEFAULT 0,
  time_start          TIMESTAMP     NOT NULL,
  time_end            TIMESTAMP     NOT NULL,
  time_limit          TIMESTAMP     NOT NULL,
  edu_group_course_id INT           NULL,
  examenator_name     VARCHAR(30)   NOT NULL,
  name                VARCHAR(1024) NOT NULL,
  description         VARCHAR(2048) NULL,
  ball                INT           NULL,
  min_ball            INT           NULL,
  CONSTRAINT PK_EXAM PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table student_result
-- -----------------------------------------------------
CREATE TABLE student_result (
  id               INT           NOT NULL,
  text             VARCHAR(1024) NULL,
  ball             INT           NULL,
  success_question INT           NULL,
  all_questions    INT           NULL,
  time_start       TIMESTAMP     NULL,
  time_end         TIMESTAMP     NULL,
  CONSTRAINT PK_STUDENT_RESULT PRIMARY KEY (id)
);

CREATE TABLE examination_ticket (
  id      INT NOT NULL,
  exam_id INT NOT NULL,
  number  INT NULL,
  CONSTRAINT PK_EXAMINATION_TICKET PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table student_task
-- -----------------------------------------------------
CREATE TABLE student_task (
  id                    INT NOT NULL,
  student_id            INT NOT NULL,
  exam_id               INT NOT NULL,
  examination_ticket_id INT NOT NULL,
  student_result_id     INT NOT NULL,
  CONSTRAINT PK_STUDENT_TASK PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table answer
-- -----------------------------------------------------
CREATE TABLE answer (
  id          INT           NOT NULL,
  text        VARCHAR(1024) NULL,
  question_id INT           NOT NULL,
  CONSTRAINT PK_ANSWER PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table exam_rule
-- -----------------------------------------------------
CREATE TABLE exam_rule (
  id            INT         NOT NULL,
  name          VARCHAR(45) NULL,
  num_questions INT         NOT NULL,
  CONSTRAINT PK_EXAM_RULE PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table exam_tree_node
-- -----------------------------------------------------
CREATE TABLE exam_tree_node (
  id           INT NOT NULL,
  exam_id      INT NOT NULL,
  theme_id     INT NOT NULL,
  exam_rule_id INT NOT NULL,
  CONSTRAINT PK_EXAM_TREE_NODE PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table task_questions`
-- -----------------------------------------------------
CREATE TABLE task_questions (
  id              INT NOT NULL,
  student_task_id INT NOT NULL,
  question_id     INT NOT NULL,
  CONSTRAINT PK_TASK_QUESTIONS PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table task_answer
-- -----------------------------------------------------
CREATE TABLE task_answer (
  id                INT           NOT NULL,
  task_questions_id INT           NOT NULL,
  answer_id         INT           NOT NULL,
  text              VARCHAR(1024) NULL,
  CONSTRAINT PK_TASK_ANSWER PRIMARY KEY (id)
);


ALTER TABLE user_roles ADD CONSTRAINT fk_user_roles_roles FOREIGN KEY (rolename)
REFERENCES roles (rolename) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE user_roles ADD CONSTRAINT fk_user_roles_users FOREIGN KEY (username)
REFERENCES users (username) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE role_privs ADD CONSTRAINT FK_role_privs_privs FOREIGN KEY (privilege_id)
REFERENCES privs (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE role_privs ADD CONSTRAINT FK_role_privs_roles FOREIGN KEY (rolename)
REFERENCES roles (rolename) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE edu_group ADD CONSTRAINT fk_edu_group_users FOREIGN KEY (instructor)
REFERENCES users (username) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE student ADD CONSTRAINT fk_student_person FOREIGN KEY (username)
REFERENCES users (username) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE student ADD CONSTRAINT fk_student_edu_group FOREIGN KEY (edu_group_id)
REFERENCES edu_group (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE student_statistics ADD CONSTRAINT fk_student_id FOREIGN KEY (student_id)
REFERENCES student (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE theme ADD CONSTRAINT fk_theme_theme FOREIGN KEY (parent)
REFERENCES theme (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE theme ADD CONSTRAINT fk_theme_user FOREIGN KEY (creator_name)
REFERENCES users (username) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE question ADD CONSTRAINT fk_question_question_type FOREIGN KEY (question_type_id)
REFERENCES question_type (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE question ADD CONSTRAINT fk_question_theme FOREIGN KEY (theme_id)
REFERENCES theme (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE question_statistics ADD CONSTRAINT fk_question_id FOREIGN KEY (question_id)
REFERENCES question (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE shadow ADD CONSTRAINT fk_shadow_users FOREIGN KEY (username)
REFERENCES users (username) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE logs ADD CONSTRAINT fk_logs_users FOREIGN KEY (username)
REFERENCES users (username) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE edu_group_course ADD CONSTRAINT fk_edu_group_course_studies_course FOREIGN KEY (studies_course_id)
REFERENCES studies_course (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE edu_group_course ADD CONSTRAINT fk_edu_group_course_edu_group FOREIGN KEY (edu_group_id)
REFERENCES edu_group (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE exam ADD CONSTRAINT fk_exam_edu_group_course FOREIGN KEY (edu_group_course_id)
REFERENCES edu_group_course (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE exam ADD CONSTRAINT fk_exam_users FOREIGN KEY (examenator_name)
REFERENCES users (username) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE student_task ADD CONSTRAINT fk_student_task_student FOREIGN KEY (student_id)
REFERENCES student (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE student_task ADD CONSTRAINT fk_student_task_exam FOREIGN KEY (exam_id)
REFERENCES exam (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE student_task ADD CONSTRAINT fk_student_task_examination_ticket FOREIGN KEY (examination_ticket_id)
REFERENCES examination_ticket (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE examination_ticket ADD CONSTRAINT fk_examination_ticket_exam FOREIGN KEY (exam_id)
REFERENCES exam (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE student_task ADD CONSTRAINT fk_student_task_student_result FOREIGN KEY (student_result_id)
REFERENCES student_result (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE answer ADD CONSTRAINT fk_answer_question FOREIGN KEY (question_id)
REFERENCES question (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE exam_tree_node ADD CONSTRAINT fk_exam_tree_node_exam FOREIGN KEY (exam_id)
REFERENCES exam (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE exam_tree_node ADD CONSTRAINT fk_exam_tree_node_theme FOREIGN KEY (theme_id)
REFERENCES theme (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE exam_tree_node ADD CONSTRAINT fk_exam_tree_node_exam_rule FOREIGN KEY (exam_rule_id)
REFERENCES exam_rule (id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE task_questions ADD CONSTRAINT fk_task_questions_student_task FOREIGN KEY (student_task_id)
REFERENCES student_task (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE task_questions ADD CONSTRAINT fk_task_questions_question FOREIGN KEY (question_id)
REFERENCES question (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE task_answer ADD CONSTRAINT fk_task_answer_task_questions FOREIGN KEY (task_questions_id)
REFERENCES task_questions (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE task_answer ADD CONSTRAINT fk_task_answer_answer FOREIGN KEY (answer_id)
REFERENCES answer (id) ON DELETE CASCADE ON UPDATE CASCADE;
