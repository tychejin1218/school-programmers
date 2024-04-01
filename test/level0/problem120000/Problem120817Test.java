package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120817Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double expected = 5.5;

    // When
    double result = new Problem120817().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
