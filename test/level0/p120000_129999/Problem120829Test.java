package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120829Test {

  @Test
  void solution01() {

    // Given
    int angle = 70;
    int expected = 1;

    // When
    int result = new Problem120829().solution(angle);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int angle = 91;
    int expected = 3;

    // When
    int result = new Problem120829().solution(angle);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int angle = 180;
    int expected = 4;

    // When
    int result = new Problem120829().solution(angle);

    // Then
    assertEquals(expected, result);
  }
}
