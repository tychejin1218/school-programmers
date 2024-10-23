package level1.p130000_139999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem133499Test {

  @Test
  void solution01() {

    // Given
    String[] babbling = {"aya", "yee", "u", "maa"};
    int expected = 1;

    // When
    int result = new Problem133499().solution(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    int expected = 2;

    // When
    int result = new Problem133499().solution(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] babbling = {"ayawooaya", "woowa", "wooaya", "yemawoo"};
    int expected = 3;

    // When
    int result = new Problem133499().solution01(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {
    // Given
    String[] babbling = {"aya", "yee", "u", "maa"};
    int expected = 1;

    // When
    int result = new Problem133499().solution01(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {
    // Given
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    int expected = 2;

    // When
    int result = new Problem133499().solution01(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {
    // Given
    String[] babbling = {"ayawooaya", "woowa", "wooaya", "yemawoo"};
    int expected = 3;

    // When
    int result = new Problem133499().solution01(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void additionalTest01() {
    // Given
    String[] babbling = {"wooayayewoo", "yeayama"};
    int expected = 0;

    // When
    int result = new Problem133499().solution(babbling);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void additionalTest02() {
    // Given
    String[] babbling = {"ayaayaaya", "maama"};
    int expected = 0;

    // When
    int result = new Problem133499().solution(babbling);

    // Then
    assertEquals(expected, result);
  }
}
