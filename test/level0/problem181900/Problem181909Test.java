package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181909Test {

  @Test
  void solution01() {

    // Given
    String my_string = "banana";
    String[] expected = {"a", "ana", "anana", "banana", "na", "nana"};

    // When
    String[] result = new Problem181909().solution(my_string);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "programmers";
    String[] expected = {"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"};

    // When
    String[] result = new Problem181909().solution(my_string);

    // Then
    assertArrayEquals(expected, result);
  }
}
