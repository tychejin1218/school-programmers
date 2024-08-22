package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem17682Test {

  @Test
  void solution01() {

    // Given
    String dartResult = "1S2D*3T";
    int expected = 37;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String dartResult = "1D2S#10S";
    int expected = 9;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String dartResult = "1D2S0T";
    int expected = 3;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String dartResult = "1S*2T*3S";
    int expected = 23;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    String dartResult = "1D#2S*3S";
    int expected = 5;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {

    // Given
    String dartResult = "1T2D3D#";
    int expected = -4;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution07() {

    // Given
    String dartResult = "1D2S3T*";
    int expected = 59;

    // When
    int result = new Problem17682().solution(dartResult);

    // Then
    assertEquals(expected, result);
  }
}