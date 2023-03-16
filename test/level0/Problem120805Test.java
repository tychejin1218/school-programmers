package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120805Test {

  @Test
  void solution01() {

    // Given
    int num1 = 10;
    int num2 = 5;
    int expected = 2;

    // When
    int result = new Problem120805().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 7;
    int num2 = 2;
    int expected = 3;

    // When
    int result = new Problem120805().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
