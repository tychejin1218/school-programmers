package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181875Test {

  @Test
  void solution01() {

    // Given
    String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
    String[] expected = {"aaa", "BBB", "ccc", "DDD"};

    // When
    String[] result = new Problem181875().solution(strArr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] strArr = {"aBc","AbC"};
    String[] expected = {"abc","ABC"};

    // When
    String[] result = new Problem181875().solution(strArr);

    // Then
    assertArrayEquals(expected, result);
  }

}
