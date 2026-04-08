/*
문제 : 각 유저의 결제 이력 조회

[테이블 구조]
carts
- id            : 장바구니 아이디
- user_id       : 장바구니를 만든 유저 아이디
- payed_at      : 결제일
- product_count : 장바구니에 담긴 상품 수

cart_products
- id      : 테이블 아이디
- cart_id : 장바구니 아이디
- name    : 상품 종류
- price   : 가격

[문제 설명]
각 유저의 결제 횟수와 결제 금액을 조회합니다.
결과는 유저 아이디 오름차순으로 정렬합니다.

[출력 컬럼]
- user_id       : 유저 아이디
- payment_count : 결제 횟수 (장바구니 수)
- total_amount  : 결제 금액 합계 (상품 가격 합산)

[핵심 포인트]
- JOIN: carts.id = cart_products.cart_id 로 두 테이블 연결
- COUNT(DISTINCT c.id): 결제 횟수 (장바구니 1개 = 결제 1번)
- SUM(cp.price): 상품 가격 합산
- GROUP BY c.user_id: 유저별로 집계
- ORDER BY c.user_id: 유저 아이디 오름차순 정렬

[면접 포인트]
Q. INNER JOIN과 LEFT JOIN 중 왜 INNER JOIN을 선택했나요?
A. 결제 이력이 있는 유저만 조회하면 되므로 INNER JOIN이 적합합니다.
   LEFT JOIN을 사용하면 cart_products가 없는 장바구니(상품 미존재)도 포함되어
   total_amount가 NULL이 될 수 있습니다.
Q. COUNT(DISTINCT c.id)를 사용한 이유는?
A. 한 장바구니에 여러 상품이 있으면 JOIN 결과에 동일한 cart가 여러 행으로 나타납니다.
   DISTINCT 없이 COUNT(c.id)를 사용하면 상품 수만큼 중복 카운트됩니다.
Q. JOIN 성능을 높이려면?
A. carts.id, cart_products.cart_id에 인덱스를 설정하면 JOIN 속도를 크게 높일 수 있습니다.
*/

SELECT c.user_id,
       COUNT(DISTINCT c.id) AS payment_count,
       SUM(cp.price)        AS total_amount
FROM carts c
         JOIN cart_products cp ON c.id = cp.cart_id
GROUP BY c.user_id
ORDER BY c.user_id;
