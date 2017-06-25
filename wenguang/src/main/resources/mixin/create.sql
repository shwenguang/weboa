create table wg_test( id int primary key AUTO_INCREMENT, name varchar(100), remark varchar(100) );

create table wg_config(id int primary key AUTO_INCREMENT, config_key varchar(100), config_value varchar(100) ,is_valid varchar(1));

create table wg_dictionary(id int primary key AUTO_INCREMENT, dic_group varchar(100),parent_key varchar(100), dic_key varchar(100), dic_value varchar(100), is_valid varchar(1));

create table wg_documents(id int primary key AUTO_INCREMENT,file_type varchar(20),doc_name varchar(200),doc_path varchar(200),doc_content_ref int, status varchar(10));

create table wg_blob_data(id int primary key AUTO_INCREMENT, name varchar(100), content blob);

create table wg_html(id int primary key AUTO_INCREMENT, path varchar(100),html_content varchar(4000));



