create table wg_test( id int primary key AUTO_INCREMENT, name varchar(100), remark varchar(100) );

create table wg_config(id int primary key AUTO_INCREMENT, config_key varchar(100), config_value varchar(100) ,is_valid varchar(1));

create table wg_dictionary(id int primary key AUTO_INCREMENT, dic_group varchar(100),parent_key varchar(100), dic_key varchar(100), dic_value varchar(100), is_valid varchar(1));

create table wg_documents(id int primary key AUTO_INCREMENT,file_type varchar(20),doc_name varchar(200),doc_path varchar(200),doc_content_ref int, status varchar(10));

create table wg_blob_data(id int primary key AUTO_INCREMENT, name varchar(100), content blob);

create table wg_html(id int primary key AUTO_INCREMENT, path varchar(100),html_content varchar(4000));


CREATE TABLE formtable_main_2 (id int primary key AUTO_INCREMENT,requestId int,	fwh varchar(200),	fwdw,int,	jj int,	sfgk int,	qfr int,	zw int,	zs varchar(200),	zbdw int ,	ngr int ,	hbdw text ,	hbr text ,	fj text ,	dz int ,	yfrq char(10) ,	jd int ,	dyfs int ,	bz text ,	ld varchar(2000) ,	sfxyldsy int ,	fwzl int ,	ljxz int ,	czshczz varchar(2000) ,	bgszr varchar(2000) ,	hhbr varchar(100) ,	bgszrrlzy text ,	qz varchar(200) ,	qzx text ,	fwh1 int ,	fwh2 int ,	fwh3 varchar(200) ,	xgtalc int ,	xgtalcbdjm varchar(1000) ,	sfgkwb varchar(200) ,	sfxyhb int ,	yjml int ,	ejml int ,	sjml int ,	hbcs varchar(2000) ,	hbcsczz varchar(2000) ,	ldqz varchar(999) ,	zwbt varchar(999) ,	fjbt varchar(999) ,	fjInputStream varchar(20000) ,	 zwInputStream varchar(20000))
