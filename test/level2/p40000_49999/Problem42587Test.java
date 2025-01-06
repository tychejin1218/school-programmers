package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42587Test {

  @Test
  void solution01() {

    // Given
    int[] priorities = {2, 1, 3, 2};
    int location = 2;
    int expected = 1;

    // When
    int result = new Problem42587().solution(priorities, location);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;
    int expected = 5;

    // When
    int result = new Problem42587().solution(priorities, location);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] priorities = {1, 1, 1, 1, 1};
    int location = 4;
    int expected = 5;

    // When
    int result = new Problem42587().solution(priorities, location);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int[] priorities = {3, 3, 3, 3};
    int location = 3;
    int expected = 4;

    // When
    int result = new Problem42587().solution(priorities, location);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    int[] priorities = {3, 3, 4, 2};
    int location = 1;
    int expected = 3;

    // When
    int result = new Problem42587().solution(priorities, location);

    // Then
    assertEquals(expected, result);
  }
}
