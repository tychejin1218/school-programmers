package level0.p250000_259999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem250128Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1};
    int[] our_score = {100};
    int[] score_list = {100, 80, 90, 84, 20};
    String[] expected = {"Same"};

    // When
    String[] result = new Problem250128().solution(numbers, our_score, score_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {3, 4};
    int[] our_score = {85, 93};
    int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};
    String[] expected = {"Different", "Same"};

    // When
    String[] result = new Problem250128().solution(numbers, our_score, score_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
