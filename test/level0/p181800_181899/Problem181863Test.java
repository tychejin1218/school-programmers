package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181863Test {

  @Test
  void solution01() {

    // Given
    String rny_string = "masterpiece";
    String expected = "rnasterpiece";

    // When
    String result = new Problem181863().solution(rny_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String rny_string = "programmers";
    String expected = "prograrnrners";

    // When
    String result = new Problem181863().solution(rny_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String rny_string = "jerry";
    String expected = "jerry";

    // When
    String result = new Problem181863().solution(rny_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String rny_string = "burn";
    String expected = "burn";

    // When
    String result = new Problem181863().solution(rny_string);

    // Then
    assertEquals(expected, result);
  }
}
