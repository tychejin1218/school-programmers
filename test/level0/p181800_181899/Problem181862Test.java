package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181862Test {

  @Test
  void solution01() {

    // Given
    String myStr = "baconlettucetomato";
    String[] expected = {"onlettu", "etom", "to"};

    // When
    String[] result = new Problem181862().solution(myStr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myStr = "abcd";
    String[] expected = {"d"};

    // When
    String[] result = new Problem181862().solution(myStr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String myStr = "cabab";
    String[] expected = {"EMPTY"};

    // When
    String[] result = new Problem181862().solution(myStr);

    // Then
    assertArrayEquals(expected, result);
  }
}
