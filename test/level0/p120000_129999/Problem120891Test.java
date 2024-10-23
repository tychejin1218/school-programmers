package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120891Test {

  @Test
  void solution01() {

    // Given
    int order = 3;
    int expected = 1;

    // When
    int result = new Problem120891().solution(order);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int order = 29423;
    int expected = 2;

    // When
    int result = new Problem120891().solution(order);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int order = 0;
    int expected = 0;

    // When
    int result = new Problem120891().solution(order);

    // Then
    assertEquals(expected, result);
  }
}
