package level0.problem250000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem250127Test {

  @Test
  void solution01() {

    // Given
    String mode_type = "auto";
    int humidity = 23;
    int val_set = 45;
    int expected = 3;

    // When
    int result = new Problem250127().solution(mode_type, humidity, val_set);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String mode_type = "target";
    int humidity = 41;
    int val_set = 40;
    int expected = 1;

    // When
    int result = new Problem250127().solution(mode_type, humidity, val_set);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String mode_type = "minimum";
    int humidity = 10;
    int val_set = 34;
    int expected = 1;

    // When
    int result = new Problem250127().solution(mode_type, humidity, val_set);

    // Then
    assertEquals(expected, result);
  }
}
