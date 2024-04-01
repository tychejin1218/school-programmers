package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120834Test {

  @Test
  void solution01() {

    // Given
    int age = 23;
    String expected = "cd";

    // When
    String result = new Problem120834().solution(age);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int age = 51;
    String expected = "fb";

    // When
    String result = new Problem120834().solution(age);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int age = 100;
    String expected = "baa";

    // When
    String result = new Problem120834().solution(age);

    // Then
    assertEquals(expected, result);
  }
}
