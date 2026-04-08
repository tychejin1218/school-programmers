/*
문제 : 지점별 총급여액 조회

[테이블 구조]
employees
- id        : 직원 아이디
- name      : 직원 이름
- salary    : 급여
- branch_id : 소속 지점 아이디

[문제 설명]
지점별 총급여액이 얼마인지 조회합니다.
결과는 지점 아이디(branch_id) 오름차순으로 정렬합니다.

[출력 컬럼]
- branch_id : 지점 아이디
- total     : 지점별 총급여액 합계

[예시]
branch_id 15: 총급여 180
branch_id 16: 총급여 330 + 280 = 610
branch_id 17: 총급여 280

[핵심 포인트]
- GROUP BY branch_id: 지점별로 묶음
- SUM(salary): 지점별 급여 합산
- ORDER BY branch_id: 지점 아이디 오름차순 정렬

[면접 포인트]
Q. GROUP BY와 WHERE의 차이는?
A. WHERE는 GROUP BY 이전에 행을 필터링합니다.
   GROUP BY 이후 집계 결과를 필터링하려면 HAVING을 사용합니다.
   예) 총급여가 300 이상인 지점만 조회:
       SELECT branch_id, SUM(salary) AS total
       FROM employees
       GROUP BY branch_id
       HAVING SUM(salary) >= 300
       ORDER BY branch_id;

Q. SUM과 COUNT의 차이는?
A. SUM은 특정 컬럼의 값을 모두 더합니다.
   COUNT는 행의 수를 셉니다. (NULL 제외)
*/

SELECT branch_id,
       SUM(salary) AS total
FROM employees
GROUP BY branch_id
ORDER BY branch_id;
