package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181873Test {

  @Test
  void solution01() {

    // Given
    String my_string = "programmers";
    String alp = "p";
    String expected = "Programmers";

    // When
    String result = new Problem181873().solution(my_string, alp);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "lowercase";
    String alp = "x";
    String expected = "lowercase";

    // When
    String result = new Problem181873().solution(my_string, alp);

    // Then
    assertEquals(expected, result);
  }
}
