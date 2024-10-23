package level0.p250000_259999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem250126Test {

  @Test
  void solution01() {

    // Given
    String[] storage = {"pencil", "pencil", "pencil", "book"};
    int[] num = {2, 4, 3, 1};
    String expected = "pencil";

    // When
    String result = new Problem250126().solution(storage, num);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] storage = {"doll", "doll", "doll", "doll"};
    int[] num = {1, 1, 1, 1};
    String expected = "doll";

    // When
    String result = new Problem250126().solution(storage, num);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] storage = {"apple", "steel", "leaf", "apple", "leaf"};
    int[] num = {5, 3, 5, 3, 7};
    String expected = "leaf";

    // When
    String result = new Problem250126().solution(storage, num);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String[] storage = {"mirror", "net", "mirror", "net", "bottle"};
    int[] num = {4, 1, 4, 1, 5};
    String expected = "mirror";

    // When
    String result = new Problem250126().solution(storage, num);

    // Then
    assertEquals(expected, result);
  }


}
