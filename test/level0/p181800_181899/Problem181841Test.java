package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181841Test {

  @Test
  void solution01() {

    // Given
    String[] str_list = {"abc", "def", "ghi"};
    String ex = "ef";
    String expected = "abcghi";

    // When
    String result = new Problem181841().solution(str_list, ex);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] str_list = {"abc", "bbc", "cbc"};
    String ex = "c";
    String expected = "";

    // When
    String result = new Problem181841().solution(str_list, ex);

    // Then
    assertEquals(expected, result);
  }
}
