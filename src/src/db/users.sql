USER sampledb;  -- 자신이 사용할 데이터베이스명 기재

SELECT * FROM users;

CREATE TABLE users
(
	id varchar(20),
	NAME VARCHAR(30),
	PASSWORD VARCHAR(20)
);