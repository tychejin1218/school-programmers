package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120880Test {

  @Test
  void solution01() {

    // Given
    int[] numlist = {1, 2, 3, 4, 5, 6};
    int n = 4;
    int[] expected = {4, 5, 3, 6, 2, 1};

    // When
    int[] result = new Problem120880().solution(numlist, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numlist = {10000,20,36,47,40,6,10,7000};
    int n = 30;
    int[] expected = {36, 40, 20, 47, 10, 6, 7000, 10000};

    // When
    int[] result = new Problem120880().solution(numlist, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] numlist = {10, 30};
    int n = 10;
    int[] expected = {10, 30};

    // When
    int[] result = new Problem120880().solution(numlist, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
