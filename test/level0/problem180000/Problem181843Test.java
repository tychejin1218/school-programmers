package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181843Test {

  @Test
  void solution01() {

    // Given
    String my_string = "banana";
    String target = "ana";
    int expected = 1;

    // When
    int result = new Problem181843().solution(my_string, target);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "banana";
    String target = "wxyz";
    int expected = 0;

    // When
    int result = new Problem181843().solution(my_string, target);

    // Then
    assertEquals(expected, result);
  }
}
