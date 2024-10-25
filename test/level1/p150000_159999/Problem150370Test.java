package level1.p150000_159999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem150370Test {

  @Test
  void solution01() {

    // Given
    String today = "2022.05.19";
    String[] terms = {"A 6", "B 12", "C 3"};
    String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
    int[] expected = {1, 3};

    // When
    int[] result = new Problem150370().solution(today, terms, privacies);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String today = "2020.01.01";
    String[] terms = {"Z 3", "D 5"};
    String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D",
        "2018.12.28 Z"};
    int[] expected = {1, 4, 5};

    // When
    int[] result = new Problem150370().solution(today, terms, privacies);

    // Then
    assertArrayEquals(expected, result);
  }
}
