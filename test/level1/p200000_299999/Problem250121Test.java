package level1.p200000_299999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem250121Test {

  @Test
  void solution01() {

    // Given
    int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
    String ext = "date";
    int val_ext = 20300501;
    String sort_by = "remain";
    int[][] expected = {{3,20300401,10,8},{1,20300104,100,80}};

    // When
    int[][] result = new Problem250121().solution(data, ext, val_ext, sort_by);

    // Then
    assertArrayEquals(expected, result);
  }
}
