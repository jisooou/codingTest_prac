--USER,MISSION,ANALYSIS,ROUTINE,BOOKMARK,상태조사 

--시퀀스 삭제 
DROP SEQUENCE SEQ_MEMBER; 
DROP SEQUENCE SEQ_MISSION; 
DROP SEQUENCE SEQ_ANALYSIS; 
DROP SEQUENCE SEQ_ROUTINE; 
DROP SEQUENCE SEQ_BOOKMARK; 

--테이블 삭제
DROP TABLE MEMBER CASCADE CONSTRAINTS;
DROP TABLE MISSION CASCADE CONSTRAINTS;
DROP TABLE ANALYSIS CASCADE CONSTRAINTS;
DROP TABLE ROUTINE CASCADE CONSTRAINTS;
DROP TABLE BOOKMARK CASCADE CONSTRAINTS;

--시퀀스 생성
CREATE SEQUENCE SEQ_MEMBER NOCACHE NOCYCLE; 
CREATE SEQUENCE SEQ_MISSION NOCACHE NOCYCLE; 
CREATE SEQUENCE SEQ_ANALYSIS NOCACHE NOCYCLE; 
CREATE SEQUENCE SEQ_ROUTINE NOCACHE NOCYCLE; 
CREATE SEQUENCE SEQ_BOOKMARK NOCACHE NOCYCLE; 

--테이블 생성
CREATE TABLE MEMBER (
	NO	            NUMBER		    PRIMARY KEY,
	ID	            VARCHAR2(50)	NOT NULL,
	NAME	        VARCHAR2(10)	NOT NULL,
	MISSION_DATE	TIMESTAMP		NOT NULL,
	MISSION_STATUS	CHAR(1)		    DEFAULT 'N' CHECK(MISSION_STATUS IN ('Y', 'N'))
);

CREATE TABLE MISSION (
	NO	        NUMBER		    PRIMARY KEY,
	MEMBER_NO	NUMBER		    NOT NULL,
	CATEGORY	VARCHAR2(10)	NOT NULL,
	NAME	    VARCHAR2(50)	NOT NULL,
	REVIEW	    VARCHAR2(30)	NOT NULL,
	PHOTO	    VARCHAR2(400)	NULL,
	STAMP	    VARCHAR(255)	NULL
);

CREATE TABLE ANALYSIS (
	ANAL_NO	    NUMBER		PRIMARY KEY,
	MEMBER_NO	NUMBER		NOT NULL,
	MISSION_NO	NUMBER		NOT NULL,
--    ROUTINE_NO가 루틴 추가 테이블인지, 마이미션 추가 테이블인지에 따라서 
--    ROUTINE_NO가 NULL인지 NOT NULL인지가 달라질듯. 
	ROUTINE_NO	NUMBER		NULL 
);

CREATE TABLE ROUTINE (
	ROUTINE_NO	NUMBER		    PRIMARY KEY,
	MEMBER_NO	NUMBER		    NOT NULL,
	NAME	    VARCHAR2(15)	NOT NULL,
	REPEAT_DAY	VARCHAR2(100)	NOT NULL,
	IS_ALARM	CHAR(1)		    DEFAULT 'N' CHECK(IS_ALARM IN ('Y', 'N')),
	CREATE_DAY	TIMESTAMP		DEFAULT CURRENT_TIMESTAMP,
--    ROUTINE NAME에 대한 제약조건 추가 
    CONSTRAINT NAME_LENGTH CHECK (LENGTH(NAME)<= 15)
);

CREATE TABLE BOOKMARK (
	BOOKMARK_NO	    NUMBER		PRIMARY KEY,
	MEMBER_NO	    NUMBER		NOT NULL,
	CREATE_DATE	    TIMESTAMP	NULL,
--  프론트가 POST_NO를 어떻게 처리하냐에 따라 POST_NO에 해당하는 제약조건CHECK를 추가하기    
	POST_NO	        NUMBER		
);

--외래키
--미나님 외래키 수정해 주세요-MISSION,상태조사 테이블
ALTER TABLE MISSION
ADD CONSTRAINT FK_MEMBER_TO_MISSION_1
FOREIGN KEY (MEMBER_NO)
REFERENCES MEMBER(NO);

ALTER TABLE ANALYSIS 
ADD CONSTRAINT FK_ANALYSIS_MEMBER
FOREIGN KEY (MEMBER_NO)
REFERENCES MEMBER(NO);

ALTER TABLE ANALYSIS
ADD CONSTRAINT FK_ANALYSIS_MISSION
FOREIGN KEY (MISSION_NO)
REFERENCES MISSION(NO);

ALTER TABLE ANALYSIS
ADD CONSTRAINT FK_ANALYSIS_ROUTINE
FOREIGN KEY (ROUTINE_NO)
REFERENCES ROUTINE(ROUTINE_NO);

ALTER TABLE ROUTINE 
ADD CONSTRAINT FK_ROUTINE_MEMBER_NO
FOREIGN KEY (MEMBER_NO)
REFERENCES MEMBER(NO);

ALTER TABLE BOOKMARK
ADD CONSTRAINT FK_BOOKMARK_MEMBER_NO
FOREIGN KEY (MEMBER_NO)
REFERENCES MEMBER(NO);