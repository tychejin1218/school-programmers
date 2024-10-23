package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181834Test {

  @Test
  void solution01() {

    // Given
    String myString = "abcdevwxyz";
    String expected = "lllllvwxyz";

    // When
    String result = new Problem181834().solution(myString);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "jjnnllkkmm";
    String expected = "llnnllllmm";

    // When
    String result = new Problem181834().solution(myString);

    // Then
    assertEquals(expected, result);
  }
}
