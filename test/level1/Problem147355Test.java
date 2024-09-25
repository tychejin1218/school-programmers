package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem147355Test {

  @Test
  void solution01() {

    // Given
    String t = "3141592";
    String p= "271";
    int expected = 2;

    // When
    int result = new Problem147355().solution(t, p);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String t = "500220839878";
    String p= "7";
    int expected = 8;

    // When
    int result = new Problem147355().solution(t, p);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String t = "10203";
    String p= "15";
    int expected = 3;

    // When
    int result = new Problem147355().solution(t, p);

    // Then
    assertEquals(expected, result);
  }
}
