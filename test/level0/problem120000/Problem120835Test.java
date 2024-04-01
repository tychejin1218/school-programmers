package level0.problem120000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem120835Test {

  @Test
  void solution01() {

    // Given
    int[] emergency = {3, 76, 24};
    int[] expected = {3, 1, 2};

    // When
    int[] result = new Problem120835().solution(emergency);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] emergency = {1, 2, 3, 4, 5, 6, 7};
    int[] expected = {7, 6, 5, 4, 3, 2, 1};

    // When
    int[] result = new Problem120835().solution(emergency);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] emergency = {30, 10, 23, 6, 100};
    int[] expected = {2, 4, 3, 5, 1};

    // When
    int[] result = new Problem120835().solution(emergency);

    // Then
    assertArrayEquals(expected, result);
  }
}
