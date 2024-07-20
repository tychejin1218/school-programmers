package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181934Test {

  @Test
  void solution01() {

    // Given
    String ineq = "<";
    String eq = "=";
    int n = 20;
    int m = 50;
    int expected = 1;

    // When
    int result = new Problem181934().solution(ineq, eq, n, m);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String ineq = ">";
    String eq = "!";
    int n = 41;
    int m = 78;
    int expected = 0;

    // When
    int result = new Problem181934().solution(ineq, eq, n, m);

    // Then
    assertEquals(expected, result);
  }
}