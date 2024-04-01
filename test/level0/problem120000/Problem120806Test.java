package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120806Test {

  @Test
  void solution01() {

    // Given
    int num1 = 3;
    int num2 = 2;
    int expected = 1500;

    // When
    int result = new Problem120806().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 7;
    int num2 = 3;
    int expected = 2333;

    // When
    int result = new Problem120806().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int num1 = 1;
    int num2 = 16;
    int expected = 62;

    // When
    int result = new Problem120806().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
