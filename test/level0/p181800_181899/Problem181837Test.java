package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181837Test {

  @Test
  void solution01() {

    // Given
    String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
    int expected = 19000;

    // When
    int result = new Problem181837().solution(order);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] order = {"americanoice", "americano", "iceamericano"};
    int expected = 13500;

    // When
    int result = new Problem181837().solution(order);

    // Then
    assertEquals(expected, result);
  }
}
