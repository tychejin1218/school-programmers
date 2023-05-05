package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120903Test {

  @Test
  void solution01() {

    // Given
    String[] s1 = {"a", "b", "c"};
    String[] s2 = {"com", "b", "d", "p", "c"};
    int expected = 2;

    // When
    int result = new Problem120903().solution(s1, s2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] s1 = {"n", "omg"};
    String[] s2 = {"m", "dot"};
    int expected = 0;

    // When
    int result = new Problem120903().solution(s1, s2);

    // Then
    assertEquals(expected, result);
  }

}