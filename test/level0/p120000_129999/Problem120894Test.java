package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120894Test {

  @Test
  void solution01() {

    // Given
    String numbers = "onetwothreefourfivesixseveneightnine";
    long expected = 123456789;

    // When
    long result = new Problem120894().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String numbers = "onefourzerosixseven";
    long expected = 14067;

    // When
    long result = new Problem120894().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
