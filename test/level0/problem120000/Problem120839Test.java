package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120839Test {

  @Test
  void solution01() {

    // Given
    String rsp = "2";
    String expected = "0";

    // When
    String result = new Problem120839().solution(rsp);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String rsp = "205";
    String expected = "052";

    // When
    String result = new Problem120839().solution(rsp);

    // Then
    assertEquals(expected, result);
  }
}
