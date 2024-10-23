package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120830Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int k = 3;
    int expected = 124000;

    // When
    int result = new Problem120830().solution(n, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 64;
    int k = 6;
    int expected = 768000;

    // When
    int result = new Problem120830().solution(n, k);

    // Then
    assertEquals(expected, result);
  }
}
