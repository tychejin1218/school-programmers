package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12951Test {

  @Test
  void solution01() {

    // Given
    String s = "3people unFollowed me";
    String expected = "3people Unfollowed Me";

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "for the last week";
    String expected = "For The Last Week";

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {
    // Given
    String s = "hello  world";
    String expected = "Hello  World"; // 공백 두 개가 유지되어야 합니다.

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {
    // Given
    String s = "   leading spaces";
    String expected = "   Leading Spaces"; // 맨 앞의 공백 세 개가 유지되어야 합니다.

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {
    // Given
    String s = "trailing spaces   ";
    String expected = "Trailing Spaces   "; // 맨 끝의 공백 세 개가 유지되어야 합니다.

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {
    // Given
    String s = "MULTIPLE     SPACES";
    String expected = "Multiple     Spaces"; // 여러 개의 공백이 유지되어야 합니다.

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution07() {
    // Given
    String s = "123456";
    String expected = "123456"; // 숫자로만 이루어진 경우는 그대로 유지

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution08() {
    // Given
    String s = "a  bc d e  f";
    String expected = "A  Bc D E  F"; // 불규칙적인 공백도 고려

    // When
    String result = new Problem12951().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution09() {
    String s = " multiple    spaces at   the  beginning and end   ";
    String expected = " Multiple    Spaces At   The  Beginning And End   ";
    String result = new Problem12951().solution(s);
    assertEquals(expected, result);
  }

  @Test
  void solution10() {
    String s = " ";
    String expected = " ";
    String result = new Problem12951().solution(s);
    assertEquals(expected, result);
  }

  @Test
  void solution11() {
    String s = "";
    String expected = "";
    String result = new Problem12951().solution(s);
    assertEquals(expected, result);
  }
}
