package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem155652Test {

  @Test
  void solution01() {

    // Given
    String s = "aukks";
    String skip = "wbqd";
    int index = 5;
    String expected = "happy";

    // When
    String result = new Problem155652().solution(s, skip, index);

    // Then
    assertEquals(expected, result);
  }
}
