package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120852Test {

  @Test
  void solution01() {

    // Given
    int n = 12;
    int[] expected = {2, 3};

    // When
    int[] result = new Problem120852().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 17;
    int[] expected = {17};

    // When
    int[] result = new Problem120852().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 420;
    int[] expected = {2, 3, 5, 7};

    // When
    int[] result = new Problem120852().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
