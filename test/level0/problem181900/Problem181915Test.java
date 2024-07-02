package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181915Test {

  @Test
  void solution01() {

    // Given
    String my_string = "cvsgiorszzzmrpaqpe";
    int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
    String expected = "programmers";

    // When
    String result = new Problem181915().solution(my_string, index_list);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "zpiaz";
    int[] index_list = {1, 2, 0, 0, 3};
    String expected = "pizza";

    // When
    String result = new Problem181915().solution(my_string, index_list);

    // Then
    assertEquals(expected, result);
  }
}
