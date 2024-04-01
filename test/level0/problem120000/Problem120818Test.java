package level0.problem120000;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem120818Test {

  @Test
  void solution01() {

    // Given
    int price = 150000;
    int expected = 142500;

    // When
    int result = new Problem120818().solution(price);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int price = 580000;
    int expected = 464000;

    // When
    int result = new Problem120818().solution(price);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int price = 99990;
    int expected = 99990;

    // When
    int result = new Problem120818().solution(price);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int price = 199910;
    int expected = 189914;

    // When
    int result = new Problem120818().solution(price);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    int price = 399910;
    int expected = 359919;

    // When
    int result = new Problem120818().solution(price);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {

    // Given
    int price = 500010;
    int expected = 400008;

    // When
    int result = new Problem120818().solution(price);

    // Then
    assertEquals(expected, result);
  }
}
