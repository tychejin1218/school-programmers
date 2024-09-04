package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem82612Test {

  @Test
  void solution01() {

    // Given
    int price = 3;
    int money = 20;
    int count = 4;
    int expected = 10;

    // When
    long result = new Problem82612().solution(price, money, count);

    // Then
    assertEquals(expected, result);
  }
}
