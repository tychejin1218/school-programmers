package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120819Test {

  @Test
  void solution01() {

    // Given
    int money = 5500;
    int[] expected = {1, 0};

    // When
    int[] result = new Problem120819().solution(money);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int money = 15000;
    int[] expected = {2, 4000};

    // When
    int[] result = new Problem120819().solution(money);

    // Then
    assertArrayEquals(expected, result);
  }
}
