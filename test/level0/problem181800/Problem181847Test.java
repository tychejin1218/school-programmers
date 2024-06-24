package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181847Test {

  @Test
  void solution01() {

    // Given
    String n_str = "0010";
    String expected = "10";

    // When
    String result = new Problem181847().solution(n_str);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String n_str = "854020";
    String expected = "854020";

    // When
    String result = new Problem181847().solution(n_str);

    // Then
    assertEquals(expected, result);
  }
}
