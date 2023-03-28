package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120837Test {

  @Test
  void solution01() {

    // Given
    int hp = 23;
    int expected = 5;

    // When
    int result = new Problem120837().solution(hp);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int hp = 24;
    int expected = 6;

    // When
    int result = new Problem120837().solution(hp);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int hp = 999;
    int expected = 201;

    // When
    int result = new Problem120837().solution(hp);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int hp = 0;
    int expected = 0;

    // When
    int result = new Problem120837().solution(hp);

    // Then
    assertEquals(expected, result);
  }

}
