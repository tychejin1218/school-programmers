package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181941Test {

  @Test
  void solution01() {

    // Given
    String[] arr = {"a", "b", "c"};
    String expected = "abc";

    // When
    String result = new Problem181941().solution(arr);

    // Then
    assertEquals(expected, result);
  }
}
