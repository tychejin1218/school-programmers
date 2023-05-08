package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120908Test {

  @Test
  void solution01() {

    // Given
    String str1 = "ab6CDE443fgh22iJKlmn1o";
    String str2 = "6CD";
    int expected = 1;

    // When
    int result = new Problem120908().solution(str1, str2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String str1 = "ppprrrogrammers";
    String str2 = "pppp";
    int expected = 2;

    // When
    int result = new Problem120908().solution(str1, str2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String str1 = "AbcAbcA";
    String str2 = "AAA";
    int expected = 2;

    // When
    int result = new Problem120908().solution(str1, str2);

    // Then
    assertEquals(expected, result);
  }
}
