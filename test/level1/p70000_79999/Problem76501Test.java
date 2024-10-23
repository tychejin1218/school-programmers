package level1.p70000_79999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem76501Test {

  @Test
  void solution01() {

    // Given
    int[] absolutes = {4, 7, 12};
    boolean[] signs = {true, false, true};
    int expected = 9;

    // When
    int result = new Problem76501().solution(absolutes, signs);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] absolutes = {1,2,3};
    boolean[] signs = {false,false,true};
    int expected = 0;

    // When
    int result = new Problem76501().solution(absolutes, signs);

    // Then
    assertEquals(expected, result);
  }
}
