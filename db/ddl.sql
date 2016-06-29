create sequence SEQ_PK_ANSWER
START 101;

create sequence SEQ_PK_EDU_GROUP
START 101;

create sequence SEQ_PK_EXAM
START 101;

create sequence SEQ_PK_EXAM_TICKET
START 101;

create sequence SEQ_PK_EXAM_TREE_NODE
START 101;

create sequence SEQ_PK_GROUP_COURSE
START 101;

create sequence SEQ_PK_GROUP_LIST
START 101;

create sequence SEQ_PK_QUESTION
START 101;

create sequence SEQ_PK_QUESTION_STATISTICS
START 101;

create sequence SEQ_PK_QUESTION_TYPE
START 101;

create sequence SEQ_PK_STUDENT
START 101;

create sequence SEQ_PK_STUDENT_RESULT
START 101;

create sequence SEQ_PK_STUDENT_STATISTICS
START 101;

create sequence SEQ_PK_STUDENT_TASK
START 101;

create sequence SEQ_PK_STUDIES_COURSE
START 101;

create sequence SEQ_PK_TASK_ANSWER
START 101;

create sequence SEQ_PK_TASK_QUESTIONS
START 101;

create sequence SEQ_PK_THEME
START 101;

/*==============================================================*/
/* Table: answer                                                */
/*==============================================================*/
create table answer (
  id                   INT                  not null,
  question_id          INT                  not null,
  result               INT1                 null,
  text                 VARCHAR(1024)        null,
  constraint PK_ANSWER primary key (id)
);

/*==============================================================*/
/* Table: exam                                                  */
/*==============================================================*/
create table exam (
  id                   INT                  not null,
  type                 INT                  null default '0',
  time_start           TIMESTAMP            not null,
  time_end             TIMESTAMP            not null,
  time_limit           TIMESTAMP            not null,
  group_course_id      INT                  null,
  name                 VARCHAR(1024)        not null,
  description          VARCHAR(2048)        null,
  ball                 INT                  null,
  min_ball             INT                  null,
  partition_id         INT5                 null,
  constraint PK_EXAM primary key (id)
);

/*==============================================================*/
/* Table: examination_ticket                                    */
/*==============================================================*/
create table examination_ticket (
  id                   INT                  not null,
  exam_id              INT                  not null,
  number               INT                  null,
  constraint PK_EXAM_TICKET primary key (id)
);

/*==============================================================*/
/* Table: group_course                                          */
/*==============================================================*/
create table group_course (
  id                   INT                  not null,
  studies_course_id    INT                  null,
  groups_id            INT5                 null,
  constraint PK_GROUP_COURSE primary key (id)
);

/*==============================================================*/
/* Table: groups                                                */
/*==============================================================*/
create table groups (
  id                   INT                  not null,
  name                 VARCHAR(25)          not null,
  constraint PK_EDU_GROUP primary key (id)
);

/*==============================================================*/
/* Table: logs                                                  */
/*==============================================================*/
create table logs (
  username             VARCHAR(30)          not null,
  domain               VARCHAR(30)          not null,
  created_at           TIMESTAMP            not null,
  description          VARCHAR(4096)        null,
  constraint PK_LOGS primary key (username, domain, created_at)
);

/*==============================================================*/
/* Table: partition                                             */
/*==============================================================*/
create table partition (
  id                   INT5                 not null,
  name                 VARCHAR(255)         null,
  studies_course_id    INT5                 null,
  constraint PK_PARTITION primary key (id)
);

/*==============================================================*/
/* Table: "partition-theme"                                     */
/*==============================================================*/
create table "partition-theme" (
  id                   INT5                 not null,
  partition_id         INT5                 null,
  theme_id             INT5                 null,
  num_questions        INT5                 null,
  "order"              INT1                 null,
  permissiability      INT2                 null,
  distance             INT3                 null,
  max_ball             INT3                 null,
  min_ball             INT3                 null,
  constraint "PK_PARTITION-THEME" primary key (id)
);

/*==============================================================*/
/* Table: privs                                                 */
/*==============================================================*/
create table privs (
  id                   VARCHAR(11)          not null,
  name                 VARCHAR(30)          not null,
  description          VARCHAR(256)         null,
  constraint PK_PRIVS primary key (id)
);

/*==============================================================*/
/* Table: question                                              */
/*==============================================================*/
create table question (
  id                   INT                  not null,
  number               INT3                 null,
  theme_id             INT                  not null,
  question_type_id     INT                  not null,
  ball                 INT                  not null,
  text                 TEXT                 not null,
  constraint PK_QUESTION primary key (id)
);

/*==============================================================*/
/* Table: question_statistics                                   */
/*==============================================================*/
create table question_statistics (
  id                   INT                  not null,
  number_exam_for_theme INT                  null default NULL,
  number_exam_for_question INT                  null default NULL,
  number_corrects      INT                  null default NULL,
  number_incorrects    INT                  null default NULL,
  number_rejections    INT                  null default NULL,
  number_timeout       INT                  null default NULL,
  summ_ball_possible   INT                  null default NULL,
  summ_ball            INT                  null default NULL,
  question_id          INT                  not null,
  constraint PK_QUESTION_STATISTICS primary key (id)
);

/*==============================================================*/
/* Table: question_type                                         */
/*==============================================================*/
create table question_type (
  id                   INT                  not null,
  name                 VARCHAR(55)          not null,
  constraint PK_QUESTION_TYPE primary key (id)
);

/*==============================================================*/
/* Table: role_privs                                            */
/*==============================================================*/
create table role_privs (
  rolename             VARCHAR(30)          not null,
  privilege_id         VARCHAR(11)          not null,
  constraint PK_ROLE_PRIVS primary key (rolename, privilege_id)
);

/*==============================================================*/
/* Table: roles                                                 */
/*==============================================================*/
create table roles (
  rolename             VARCHAR(30)          not null,
  created_at           TIMESTAMP            not null default CURRENT_TIMESTAMP,
  printname            VARCHAR(30)          not null,
  constraint PK_ROLES primary key (rolename)
);

/*==============================================================*/
/* Table: shadow                                                */
/*==============================================================*/
create table shadow (
  username             VARCHAR(30)          not null,
  password             VARCHAR(512)         not null,
  constraint PK_SHADOW primary key (username)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student (
  id                   INT                  not null,
  username             VARCHAR(30)          null,
  groups_id            INT                  not null,
  constraint PK_STUDENT primary key (id)
);

/*==============================================================*/
/* Table: student_result                                        */
/*==============================================================*/
create table student_result (
  id                   INT                  not null,
  attempt              INT                  null,
  text                 VARCHAR(1024)        null,
  ball                 INT                  null,
  success_question     INT                  null,
  all_questions        INT                  null,
  time_start           TIMESTAMP            null,
  time_end             TIMESTAMP            null,
  student_task_id      INT                  null,
  constraint PK_STUDENT_RESULT primary key (id)
);

/*==============================================================*/
/* Table: student_statistics                                    */
/*==============================================================*/
create table student_statistics (
  id                   INT                  not null,
  number_exam_for_group INT                  null default NULL,
  number_exam_for_stud INT                  null default NULL,
  number_corrects      INT                  null default NULL,
  number_incorrects    INT                  null default NULL,
  number_rejections    INT                  null default NULL,
  number_timeout       INT                  null default NULL,
  summ_ball_possible   INT                  null default NULL,
  summ_ball            INT                  null default NULL,
  student_id           INT                  not null,
  constraint PK_STUDENT_STATISTICS primary key (id)
);

/*==============================================================*/
/* Table: student_task                                          */
/*==============================================================*/
create table student_task (
  id                   INT                  not null,
  student_id           INT                  not null,
  examination_ticket_id INT                  not null,
  constraint PK_STUDENT_TASK primary key (id)
);

/*==============================================================*/
/* Table: studies_course                                        */
/*==============================================================*/
create table studies_course (
  id                   INT                  not null,
  username             VARCHAR(30)          null,
  name                 VARCHAR(30)          not null,
  description          VARCHAR(2048)        null,
  date_start           TIMESTAMP            null,
  date_end             TIMESTAMP            null,
  state                INT                  null,
  instructor           VARCHAR(30)          null,
  constraint PK_STUDIES_COURSE primary key (id)
);

/*==============================================================*/
/* Table: task_answer                                           */
/*==============================================================*/
create table task_answer (
  id                   INT                  not null,
  ticket_questions_id  INT                  not null,
  answer_id            INT                  not null,
  text                 VARCHAR(1024)        null,
  student_task_id      INT                  null,
  constraint PK_TASK_ANSWER primary key (id)
);

/*==============================================================*/
/* Table: theme                                                 */
/*==============================================================*/
create table theme (
  id                   INT                  not null,
  parent               INT                  null default NULL,
  name                 VARCHAR(55)          not null,
  creator_name         VARCHAR(30)          not null,
  rgt                  INT                  not null,
  lft                  INT                  not null,
  constraint PK_THEME primary key (id)
);

/*==============================================================*/
/* Table: ticket_questions                                      */
/*==============================================================*/
create table ticket_questions (
  id                   INT                  not null,
  number               INT3                 null,
  question_id          INT                  not null,
  examination_ticket_id INT5                 null,
  constraint PK_TASK_QUESTIONS primary key (id)
);

/*==============================================================*/
/* Table: user_roles                                            */
/*==============================================================*/
create table user_roles (
  username             VARCHAR(30)          not null,
  rolename             VARCHAR(30)          not null,
  constraint PK_USER_ROLES primary key (username, rolename)
);

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users (
  username             VARCHAR(30)          not null,
  created_at           TIMESTAMP            not null default CURRENT_TIMESTAMP,
  activation           VARCHAR(1)           not null default '0',
  first_name           VARCHAR(255)         not null,
  last_name            VARCHAR(255)         not null,
  gender               VARCHAR(1)           null,
  email                VARCHAR(255)         null,
  phone                VARCHAR(255)         null,
  activation_key       VARCHAR(255)         null,
  params               VARCHAR(4096)        null,
  constraint PK_USERS primary key (username)
);

alter table answer
  add constraint fk_answer_question foreign key (question_id)
references question (id)
on delete restrict on update restrict;

alter table exam
  add constraint FK_EXAM_EXAM_GROU_GROUP_CO foreign key (group_course_id)
references group_course (id)
on delete restrict on update restrict;

alter table exam
  add constraint FK_EXAM_FK_EXAM_M_PARTITIO foreign key (partition_id)
references partition (id)
on delete restrict on update restrict;

alter table examination_ticket
  add constraint fk_exam_ticket_exam foreign key (exam_id)
references exam (id)
on delete restrict on update restrict;

alter table group_course
  add constraint FK_GROUP_CO_FK_GROUP__GROUPS foreign key (groups_id)
references groups (id)
on delete restrict on update restrict;

alter table group_course
  add constraint fk_grp_course_stud_course foreign key (studies_course_id)
references studies_course (id)
on delete restrict on update restrict;

alter table logs
  add constraint fk_logs_users foreign key (username)
references users (username)
on delete restrict on update restrict;

alter table partition
  add constraint FK_PARTITIO_FK_MODUL__STUDIES_ foreign key (studies_course_id)
references studies_course (id)
on delete restrict on update restrict;

alter table "partition-theme"
  add constraint "FK_PARTITIO_FK_MODUL-_THEME" foreign key (theme_id)
references theme (id)
on delete restrict on update restrict;

alter table "partition-theme"
  add constraint FK_PARTITIO_FK_MODUL__PARTITIO foreign key (partition_id)
references partition (id)
on delete restrict on update restrict;

alter table question
  add constraint fk_question_question_type foreign key (question_type_id)
references question_type (id)
on delete cascade on update cascade;

alter table question
  add constraint fk_question_theme foreign key (theme_id)
references theme (id)
on delete cascade on update cascade;

alter table question_statistics
  add constraint fk_question_id foreign key (question_id)
references question (id)
on delete cascade on update cascade;

alter table role_privs
  add constraint FK_role_privs_privs foreign key (privilege_id)
references privs (id)
on delete cascade on update cascade;

alter table role_privs
  add constraint FK_role_privs_roles foreign key (rolename)
references roles (rolename)
on delete restrict on update restrict;

alter table shadow
  add constraint fk_shadow_users foreign key (username)
references users (username)
on delete cascade on update cascade;

alter table student
  add constraint fk_student_edu_group foreign key (groups_id)
references groups (id)
on delete cascade on update cascade;

alter table student
  add constraint fk_student_person foreign key (username)
references users (username)
on delete cascade on update cascade;

alter table student_result
  add constraint fk_student_res_student_task foreign key (student_task_id)
references student_task (id)
on delete restrict on update restrict;

alter table student_statistics
  add constraint fk_student_id foreign key (student_id)
references student (id)
on delete cascade on update cascade;

alter table student_task
  add constraint fk_student_task_exam_ticket foreign key (examination_ticket_id)
references examination_ticket (id)
on delete restrict on update restrict;

alter table student_task
  add constraint fk_student_task_student foreign key (student_id)
references student (id)
on delete restrict on update restrict;

alter table studies_course
  add constraint FK_STUDIES__FK_STUDIE_USERS foreign key (username)
references users (username)
on delete restrict on update restrict;

alter table task_answer
  add constraint FK_TASK_ANS_REFERENCE_STUDENT_ foreign key (student_task_id)
references student_task (id)
on delete restrict on update restrict;

alter table task_answer
  add constraint fk_task_answer_answer foreign key (answer_id)
references answer (id)
on delete cascade on update cascade;

alter table task_answer
  add constraint fk_task_answer_task_questions foreign key (ticket_questions_id)
references ticket_questions (id)
on delete cascade on update cascade;

alter table theme
  add constraint fk_theme_theme foreign key (parent)
references theme (id)
on delete cascade on update cascade;

alter table theme
  add constraint fk_theme_user foreign key (creator_name)
references users (username)
on delete cascade on update cascade;

alter table ticket_questions
  add constraint fk_task_quest_question foreign key (question_id)
references question (id)
on delete cascade on update cascade;

alter table ticket_questions
  add constraint fk_task_quest_student_task foreign key (examination_ticket_id)
references examination_ticket (id)
on delete cascade on update cascade;

alter table user_roles
  add constraint fk_user_roles_roles foreign key (rolename)
references roles (rolename)
on delete cascade on update cascade;

alter table user_roles
  add constraint fk_user_roles_users foreign key (username)
references users (username)
on delete cascade on update cascade;

