package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181907Test {

  @Test
  void solution01() {

    // Given
    String my_string = "ProgrammerS123";
    int n = 11;
    String expected = "ProgrammerS";

    // When
    String result = new Problem181907().solution(my_string, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "He110W0r1d";
    int n = 5;
    String expected = "He110";

    // When
    String result = new Problem181907().solution(my_string, n);

    // Then
    assertEquals(expected, result);
  }
}
