package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42578Test {

  @Test
  void solution01() {

    // Given
    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}};
    int expected = 5;

    // When
    int result = new Problem42578().solution(clothes);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"},
        {"smoky_makeup", "face"}};
    int expected = 3;

    // When
    int result = new Problem42578().solution(clothes);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[][] clothes = {{"yellow_hat", "headgear"}};
    int expected = 1;

    // When
    int result = new Problem42578().solution(clothes);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {
    // Given
    String[][] clothes = {{"yellow_hat", "headgear"}, {"green_turban", "headgear"},
        {"blue_sunglasses", "eyewear"}, {"black_glasses", "eyewear"},
        {"red_shirt", "top"}, {"blue_shirt", "top"}};
    int expected = 26;

    // When
    int result = new Problem42578().solution(clothes);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {
    // Given
    String[][] clothes = {{"jeans", "bottom"}, {"black_pants", "bottom"},
        {"jeans_jacket", "outerwear"}, {"leather_jacket", "outerwear"}};
    int expected = 8;

    // When
    int result = new Problem42578().solution(clothes);

    // Then
    assertEquals(expected, result);
  }
}
