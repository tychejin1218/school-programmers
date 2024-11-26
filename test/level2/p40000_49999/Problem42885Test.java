package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42885Test {

  @Test
  void solution01() {

    // Given
    int[] people = {70, 50, 80, 50};
    int limit = 100;
    int expected = 3;

    // When
    int result = new Problem42885().solution(people, limit);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] people = {70, 80, 50};
    int limit = 100;
    int expected = 3;

    // When
    int result = new Problem42885().solution(people, limit);

    // Then
    assertEquals(expected, result);
  }
}
