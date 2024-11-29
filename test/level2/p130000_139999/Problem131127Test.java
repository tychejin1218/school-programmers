package level2.p130000_139999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem131127Test {

  @Test
  void solution01() {

    // Given
    String[] want = {"banana", "apple", "rice", "pork", "pot"};
    int[] number= {3, 2, 2, 2, 1};
    String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
    int expected = 3;

    // When
    int result = new Problem131127().solution(want, number, discount);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] want = {"apple"};
    int[] number= {10};
    String[] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
    int expected = 0;

    // When
    int result = new Problem131127().solution(want, number, discount);

    // Then
    assertEquals(expected, result);
  }
}
