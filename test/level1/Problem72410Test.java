package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem72410Test {

  @Test
  void solution01() {

    // Given
    String new_id = "...!@BaT#*..y.abcdefghijklm";
    String expected = "bat.y.abcdefghi";

    // When
    String result = new Problem72410().solution(new_id);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String new_id = "z-+.^.";
    String expected = "z--";

    // When
    String result = new Problem72410().solution(new_id);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String new_id = "=.=";
    String expected = "aaa";

    // When
    String result = new Problem72410().solution(new_id);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String new_id = "123_.def";
    String expected = "123_.def";

    // When
    String result = new Problem72410().solution(new_id);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    String new_id = "abcdefghijklmn.p";
    String expected = "abcdefghijklmn";

    // When
    String result = new Problem72410().solution(new_id);

    // Then
    assertEquals(expected, result);
  }
}
