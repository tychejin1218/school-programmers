package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181864Test {

  @Test
  void solution01() {

    // Given
    String myString = "ABBAA";
    String pat = "AABB";
    int expected = 1;

    // When
    int result = new Problem181864().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "ABAB";
    String pat = "ABAB";
    int expected = 0;

    // When
    int result = new Problem181864().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }
}
