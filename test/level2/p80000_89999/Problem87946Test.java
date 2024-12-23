package level2.p80000_89999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem87946Test {

  @Test
  void solution01() {

    // Given
    int k = 80;
    int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
    int expected = 3;

    // When
    int result = new Problem87946().solution(k, dungeons);

    // Then
    assertEquals(expected, result);
  }
}
