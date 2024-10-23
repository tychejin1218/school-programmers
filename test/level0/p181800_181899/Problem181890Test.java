package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181890Test {

  @Test
  void solution01() {

    // Given
    String[] str_list = {"u", "u", "l", "r"};
    String[] expected = {"u", "u"};

    // When
    String[] result = new Problem181890().solution(str_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] str_list = {"l"};
    String[] expected = {};

    // When
    String[] result = new Problem181890().solution(str_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
