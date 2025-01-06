package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42583Test {

  @Test
  void solution01() {

    // Given
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7, 4, 5, 6};
    int expected = 8;

    // When
    int result = new Problem42583().solution(bridge_length, weight, truck_weights);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int bridge_length = 100;
    int weight = 100;
    int[] truck_weights = {10};
    int expected = 101;

    // When
    int result = new Problem42583().solution(bridge_length, weight, truck_weights);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int bridge_length = 100;
    int weight = 100;
    int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    int expected = 110;

    // When
    int result = new Problem42583().solution(bridge_length, weight, truck_weights);

    // Then
    assertEquals(expected, result);
  }
}