package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181885Test {

  @Test
  void solution01() {

    // Given
    String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
    boolean[] finished = {true, false, true, false};
    String[] expected = {"practiceguitar", "studygraph"};

    // When
    String[] result = new Problem181885().solution(todo_list, finished);

    // Then
    assertArrayEquals(expected, result);
  }
}
