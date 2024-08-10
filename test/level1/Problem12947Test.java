package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12947Test {

  @Test
  void solution01() {

    // Given
    int x = 10;
    boolean expected = true;

    // When
    boolean result = new Problem12947().solution(x);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int x = 12;
    boolean expected = true;

    // When
    boolean result = new Problem12947().solution(x);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int x = 11;
    boolean expected = false;

    // When
    boolean result = new Problem12947().solution(x);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int x = 13;
    boolean expected = false;

    // When
    boolean result = new Problem12947().solution(x);

    // Then
    assertEquals(expected, result);
  }
}