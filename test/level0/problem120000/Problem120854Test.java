package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120854Test {

  @Test
  void solution01() {

    // Given
    String[] strlist = {"We", "are", "the", "world!"};
    int[] expected = {2, 3, 3, 6};

    // When
    int[] result = new Problem120854().solution(strlist);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] strlist = {"I", "Love", "Programmers."};
    int[] expected = {1, 4, 12};

    // When
    int[] result = new Problem120854().solution(strlist);

    // Then
    assertArrayEquals(expected, result);
  }
}
