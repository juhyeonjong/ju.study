# 1. 관리자로 접속한다.
# 2. 데이터베이스를 먼저 만든다
CREATE DATABASE springPractice;

# 3-1. 해당 디비에 접속할 계정을 만든다. 
CREATE USER 'dongtester'@'%' IDENTIFIED BY '1234';
GRANT ALL privileges on springPractice.* to 'dongtester'@'%';
# 3-2. 또는 기존 유저에 권한을 부여한다. (이번엔 이걸로)
GRANT ALL privileges on springPractice.* to 'tester'@'%';

#4. 테이블 생성
use springPractice;

CREATE TABLE user(
	userid varchar(30) not null primary key,
    password varchar(300) not null,
    name varchar(30) not null,
    enabled int default '1',
    authority varchar(30) default 'ROLE_USER',
    phone varchar(13),
    address varchar(100),
    email varchar(50) not null,
    rdate timestamp not null comment '가입일'
);

CREATE TABLE board(
	bno int unsigned not null primary key comment '게시물번호',
    btype varchar(10) not null comment '게시판분류',
    btitle varchar(200) not null comment '제목',
    bcontent text not null comment '내용',
    rdate timestamp not null comment '게시일',
    bhit int unsigned comment '조회수',
    delyn char(1) comment '삭제유무',
    userid varchar(30) not null comment '유저아이디',
    foreign key(userid) references user(userid) ON DELETE CASCADE
);

CREATE TABLE boardAttach (
	bfno int unsigned not null primary key comment '파일번호',
    bno int unsigned not null comment '게시물번호',
    bfrealnm varchar(100) not null comment '실제파일명',
    bforiginnm varchar(100) not null comment '저장파일명',
    rdate timestamp not null comment '저장일',
    foreign key(bno) references board(bno) ON DELETE CASCADE
);

CREATE TABLE reply(
	rno int unsigned not null primary key comment '댓글번호',
	userid varchar(30) not null comment '유저아이디',
    bno int unsigned not null comment '게시물번호',
    rcontent text not null comment '댓글내용',
    rdate timestamp not null comment '작성일',
    foreign key(userid) references user(userid) ON DELETE CASCADE,
    foreign key(bno) references board(bno) ON DELETE CASCADE
);


# 관리자 추가 (비번은 1234)
INSERT INTO user(userid, password, name, enabled, authority, phone, address, email, rdate) 
VALUES('admin2', '$2a$10$3oqSHgDITBp72VVUtnRLX.v5yNOA652lKllAQfQhNUpLI5F/b90hG', '관리자', 1, 'ROLE_ADMIN', '010-1111-2222', '전북 전주시', 'abc@abc.com', now());
