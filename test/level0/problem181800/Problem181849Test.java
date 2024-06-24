package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181849Test {

  @Test
  void solution01() {

    // Given
    String n_str = "123456789";
    int expected = 45;

    // When
    int result = new Problem181849().solution(n_str);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String n_str = "1000000";
    int expected = 1;

    // When
    int result = new Problem181849().solution(n_str);

    // Then
    assertEquals(expected, result);
  }
}
