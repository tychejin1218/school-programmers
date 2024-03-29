package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181838Test {

  @Test
  void solution01() {

    // Given
    int[] date1 = {2021, 12, 28};
    int[] date2 = {2021, 12, 29};
    int expected = 1;

    // When
    int result = new Problem181838().solution(date1, date2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] date1 = {1024, 10, 24};
    int[] date2 = {1024, 10, 24};
    int expected = 0;

    // When
    int result = new Problem181838().solution(date1, date2);

    // Then
    assertEquals(expected, result);
  }
}
