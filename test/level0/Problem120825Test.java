package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120825Test {

  @Test
  void solution01() {

    // Given
    String my_string = "hello";
    int n = 3;
    String expected = "hhheeellllllooo";

    // When
    String result = new Problem120825().solution(my_string, n);

    // Then
    assertEquals(expected, result);
  }
}
