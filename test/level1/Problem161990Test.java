package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem161990Test {

  @Test
  void solution01() {

    // Given
    String[] wallpaper = {".#...", "..#..", "...#."};
    int[] expected = {0, 1, 3, 4};

    // When
    int[] result = new Problem161990().solution(wallpaper);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
    int[] expected = {1, 3, 5, 8};

    // When
    int[] result = new Problem161990().solution(wallpaper);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
    int[] expected = {0, 0, 7, 9};

    // When
    int[] result = new Problem161990().solution(wallpaper);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String[] wallpaper = {"..", "#."};
    int[] expected = {1, 0, 2, 1};

    // When
    int[] result = new Problem161990().solution(wallpaper);

    // Then
    assertArrayEquals(expected, result);
  }
}
