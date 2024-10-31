package level1.p200000_299999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem251307Test {

  @Test
  void solution01() {

    // Given
    int[] bandage = {5, 1, 5};
    int health = 30;
    int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
    int expected = 5;

    // When
    int result = new Problem251307().solution(bandage, health, attacks);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] bandage = {3, 2, 7};
    int health = 20;
    int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
    int expected = -1;

    // When
    int result = new Problem251307().solution(bandage, health, attacks);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] bandage = {4, 2, 7};
    int health = 20;
    int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
    int expected = -1;

    // When
    int result = new Problem251307().solution(bandage, health, attacks);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int[] bandage = {1, 1, 1};
    int health = 5;
    int[][] attacks = {{1, 2}, {3, 2}};
    int expected = 3;

    // When
    int result = new Problem251307().solution(bandage, health, attacks);

    // Then
    assertEquals(expected, result);
  }
}
