package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181904Test {

  @Test
  void solution01() {

    // Given
    String my_string = "ihrhbakrfpndopljhygc";
    int m = 4;
    int c = 2;
    String expected = "happy";

    // When
    String result = new Problem181904().solution(my_string, m, c);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "programmers";
    int m = 1;
    int c = 1;
    String expected = "programmers";

    // When
    String result = new Problem181904().solution(my_string, m, c);

    // Then
    assertEquals(expected, result);
  }
}
