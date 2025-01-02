/*
문제 : 경기도에 위치한 식품창고 목록 출력하기
출처 : https://school.programmers.co.kr/learn/courses/30/lessons/131114
*/

-- CREATE 문
CREATE TABLE FOOD_WAREHOUSE (
    WAREHOUSE_ID VARCHAR(10) NOT NULL,
    WAREHOUSE_NAME VARCHAR(20) NOT NULL,
    ADDRESS VARCHAR(100),
    TLNO VARCHAR(20),
    FREEZER_YN VARCHAR(1)
);

-- INSERT 문
INSERT
  INTO FOOD_WAREHOUSE (WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, TLNO, FREEZER_YN)
VALUES ('WH0001', '창고_경기1', '경기도 안산시 상록구 용담로 141', '031-152-1332', 'Y'),
       ('WH0002', '창고_충북1', '충청북도 진천군 진천읍 씨제이로 110', '043-623-9900', 'Y'),
       ('WH0003', '창고_경기2', '경기도 이천시 마장면 덕평로 811', '031-221-7241', NULL),
       ('WH0004', '창고_경기3', '경기도 김포시 대곶면 율생중앙로205번길', '031-671-1900', 'N'),
       ('WH0005', '창고_충남1', '충청남도 천안시 동남구 광덕면 신덕리1길 9', '041-876-5421', 'Y');

-- SELECT 문
SELECT WAREHOUSE_ID
     , WAREHOUSE_NAME
     , ADDRESS
    /*, CASE WHEN FREEZER_YN IS NULL THEN 'N'
           ELSE FREEZER_YN
       END AS FREEZER_YN*/
     , IFNULL(FREEZER_YN, 'N')
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '%경기도%'
ORDER BY WAREHOUSE_ID ASC;