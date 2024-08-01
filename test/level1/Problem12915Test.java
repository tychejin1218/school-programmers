package level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12915Test {

  @Test
  void solution01() {

    // Given
    String[] strings = {"sun", "bed", "car"};
    int n = 1;
    String[] expected = {"car", "bed", "sun"};


    // When
    String[] result = new Problem12915().solution(strings, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] strings = {"abce", "abcd", "cdx"};
    int n = 2;
    String[] expected = {"abcd", "abce", "cdx"};


    // When
    String[] result = new Problem12915().solution(strings, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
