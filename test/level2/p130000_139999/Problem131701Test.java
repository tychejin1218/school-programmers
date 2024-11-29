package level2.p130000_139999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem131701Test {

  @Test
  void solution01() {

    // Given
    int[] elements = {7, 9, 1, 1, 4};
    int expected = 18;

    // When
    int result = new Problem131701().solution(elements);

    // Then
    assertEquals(expected, result);
  }
}
