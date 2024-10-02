package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem159994Test {

  @Test
  void solution01() {

    // Given
    String[] cards1 = {"i", "drink", "water"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};
    String expected = "Yes";

    // When
    String result = new Problem159994().solution(cards1, cards2, goal);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] cards1 = {"i", "water", "drink"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};
    String expected = "No";

    // When
    String result = new Problem159994().solution(cards1, cards2, goal);

    // Then
    assertEquals(expected, result);
  }
}