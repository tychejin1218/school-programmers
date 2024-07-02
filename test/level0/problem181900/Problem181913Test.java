package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181913Test {

  @Test
  void solution01() {

    // Given
    String my_string = "rermgorpsam";
    int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
    String expected = "programmers";

    // When
    String result = new Problem181913().solution(my_string, queries);

    // Then
    assertEquals(expected, result);
  }
}
