package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120822Test {

  @Test
  void solution01() {

    // Given
    String my_string = "jaron";
    String expected = "noraj";

    // When
    String result = new Problem120822().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "bread";
    String expected = "daerb";

    // When
    String result = new Problem120822().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
