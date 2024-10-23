package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181905Test {

  @Test
  void solution01() {

    // Given
    String my_string = "Progra21Sremm3";
    int s = 6;
    int e = 12;
    String expected = "ProgrammerS123";

    // When
    String result = new Problem181905().solution(my_string, s, e);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "Stanley1yelnatS";
    int s = 4;
    int e = 10;
    String expected = "Stanley1yelnatS";

    // When
    String result = new Problem181905().solution(my_string, s, e);

    // Then
    assertEquals(expected, result);
  }
}
