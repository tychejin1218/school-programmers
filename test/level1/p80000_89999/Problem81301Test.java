package level1.p80000_89999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem81301Test {

  @Test
  void solution01() {

    // Given
    String s = "one4seveneight";
    int expected = 1478;

    // When
    int result = new Problem81301().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "23four5six7";
    int expected = 234567;

    // When
    int result = new Problem81301().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "2three45sixseven";
    int expected = 234567;

    // When
    int result = new Problem81301().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String s = "123";
    int expected = 123;

    // When
    int result = new Problem81301().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
