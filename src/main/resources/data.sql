insert into users (id, username, email, title, phone, image_url, user_code, password, verified, locked, acc_cred_expired) values
(1, 'Dmitriy', 'fuckoff02@mail.ru', 'Java developer', '+90352332', 'http://someurl', '523j3j', 'pass', true, false, false),
(2, 'Mary', 'kotik@mail.ru', 'QA', '+90352733', 'http://someurl', '08328fvjaw', 'pass1', false, false, false);

INSERT into AUTHORITIES(username, authority) values ('Dmitriy','ADMIN');
INSERT into AUTHORITIES(username, authority) values ('Mary','USER');
