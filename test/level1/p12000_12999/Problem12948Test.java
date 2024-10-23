package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12948Test {

  @Test
  void solution01() {

    // Given
    String phone_number = "01033334444";
    String expected = "*******4444";

    // When
    String result = new Problem12948().solution(phone_number);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String phone_number = "027778888";
    String expected = "*****8888";

    // When
    String result = new Problem12948().solution(phone_number);

    // Then
    assertEquals(expected, result);
  }
}
