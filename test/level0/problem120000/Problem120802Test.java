package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120802Test {

  @Test
  void solution01() {

    // Given
    int num1 = 2;
    int num2 = 3;
    int expected = 5;

    // When
    int result = new Problem120802().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 100;
    int num2 = 2;
    int expected = 102;

    // When
    int result = new Problem120802().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
