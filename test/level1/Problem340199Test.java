package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem340199Test {

  @Test
  void solution01() {

    // Given
    int[] wallet = {30, 15};
    int[] bill = {26, 17};
    int expected = 1;

    // When
    int result = new Problem340199().solution(wallet, bill);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] wallet = {50, 50};
    int[] bill = {100, 241};
    int expected = 4;

    // When
    int result = new Problem340199().solution(wallet, bill);

    // Then
    assertEquals(expected, result);
  }
}
