package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181911Test {

  @Test
  void solution01() {

    // Given
    String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
    int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
    String expected = "programmers";

    // When
    String result = new Problem181911().solution(my_string, parts);

    // Then
    assertEquals(expected, result);
  }
}
