package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120956Test {

  @Test
  void solution01() {

    // Given
    String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
    int expected = 1;

    // When
    int result = new Problem120956().solution(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
    int expected = 3;

    // When
    int result = new Problem120956().solution(babbling);

    // Then
    assertEquals(expected, result);
  }
}
