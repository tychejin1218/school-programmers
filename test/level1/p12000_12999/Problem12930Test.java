package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12930Test {

  @Test
  void solution01() {

    // Given
    String s = "try hello world";
    String expected = "TrY HeLlO WoRlD";

    // When
    String result = new Problem12930().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
