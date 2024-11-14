package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12945Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    int expected = 2;

    // When
    int result = new Problem12945().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int expected = 5;

    // When
    int result = new Problem12945().solution(n);

    // Then
    assertEquals(expected, result);
  }
}