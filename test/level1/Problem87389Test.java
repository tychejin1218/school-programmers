package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem87389Test {


  @Test
  void solution01() {

    // Given
    int n = 10;
    int expected = 3;

    // When
    int result = new Problem87389().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 12;
    int expected = 11;

    // When
    int result = new Problem87389().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
