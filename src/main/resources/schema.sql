create table if not exists user (
	id number primary key auto_increment,
	name varchar(255),
	email varchar(255),
	title varchar(255),
	phone varchar(255),
	image_url varchar(255),
	user_code varchar(255)
);
