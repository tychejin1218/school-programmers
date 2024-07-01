package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181910Test {

  @Test
  void solution01() {

    // Given
    String my_string = "ProgrammerS123";
    int n = 11;
    String expected = "grammerS123";

    // When
    String result = new Problem181910().solution(my_string, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "He110W0r1d";
    int n = 5;
    String expected = "W0r1d";

    // When
    String result = new Problem181910().solution(my_string, n);

    // Then
    assertEquals(expected, result);
  }
}
