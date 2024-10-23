package level1.p340000_349999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem340198Test {

  @Test
  void solution01() {

    // Given
    int[] mats = {5, 3, 2};
    String[][] park = {
        {"A", "A", "-1", "B", "B", "B", "B", "-1"},
        {"A", "A", "-1", "B", "B", "B", "B", "-1"},
        {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
        {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
    };
    int expected = 3;

    // When
    int result = new Problem340198().solution(mats, park);

    // Then
    assertEquals(expected, result);
  }
}
