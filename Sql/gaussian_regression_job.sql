create table if not exists gaussian_regression_job(
gr_device_id Integer not null,
gr_device_name varchar(255) null,
gr_device_registry varchar(255) null,
gr_device_start_time varchar(255) null,
gr_device_approved_time varchar(255) null,
gr_device_owner varchar(255) null,
authorized_device char null,
time_out_in_seconds varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint gaussian_regression_job_pk primary key(gr_device_id));