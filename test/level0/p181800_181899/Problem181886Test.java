package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181886Test {

  @Test
  void solution01() {

    // Given
    String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
    String[] expected = {"nami", "vex"};

    // When
    String[] result = new Problem181886().solution(names);

    // Then
    assertArrayEquals(expected, result);
  }
}
