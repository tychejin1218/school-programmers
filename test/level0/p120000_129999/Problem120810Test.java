package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120810Test {

  @Test
  void solution01() {

    // Given
    int num1 = 3;
    int num2 = 2;
    int expected = 1;

    // When
    int result = new Problem120810().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 10;
    int num2 = 5;
    int expected = 0;

    // When
    int result = new Problem120810().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
