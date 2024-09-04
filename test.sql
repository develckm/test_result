CREATE USER c##test IDENTIFIED BY oracle
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;

GRANT connect,resource,dba TO c##test;

-- 로그인 유저 테이블
CREATE TABLE c##test.member (
                                    id VARCHAR2(100) PRIMARY KEY,
                                    age NUMBER,
                                    pw VARCHAR2(100),
                                    name VARCHAR2(100),
                                    gender VARCHAR2(10),
                                    phone VARCHAR2(20)
);


INSERT INTO c##test.member (id, age, pw, name, gender, phone) VALUES ('aaa',38,'1234','테스터','female','010-0000-0000');
commit;

