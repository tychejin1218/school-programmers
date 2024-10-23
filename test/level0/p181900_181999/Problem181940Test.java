package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181940Test {

  @Test
  void solution01() {

    // Given
    String my_string = "string";
    int k = 3;
    String expected = "stringstringstring";

    // When
    String result = new Problem181940().solution(my_string, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "love";
    int k = 10;
    String expected = "lovelovelovelovelovelovelovelovelovelove";

    // When
    String result = new Problem181940().solution(my_string, k);

    // Then
    assertEquals(expected, result);
  }
}
