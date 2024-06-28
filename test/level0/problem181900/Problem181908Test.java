package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181908Test {

  @Test
  void solution01() {

    // Given
    String my_string = "banana";
    String is_suffix = "ana";
    int expected = 1;

    // When
    int result = new Problem181908().solution(my_string, is_suffix);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "banana";
    String is_suffix = "nan";
    int expected = 0;

    // When
    int result = new Problem181908().solution(my_string, is_suffix);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String my_string = "banana";
    String is_suffix = "wxyz";
    int expected = 0;

    // When
    int result = new Problem181908().solution(my_string, is_suffix);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String my_string = "banana";
    String is_suffix = "abanana";
    int expected = 0;

    // When
    int result = new Problem181908().solution(my_string, is_suffix);

    // Then
    assertEquals(expected, result);
  }
}
