package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120803Test {

  @Test
  void solution01() {

    // Given
    int num1 = 2;
    int num2 = 3;
    int expected = -1;

    // When
    int result = new Problem120803().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 100;
    int num2 = 2;
    int expected = 98;

    // When
    int result = new Problem120803().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
