package level1.p170000_179999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem178871Test {

  @Test
  void solution01() {

    // Given
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};
    String[] expected = {"mumu", "kai", "mine", "soe", "poe"};

    // When
    String[] result = new Problem178871().solution(players, callings);

    // Then
    assertArrayEquals(expected, result);
  }
}
