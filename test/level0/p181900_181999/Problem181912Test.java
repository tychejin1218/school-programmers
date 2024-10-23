package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181912Test {

  @Test
  void solution01() {

    // Given
    String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
    int k = 50000;
    int s = 5;
    int l = 5;
    int[] expected = {56789, 99999};

    // When
    int[] result = new Problem181912().solution(intStrs, k, s, l);

    // Then
    assertArrayEquals(expected, result);
  }
}
