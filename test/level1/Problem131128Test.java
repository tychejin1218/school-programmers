package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem131128Test {

  @Test
  void solution01() {

    // Given
    String X = "100";
    String Y = "2345";
    String expected = "-1";

    // When
    String result = new Problem131128().solution(X, Y);

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
    String result = new Problem131128().solution(X, Y);

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
    String result = new Problem131128().solution(X, Y);

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
    String result = new Problem131128().solution(X, Y);

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
    String result = new Problem131128().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {

    // Given
    String X = "2987654";
    String Y = "2876540";
    String expected = "876542";

    // When
    String result = new Problem131128().solution(X, Y);

    // Then
    assertEquals(expected, result);
  }
}
