package level3.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem42579Test {

  @Test
  void solution01() {

    // Given
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    int[] expected = {4, 1, 3, 0};

    // When
    int[] result = new Problem42579().solution(genres, plays);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {
    // Given
    String[] genres = {"jazz", "pop", "jazz", "jazz", "pop", "rock"};
    int[] plays =      {400,    800,    300,    700,   1200,   300};
    int[] expected = {4, 1, 3, 0, 5};

    // When
    int[] result = new Problem42579().solution(genres, plays);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {
    // Given
    String[] genres = {"rock"};
    int[] plays = {700};
    int[] expected = {0};

    // When
    int[] result = new Problem42579().solution(genres, plays);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution04() {
    // Given
    String[] genres = {"pop", "rock", "pop", "jazz", "rock", "jazz"};
    int[] plays = {100, 200, 300, 700, 300, 800};
    int[] expected = {5, 3, 4, 1, 2, 0};

    // When
    int[] result = new Problem42579().solution(genres, plays);

    // Then
    assertArrayEquals(expected, result);
  }
}
