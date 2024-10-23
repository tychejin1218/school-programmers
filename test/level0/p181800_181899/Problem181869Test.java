package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181869Test {

  @Test
  void solution01() {

    // Given
    String myString = "i love you";
    String[] expected = {"i", "love", "you"};

    // When
    String[] result = new Problem181869().solution(myString);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "programmers";
    String[] expected = {"programmers"};

    // When
    String[] result = new Problem181869().solution(myString);

    // Then
    assertArrayEquals(expected, result);
  }
}
