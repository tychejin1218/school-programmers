package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181933Test {

  @Test
  void solution01() {

    // Given
    int a = -4;
    int b = 7;
    boolean flag = true;
    int expected = 3;

    // When
    int result = new Problem181933().solution(a, b, flag);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = -4;
    int b = 7;
    boolean flag = false;
    int expected = -11;

    // When
    int result = new Problem181933().solution(a, b, flag);

    // Then
    assertEquals(expected, result);
  }
}
