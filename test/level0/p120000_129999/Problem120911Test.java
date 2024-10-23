package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120911Test {

  @Test
  void solution01() {

    // Given
    String my_string = "Bcad";
    String expected = "abcd";

    // When
    String result = new Problem120911().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "heLLo";
    String expected = "ehllo";

    // When
    String result = new Problem120911().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String my_string = "Python";
    String expected = "hnopty";

    // When
    String result = new Problem120911().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
