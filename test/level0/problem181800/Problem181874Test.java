package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181874Test {

  @Test
  void solution01() {

    // Given
    String my_string = "abstract algebra";
    String expected = "AbstrAct AlgebrA";

    // When
    String result = new Problem181874().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "PrOgRaMmErS";
    String expected = "progrAmmers";

    // When
    String result = new Problem181874().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
