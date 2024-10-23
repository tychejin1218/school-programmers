package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120833Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3, 4, 5};
    int num1 = 1;
    int num2 = 3;
    int[] expected = {2, 3, 4};

    // When
    int[] result = new Problem120833().solution(numbers, num1, num2);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {1, 3, 5};
    int num1 = 1;
    int num2 = 2;
    int[] expected = {3, 5};

    // When
    int[] result = new Problem120833().solution(numbers, num1, num2);

    // Then
    assertArrayEquals(expected, result);
  }
}
