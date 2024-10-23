package level1.p140000_149999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem140108Test {

  @Test
  void solution01() {

    // Given
    String s = "banana";
    int expected = 3;

    // When
    int result = new Problem140108().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "abracadabra";
    int expected = 6;

    // When
    int result = new Problem140108().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "aaabbaccccabba";
    int expected = 3;

    // When
    int result = new Problem140108().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
