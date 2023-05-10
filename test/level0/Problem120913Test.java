package level0;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem120913Test {

  @Test
  void solution01() {

    // Given
    String my_str = "abc1Addfggg4556b";
    int n = 6;
    String[] expected = {"abc1Ad", "dfggg4", "556b"};

    // When
    String[] result = new Problem120913().solution(my_str, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_str = "abcdef123";
    int n = 3;
    String[] expected = {"abc", "def", "123"};

    // When
    String[] result = new Problem120913().solution(my_str, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
