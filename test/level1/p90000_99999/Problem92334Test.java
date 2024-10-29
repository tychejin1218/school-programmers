package level1.p90000_99999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem92334Test {

  @Test
  void solution01() {

    // Given
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2;
    int[] expected = {2, 1, 1, 0};

    // When
    int[] result = new Problem92334().solution(id_list, report, k);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] id_list = {"con", "ryan"};
    String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    int k = 3;
    int[] expected = {0, 0};

    // When
    int[] result = new Problem92334().solution(id_list, report, k);

    // Then
    assertArrayEquals(expected, result);
  }
}
