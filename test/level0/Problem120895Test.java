package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120895Test {

  @Test
  void solution01() {

    // Given
    String my_string = "hello";
    int num1 = 1;
    int num2 = 2;
    String expected = "hlelo";

    // When
    String result = new Problem120895().solution(my_string, num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "I love you";
    int num1 = 3;
    int num2 = 6;
    String expected = "I l veoyou";

    // When
    String result = new Problem120895().solution(my_string, num1, num2);

    // Then
    assertEquals(expected, result);
  }
}