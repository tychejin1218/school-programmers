package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181881Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 3, 100, 99, 98};
    int expected = 5;

    // When
    int result = new Problem181881().solution(arr);

    // Then
    assertEquals(expected, result);
  }
}
