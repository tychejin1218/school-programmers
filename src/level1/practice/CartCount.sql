/*
문제 : 각 상품 종류를 담은 장바구니 수 조회

[테이블 구조]
cart_products
- id        : 테이블 아이디
- cart_id   : 장바구니 아이디
- name      : 상품 종류
- price     : 가격

[문제 설명]
각 상품 종류를 담은 장바구니가 몇 개인지 조회합니다.
한 장바구니가 같은 상품을 여러 번 담아도 해당 장바구니는 1개로 카운트합니다.
결과는 상품 종류(name) 기준 사전 순(알파벳 오름차순) 정렬합니다.

[출력 컬럼]
- name  : 상품 종류
- count : 해당 상품을 담은 장바구니 수

[핵심 포인트]
- GROUP BY name: 상품 종류별로 묶음
- COUNT(DISTINCT cart_id): 같은 장바구니 중복 제거 후 카운트
- ORDER BY name: 사전 순 정렬

[면접 포인트]
Q. COUNT(cart_id)와 COUNT(DISTINCT cart_id)의 차이는?
A. COUNT(cart_id)는 단순 행 수를 셉니다.
   한 장바구니에 같은 상품이 3번 들어있으면 3으로 카운트됩니다.
   COUNT(DISTINCT cart_id)는 중복을 제거하고 카운트하므로
   같은 장바구니가 몇 번 등장해도 1로 카운트됩니다.
Q. DISTINCT의 시간복잡도는?
A. 내부적으로 정렬 또는 해시를 사용하므로 O(n log n) 또는 O(n)입니다.
   대용량 데이터에서는 인덱스 설계가 성능에 큰 영향을 줍니다.
*/

SELECT name,
       COUNT(DISTINCT cart_id) AS count
FROM cart_products
GROUP BY name
ORDER BY name;
