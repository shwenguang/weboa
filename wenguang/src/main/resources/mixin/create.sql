create table wg_test( id int primary key AUTO_INCREMENT, name varchar(100), remark varchar(100) );

create table wg_config(id int primary key AUTO_INCREMENT, config_key varchar(100), config_value varchar(100) ,is_valid varchar(1));

create table wg_dictionary(int int primary key AUTO_INCREMENT, dic_group varchar(100), dic_name varchar(100), dic_value varchar(100), is_valid varchar(1));