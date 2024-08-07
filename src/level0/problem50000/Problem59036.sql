CREATE TABLE ANIMAL_INS
(
    ANIMAL_ID        VARCHAR(200) NOT NULL,
    ANIMAL_TYPE      VARCHAR(200) NOT NULL,
    DATETIME         DATETIME     NOT NULL,
    INTAKE_CONDITION VARCHAR(200) NOT NULL,
    NAME             VARCHAR(200),
    SEX_UPON_INTAKE  VARCHAR(200) NOT NULL
);



DELETE
FROM ANIMAL_INS;



INSERT
INTO ANIMAL_INS
(ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE)
VALUES ('A365172', 'Dog', '2014-08-26 12:53:00', 'Normal', 'Diablo', 'Neutered Male'),
       ('A367012', 'Dog', '2015-09-16 09:06:00', 'Sick', 'Miller', 'Neutered Male'),
       ('A365302', 'Dog', '2017-01-08 16:34:00', 'Aged', 'Minnie', 'Spayed Female'),
       ('A381217', 'Dog', '2017-07-08 09:41:00', 'Sick', 'Cherokee', 'Neutered Male');



SELECT ANIMAL_ID
     , NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID ASC;
