package level1.p340000_349999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem340202Test {

  @Test
  void solution01() {

    // Given
    int storage = 5141;
    int usage = 500;
    int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
    int expected = -1;

    // When
    int result = new Problem340202().solution(storage, usage, change);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int storage = 1000;
    int usage = 2000;
    int[] change = {-10, 25, -33};
    int expected = 0;

    // When
    int result = new Problem340202().solution(storage, usage, change);

    // Then
    assertEquals(expected, result);
  }
}
