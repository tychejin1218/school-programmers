package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120885Test {

  @Test
  void solution01() {

    // Given
    String bin1 = "10";
    String bin2 = "11";
    String expected = "101";

    // When
    String result = new Problem120885().solution(bin1, bin2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String bin1 = "1001";
    String bin2 = "1111";
    String expected = "11000";

    // When
    String result = new Problem120885().solution(bin1, bin2);

    // Then
    assertEquals(expected, result);
  }
}
