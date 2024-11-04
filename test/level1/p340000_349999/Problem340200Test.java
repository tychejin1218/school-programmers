package level1.p340000_349999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem340200Test {

  @Test
  void solution01() {

    // Given
    String nickname = "WORLDworld";
    String expected = "VV0RLDvv";

    // When
    String result = new Problem340200().solution(nickname);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02s() {

    // Given
    String nickname = "GO";
    String expected = "G0oo";

    // When
    String result = new Problem340200().solution(nickname);

    // Then
    assertEquals(expected, result);
  }
}
