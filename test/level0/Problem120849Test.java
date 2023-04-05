package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120849Test {

  @Test
  void solution01() {

    // Given
    String my_string = "bus";
    String expected = "bs";

    // When
    String result = new Problem120849().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "nice to meet you";
    String expected = "nc t mt y";

    // When
    String result = new Problem120849().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
