package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181906Test {

  @Test
  void solution01() {

    // Given
    String my_string = "banana";
    String is_prefix = "ban";
    int expected = 1;

    // When
    int result = new Problem181906().solution(my_string, is_prefix);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "banana";
    String is_prefix = "nan";
    int expected = 0;

    // When
    int result = new Problem181906().solution(my_string, is_prefix);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String my_string = "banana";
    String is_prefix = "abcd";
    int expected = 0;

    // When
    int result = new Problem181906().solution(my_string, is_prefix);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String my_string = "banana";
    String is_prefix = "bananan";
    int expected = 0;

    // When
    int result = new Problem181906().solution(my_string, is_prefix);

    // Then
    assertEquals(expected, result);
  }
}
