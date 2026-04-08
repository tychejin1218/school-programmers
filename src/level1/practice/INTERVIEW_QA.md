# 코딩테스트 면접 Q&A 정리

---

## 1. 나머지 한 점의 좌표 (`RemainingPoint.java`)

**Q. 어떤 아이디어로 풀었나요?**
> 직사각형의 4꼭짓점에서 x좌표, y좌표는 각각 2가지 값이 2번씩 등장합니다.
> 3개의 점 중 1번만 등장하는 x값과 y값을 찾으면 그것이 빠진 점의 좌표입니다.

**Q. 왜 if-else로 비교했나요? HashMap이나 XOR을 쓰면 안 되나요?**
> 입력이 항상 3개로 고정이므로 if-else가 가장 직관적이고 빠릅니다.
> - HashMap: 키 저장/조회 오버헤드가 생기고, 이 문제에서는 과도한 복잡성입니다.
> - XOR: `a ^ a = 0`, `a ^ 0 = a` 원리로 홀수 번 등장한 값을 구할 수 있지만, 가독성이 낮습니다.
> 셋 다 O(1)이므로 성능 차이는 없고, 가장 읽기 쉬운 if-else를 선택했습니다.

**Q. 시간복잡도, 공간복잡도는?**
> - 시간복잡도: O(1) — 입력이 항상 3개로 고정
> - 공간복잡도: O(1) — 추가 자료구조 없이 변수만 사용

---

## 2. 과속 단속 (`SpeedCamera.java`)

**Q. 어떤 아이디어로 풀었나요?**
> 인접한 두 카메라 사이의 평균속도 = 거리 / 시간을 계산하고,
> 평균속도가 제한속도를 초과하면 과속으로 카운트합니다.

**Q. 왜 `distance / time > speed_limit` 대신 `distance > speed_limit * time`을 사용했나요?**
> 정수 나눗셈 시 소수점이 잘려 오차가 발생할 수 있기 때문입니다.
> ```
> 예) distance=91, time=3, speed_limit=30
>     91 / 3 = 30 (int 나눗셈, 소수점 절사) → 과속 미감지 오류
>     91 > 30 * 3 = 91 > 90 → true → 과속 정상 감지
> ```
> 양변에 time을 곱하면 정수 연산만으로 정확하게 비교할 수 있습니다.

**Q. 왜 0km/시각0을 cameras 배열 밖에서 처리했나요?**
> 제한 사항에서 `cameras[i][0]`(카메라 위치)은 1 이상이므로,
> 0km 지점은 cameras 배열에 포함되지 않습니다.
> `prevPosition=0`, `prevTime=0`으로 초기화하여 첫 구간(0km → 첫 카메라)도 정확히 계산합니다.

**Q. Stream으로 리팩토링할 수 있나요?**
> 적합하지 않습니다.
> `prevPosition`, `prevTime`을 매 반복마다 변경해야 하는데,
> Stream 내부에서 외부 상태를 변경하는 것은 사이드 이펙트 안티패턴입니다.
> 특히 병렬 스트림에서 데이터 경쟁(race condition)이 발생할 수 있어 위험합니다.

**Q. 시간복잡도, 공간복잡도는?**
> - 시간복잡도: O(n) — cameras 배열을 한 번 순회
> - 공간복잡도: O(1) — 추가 자료구조 없이 변수만 사용

---

## 3. Verbal Memory 게임 (`VerbalMemory.java`)

**Q. 어떤 아이디어로 풀었나요?**
> HashMap에 단어별 첫 등장 라운드를 저장합니다.
> - 단어가 없으면 → 현재 라운드 번호 저장 후 반환 (첫 등장)
> - 단어가 있으면 → 저장된 라운드 번호 반환 (이전 등장)

**Q. 왜 HashMap을 사용했나요?**
> 단어의 첫 등장 라운드를 key-value로 저장하고 O(1)로 조회할 수 있기 때문입니다.
> 배열로 구현하면 매번 O(n) 탐색이 필요해 최악의 경우 O(n²)이 됩니다.
> 라운드가 최대 200,000개이므로 O(1) 조회가 필수적입니다.

**Q. HashMap의 시간복잡도는?**
> - 평균: O(1) — 해시 함수로 바로 접근
> - 최악: O(n) — 해시 충돌이 모두 발생한 경우 (실무에서는 거의 없음)

**Q. 왜 반환 타입이 `long[]`인가요?**
> 라운드 수가 최대 200,000으로 int 범위(약 21억) 내에 있어 int로도 충분하지만,
> 문제에서 long 타입을 요구하므로 `long[]`으로 반환합니다.

**Q. Stream으로 리팩토링할 수 있나요?**
> `computeIfAbsent`를 활용하면 가능합니다.
> ```java
> HashMap<String, Long> firstAppearMap = new HashMap<>();
> return IntStream.range(0, words.length)
>     .mapToLong(i -> firstAppearMap.computeIfAbsent(words[i], key -> (long)(i + 1)))
>     .toArray();
> ```
> `computeIfAbsent`: key가 없으면 람다로 값을 계산해서 put 후 반환, 있으면 기존 값 반환.
> 단, 외부 상태(HashMap)를 변경하므로 **반드시 순차 스트림**으로만 사용해야 합니다.

---

## 4. 지점별 총급여액 (`BranchSalary.sql`)

**Q. 어떤 아이디어로 풀었나요?**
> `GROUP BY branch_id`로 지점별로 묶고, `SUM(salary)`로 급여를 합산합니다.

**Q. GROUP BY와 WHERE의 차이는?**
> - `WHERE`: GROUP BY **이전**에 행을 필터링합니다.
> - `HAVING`: GROUP BY **이후** 집계 결과를 필터링합니다.
> ```sql
> -- 총급여가 300 이상인 지점만 조회
> SELECT branch_id, SUM(salary) AS total
> FROM employees
> GROUP BY branch_id
> HAVING SUM(salary) >= 300
> ORDER BY branch_id;
> ```

**Q. SUM과 COUNT의 차이는?**
> - `SUM`: 특정 컬럼의 값을 모두 더합니다.
> - `COUNT`: 행의 수를 셉니다. (NULL 제외)

---

## 5. 장바구니 상품 종류별 개수 (`CartCount.sql`)

**Q. `COUNT(cart_id)`와 `COUNT(DISTINCT cart_id)`의 차이는?**
> - `COUNT(cart_id)`: 단순 행 수를 셉니다.
>   한 장바구니에 같은 상품이 3번 들어있으면 3으로 카운트됩니다.
> - `COUNT(DISTINCT cart_id)`: 중복을 제거하고 카운트합니다.
>   같은 장바구니가 몇 번 등장해도 1로 카운트됩니다.
> 이 문제에서는 장바구니 단위로 세야 하므로 `DISTINCT`가 필수입니다.

**Q. DISTINCT의 시간복잡도는?**
> 내부적으로 정렬(O(n log n)) 또는 해시(O(n))를 사용합니다.
> 대용량 데이터에서는 인덱스 설계가 성능에 큰 영향을 줍니다.

---

## 6. 유저 결제 이력 (`UserPayment.sql`)

**Q. INNER JOIN과 LEFT JOIN 중 왜 INNER JOIN을 선택했나요?**
> 결제 이력이 있는 유저만 조회하면 되므로 INNER JOIN이 적합합니다.
> LEFT JOIN을 사용하면 `cart_products`가 없는 장바구니도 포함되어
> `total_amount`가 NULL이 될 수 있습니다.

**Q. `COUNT(DISTINCT c.id)`를 사용한 이유는?**
> 한 장바구니에 여러 상품이 있으면 JOIN 결과에 동일한 cart가 여러 행으로 나타납니다.
> DISTINCT 없이 `COUNT(c.id)`를 사용하면 상품 수만큼 중복 카운트됩니다.

**Q. JOIN 성능을 높이려면?**
> `carts.id`, `cart_products.cart_id`에 인덱스를 설정하면 JOIN 속도를 높일 수 있습니다.
> 일반적으로 PK(Primary Key)는 자동으로 인덱스가 생성되고,
> FK(Foreign Key)인 `cart_id`에 별도로 인덱스를 추가하는 것이 좋습니다.

**Q. 실무에서 JOIN은 자주 사용하나요?**
> 매우 자주 사용합니다. 실무 빈도 순서:
> 1. `INNER JOIN` / `JOIN` — 양쪽 모두 일치하는 데이터만
> 2. `LEFT JOIN` — 왼쪽 테이블 기준, 오른쪽 없으면 NULL
> 3. `RIGHT JOIN` — 잘 사용하지 않음 (LEFT JOIN으로 대체 가능)
> 4. `FULL OUTER JOIN` — 드물게 사용
