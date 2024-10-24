package level1.p70000_79999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem77484Test {

  @Test
  void solution01() {

    // Given
    int[] lottos = {44, 1, 0, 0, 31, 25};
    int[] win_nums = {31, 10, 45, 1, 6, 19};
    int[] expected = {3, 5};

    // When
    int[] result = new Problem77484().solution(lottos, win_nums);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] lottos = {0, 0, 0, 0, 0, 0};
    int[] win_nums = {38, 19, 20, 40, 15, 25};
    int[] expected = {1, 6};

    // When
    int[] result = new Problem77484().solution(lottos, win_nums);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] lottos = {45, 4, 35, 20, 3, 9};
    int[] win_nums = {20, 9, 3, 45, 4, 35};
    int[] expected = {1, 1};

    // When
    int[] result = new Problem77484().solution(lottos, win_nums);

    // Then
    assertArrayEquals(expected, result);
  }
}
