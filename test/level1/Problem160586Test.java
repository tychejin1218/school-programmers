package level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem160586Test {

  @Test
  void solution01() {

    // Given
    String[] keymap = {"ABACD", "BCEFD"};
    String[] targets = {"ABCD", "AABB"};
    int[] expected = {9, 4};

    // When
    int[] result = new Problem160586().solution(keymap, targets);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] keymap = {"AA"};
    String[] targets = {"B"};
    int[] expected = {-1};

    // When
    int[] result = new Problem160586().solution(keymap, targets);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] keymap = {"AGZ", "BSSS"};
    String[] targets = {"ASA", "BGZ"};
    int[] expected = {4, 6};

    // When
    int[] result = new Problem160586().solution(keymap, targets);

    // Then
    assertArrayEquals(expected, result);
  }
}
