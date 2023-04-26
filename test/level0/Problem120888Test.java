package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120888Test {

  @Test
  void solution01() {

    // Given
    String my_string = "people";
    String expected  = "peol";

    // When
    String result = new Problem120888().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "We are the world";
    String expected  = "We arthwold";

    // When
    String result = new Problem120888().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
