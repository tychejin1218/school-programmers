package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120907Test {

  @Test
  void solution01() {

    // Given
    String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
    String[] expected = {"X", "O"};

    // When
    String[] result = new Problem120907().solution(quiz);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
    String[] expected = {"O", "O", "X", "O"};

    // When
    String[] result = new Problem120907().solution(quiz);

    // Then
    assertArrayEquals(expected, result);
  }
}
