package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120804Test {

  @Test
  void solution01() {

    // Given
    int num1 = 3;
    int num2 = 4;
    int expected = 12;

    // When
    int result = new Problem120804().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 27;
    int num2 = 19;
    int expected = 513;

    // When
    int result = new Problem120804().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
