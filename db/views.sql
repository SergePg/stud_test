create view v_sys_roles as
select 'ROLE_ADMIN' as sys_role_name
union
select 'ROLE_USER' as sys_role_name
;

create view v_sys_role_users as
select u.username,
       'ROLE_USER' as sys_role_name
  from users u
union
select u.username,
       'ROLE_ADMIN' as sys_role_name
  from users u
 where u.username ='a'
;

create view v_shadow as
select username, password
  from shadow
;

create view v_users as
select username, first_name, last_name, gender, email, phone, params, activation, activation_key
  from users
;

create view v_logs as
select username, domain, created_at, description
  from logs
;

create view v_login_log as
  select
    description as description,
    username as username,
    created_at as created_at
  from logs
  where domain='LOGIN'
;