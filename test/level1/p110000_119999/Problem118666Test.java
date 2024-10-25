package level1.p110000_119999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem118666Test {

  @Test
  void solution01() {

    // Given
    String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
    int[] choices = {5, 3, 2, 7, 5};
    String expected = "TCMA";

    // When
    String result = new Problem118666().solution(survey, choices);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] survey = {"TR", "RT", "TR"};
    int[] choices = {7, 1, 3};
    String expected = "RCJA";

    // When
    String result = new Problem118666().solution(survey, choices);

    // Then
    assertEquals(expected, result);
  }
}
