package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181855Test {

  @Test
  void solution01() {

    // Given
    String[] strArr = {"a", "bc", "d", "efg", "hi"};
    int expected = 2;

    // When
    int result = new Problem181855().solution(strArr);

    // Then
    assertEquals(expected, result);
  }
}
