create table if not exists users (
	id number primary key auto_increment,
	username varchar(255),
	email varchar(255),
	title varchar(255),
	phone varchar(255),
	image_url varchar(255),
	user_code varchar(255),
	password varchar(500) not null,
    verified boolean(1) not null,
    locked boolean(1) not null,
    acc_cred_expired boolean(1) not null
);

create table if not exists authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);
