package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181866Test {

  @Test
  void solution01() {

    // Given
    String myString = "axbxcxdx";
    String[] expected = {"a", "b", "c", "d"};

    // When
    String[] result = new Problem181866().solution(myString);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "dxccxbbbxaaaa";
    String[] expected = {"aaaa","bbb","cc","d"};

    // When
    String[] result = new Problem181866().solution(myString);

    // Then
    assertArrayEquals(expected, result);
  }
}
