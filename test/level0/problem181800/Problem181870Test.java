package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181870Test {

  @Test
  void solution01() {

    // Given
    String[] strArr = {"and", "notad", "abcd"};
    String[] expected = {"and", "abcd"};

    // When
    String[] result = new Problem181870().solution(strArr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] strArr = {"there", "are", "no", "a", "ds"};
    String[] expected = {"there", "are", "no", "a", "ds"};

    // When
    String[] result = new Problem181870().solution(strArr);

    // Then
    assertArrayEquals(expected, result);
  }
}
