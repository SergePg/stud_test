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
  text                 VARCHAR(1024)        null,
  question_id          INT                  not null,
  constraint PK_ANSWER primary key (id)
);

/*==============================================================*/
/* Table: edu_group                                             */
/*==============================================================*/
create table edu_group (
  id                   INT                  not null,
  name                 VARCHAR(25)          not null,
  instructor           VARCHAR(30)          not null,
  level                INT                  null,
  group_list_id        INT                  null,
  constraint PK_EDU_GROUP primary key (id)
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
  studies_course_id    INT                  null,
  examenator           VARCHAR(30)          not null,
  name                 VARCHAR(1024)        not null,
  description          VARCHAR(2048)        null,
  parameter            INT                  null,
  attempts             INT                  null,
  param_type           INT                  null,
  min_ball             INT                  null,
  max_ball             INT                  null,
  constraint PK_EXAM primary key (id)
);

/*==============================================================*/
/* Table: exam_tree_node                                        */
/*==============================================================*/
create table exam_tree_node (
  id                   INT                  not null,
  exam_id              INT                  not null,
  theme_id             INT                  not null,
  num_question         INT                  null,
  q_order              INT                  null,
  permissibility       INT                  null,
  distance             INT                  null,
  min_ball             INT                  null,
  max_ball             INT                  null,
  constraint PK_EXAM_TREE_NODE primary key (id)
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
  group_list_id        INT                  not null,
  constraint PK_GROUP_COURSE primary key (id)
);

/*==============================================================*/
/* Table: group_list                                            */
/*==============================================================*/
create table group_list (
  id                   INT                  not null default NULL,
  name                 VARCHAR(25)          not null,
  constraint PK_GROUP_LIST primary key (id)
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
/* Table: privs                                                 */
/*==============================================================*/
create table privs (
  id                   VARCHAR(30)          not null,
  name                 VARCHAR(30)          not null,
  description          VARCHAR(256)         null,
  constraint PK_PRIVS primary key (id)
);

/*==============================================================*/
/* Table: question                                              */
/*==============================================================*/
create table question (
  id                   INT                  not null,
  text                 TEXT                 not null,
  ball                 INT                  not null,
  question_type_id     INT                  not null,
  theme_id             INT                  not null,
  constraint PK_QUESTION primary key (id)
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
  privilege_id         VARCHAR(30)          not null,
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
  name                 VARCHAR(25)          not null,
  full_name            VARCHAR(100)         not null,
  username             VARCHAR(30)          null,
  group_list_id        INT                  not null,
  constraint PK_STUDENT primary key (id)
);

/*==============================================================*/
/* Table: student_result                                        */
/*==============================================================*/
create table student_result (
  id                   INT                  not null,
  text                 VARCHAR(1024)        null,
  ball                 INT                  null,
  success_question     INT                  null,
  all_questions        INT                  null,
  time_start           TIMESTAMP            null,
  time_end             TIMESTAMP            null,
  task_id              INT                  null,
  constraint PK_STUDENT_RESULT primary key (id)
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
  name                 VARCHAR(30)          not null,
  description          VARCHAR(2048)        null,
  date_start           TIMESTAMP            null,
  date_end             TIMESTAMP            null,
  state                INT                  null,
  constraint PK_STUDIES_COURSE primary key (id)
);

/*==============================================================*/
/* Table: task_answer                                           */
/*==============================================================*/
create table task_answer (
  id                   INT                  not null,
  task_questions_id    INT                  not null,
  answer_id            INT                  not null,
  text                 VARCHAR(1024)        null,
  constraint PK_TASK_ANSWER primary key (id)
);

/*==============================================================*/
/* Table: task_questions                                        */
/*==============================================================*/
create table task_questions (
  id                   INT                  not null,
  student_task_id      INT                  not null,
  question_id          INT                  not null,
  constraint PK_TASK_QUESTIONS primary key (id)
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

alter table edu_group
  add constraint fk_edu_group_group_list foreign key (group_list_id)
references group_list (id)
on delete restrict on update restrict;

alter table edu_group
  add constraint fk_edu_group_users foreign key (instructor)
references users (username)
on delete cascade on update cascade;

alter table exam
  add constraint fk_exam_studies_course foreign key (studies_course_id)
references studies_course (id)
on delete restrict on update restrict;

alter table exam
  add constraint fk_exam_users foreign key (examenator)
references users (username)
on delete restrict on update restrict;

alter table exam_tree_node
  add constraint fk_exam_tree_node_exam foreign key (exam_id)
references exam (id)
on delete restrict on update restrict;

alter table exam_tree_node
  add constraint fk_exam_tree_node_theme foreign key (theme_id)
references theme (id)
on delete restrict on update restrict;

alter table examination_ticket
  add constraint fk_exam_ticket_exam foreign key (exam_id)
references exam (id)
on delete restrict on update restrict;

alter table group_course
  add constraint fk_group_course_group_list foreign key (group_list_id)
references group_list (id)
on delete restrict on update restrict;

alter table group_course
  add constraint fk_grp_course_stud_course foreign key (studies_course_id)
references studies_course (id)
on delete restrict on update restrict;

alter table logs
  add constraint fk_logs_users foreign key (username)
references users (username)
on delete restrict on update restrict;

alter table question
  add constraint fk_question_question_type foreign key (question_type_id)
references question_type (id)
on delete cascade on update cascade;

alter table question
  add constraint fk_question_theme foreign key (theme_id)
references theme (id)
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
  add constraint fk_student_edu_group foreign key (group_list_id)
references edu_group (id)
on delete cascade on update cascade;

alter table student
  add constraint fk_student_person foreign key (username)
references users (username)
on delete cascade on update cascade;

alter table student_result
  add constraint fk_student_res_student_task foreign key (task_id)
references student_task (id)
on delete restrict on update restrict;

alter table student_task
  add constraint fk_student_task_exam_ticket foreign key (examination_ticket_id)
references examination_ticket (id)
on delete restrict on update restrict;

alter table student_task
  add constraint fk_student_task_student foreign key (student_id)
references student (id)
on delete restrict on update restrict;

alter table task_answer
  add constraint fk_task_answer_answer foreign key (answer_id)
references answer (id)
on delete cascade on update cascade;

alter table task_answer
  add constraint fk_task_answer_task_questions foreign key (task_questions_id)
references task_questions (id)
on delete cascade on update cascade;

alter table task_questions
  add constraint fk_task_quest_question foreign key (question_id)
references question (id)
on delete cascade on update cascade;

alter table task_questions
  add constraint fk_task_quest_student_task foreign key (student_task_id)
references student_task (id)
on delete cascade on update cascade;

alter table theme
  add constraint fk_theme_theme foreign key (parent)
references theme (id)
on delete cascade on update cascade;

alter table theme
  add constraint fk_theme_user foreign key (creator_name)
references users (username)
on delete cascade on update cascade;

alter table user_roles
  add constraint fk_user_roles_roles foreign key (rolename)
references roles (rolename)
on delete cascade on update cascade;

alter table user_roles
  add constraint fk_user_roles_users foreign key (username)
references users (username)
on delete cascade on update cascade;

