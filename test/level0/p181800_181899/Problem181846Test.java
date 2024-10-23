package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181846Test {

  @Test
  void solution01() {

    // Given
    String a = "582";
    String b = "734";
    String expected = "1316";

    // When
    String result = new Problem181846().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String a = "18446744073709551615";

    String b = "287346502836570928366";
    String expected = "305793246910280479981";

    // When
    String result = new Problem181846().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
