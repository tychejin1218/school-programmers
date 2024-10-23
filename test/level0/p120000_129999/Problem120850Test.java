package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120850Test {

  @Test
  void solution01() {

    // Given
    String my_string = "hi12392";
    int[] expected = {1, 2, 2, 3, 9};

    // When
    int[] result = new Problem120850().solution(my_string);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "p2o4i8gj2";
    int[] expected = {2, 2, 4, 8};

    // When
    int[] result = new Problem120850().solution(my_string);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String my_string = "abcde0";
    int[] expected = {0};

    // When
    int[] result = new Problem120850().solution(my_string);

    // Then
    assertArrayEquals(expected, result);
  }
}
