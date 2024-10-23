package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12919Test {

  @Test
  void solution01() {

    // Given
    String[] seoul = {"Jane", "Kim"};
    String expected = "김서방은 1에 있다";

    // When
    String result = new Problem12919().solution(seoul);

    // Then
    assertEquals(expected, result);
  }
}
