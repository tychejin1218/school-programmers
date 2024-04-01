package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120820Test {

  @Test
  void solution01() {

    // Given
    int age = 40;
    int expected = 1983;

    // When
    int result = new Problem120820().solution(age);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int age = 23;
    int expected = 2000;

    // When
    int result = new Problem120820().solution(age);

    // Then
    assertEquals(expected, result);
  }
}
