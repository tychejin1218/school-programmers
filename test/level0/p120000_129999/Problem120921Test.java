package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120921Test {

  @Test
  void solution01() {

    // Given
    String A = "hello";
    String B = "ohell";
    int expected = 1;

    // When
    int result = new Problem120921().solution(A, B);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String A = "apple";
    String B = "elppa";
    int expected = -1;

    // When
    int result = new Problem120921().solution(A, B);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String A = "atat";
    String B = "tata";
    int expected = 1;

    // When
    int result = new Problem120921().solution(A, B);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String A = "abc";
    String B = "abc";
    int expected = 0;

    // When
    int result = new Problem120921().solution(A, B);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    String A = "hello";
    String B = "elloh";
    int expected = 4;

    // When
    int result = new Problem120921().solution(A, B);

    // Then
    assertEquals(expected, result);
  }
}
