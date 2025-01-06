package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem42746Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {6, 10, 2};
    String expected = "6210";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {3, 30, 34, 5, 9};
    String expected = "9534330";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] numbers = {0, 0, 0, 0};
    String expected = "0";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int[] numbers = {12, 121};
    String expected = "12121";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    int[] numbers = {40, 403, 405};
    String expected = "40540403";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {

    // Given
    int[] numbers = {9, 98, 999};
    String expected = "999998";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution07() {

    // Given
    int[] numbers = {1, 1000, 100, 10};
    String expected = "1101001000";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution08() {

    // Given
    int[] numbers = {5, 55, 5, 555};
    String expected = "5555555";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution09() {

    // Given
    int[] numbers = {0, 1000, 0, 0, 200};
    String expected = "2001000000";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution10() {

    // Given
    int[] numbers = {2, 20, 21};
    String expected = "22120";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution11() {

    // Given
    int[] numbers = {111, 11, 110};
    String expected = "11111110";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution12() {

    // Given
    int[] numbers = {0};
    String expected = "0";

    // When
    String result = new Problem42746().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
