package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181942_1Test {

  @Test
  void solution01() {

    // Given
    String str1 = "aaaaa";
    String str2 = "bbbbb";
    String expected = "ababababab";

    // When
    String result = new Problem181942_1().solution(str1, str2);

    // Then
    assertEquals(expected, result);
  }
}
