package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12981Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    int[] expected = {3, 3};

    // When
    int[] result = new Problem12981().solution(n, words);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage",
        "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
    int[] expected = {0, 0};

    // When
    int[] result = new Problem12981().solution(n, words);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 2;
    String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
    int[] expected = {1, 3};

    // When
    int[] result = new Problem12981().solution(n, words);

    // Then
    assertArrayEquals(expected, result);
  }
}
