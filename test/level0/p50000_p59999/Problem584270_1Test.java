package level0.p50000_p59999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem584270_1Test {

  @Test
  void solution01() {

    // Given
    String X = "100";
    String Y = "2345";
    String expected = "-1";

    // When
    String result = new Problem584270_1().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String X = "100";
    String Y = "203045";
    String expected = "0";

    // When
    String result = new Problem584270_1().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String X = "100";
    String Y = "123450";
    String expected = "10";

    // When
    String result = new Problem584270_1().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String X = "12321";
    String Y = "42531";
    String expected = "321";

    // When
    String result = new Problem584270_1().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    String X = "5525";
    String Y = "1255";
    String expected = "552";

    // When
    String result = new Problem584270_1().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }
}