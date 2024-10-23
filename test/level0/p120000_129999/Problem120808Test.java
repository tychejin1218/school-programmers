package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120808Test {

  @Test
  void solution01() {

    // Given
    int numer1 = 1;
    int denom1 = 2;
    int numer2 = 3;
    int denom2 = 4;
    int[] expected = {5, 4};

    // When
    int[] result = new Problem120808().solution(numer1, denom1, numer2, denom2);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int numer1 = 9;
    int denom1 = 2;
    int numer2 = 1;
    int denom2 = 3;
    int[] expected = {29, 6};

    // When
    int[] result = new Problem120808().solution(numer1, denom1, numer2, denom2);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int numer1 = 1;
    int denom1 = 2;
    int numer2 = 1;
    int denom2 = 2;
    int[] expected = {1, 1};

    // When
    int[] result = new Problem120808().solution(numer1, denom1, numer2, denom2);

    // Then
    assertArrayEquals(expected, result);
  }
}
