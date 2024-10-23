package level1.p170000_179999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem176963Test {

  @Test
  void solution01() {

    // Given
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
        {"kon", "kain", "may", "coni"}};
    int[] expected = {19, 15, 6};

    // When
    int[] result = new Problem176963().solution(name, yearning, photo);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] name = {"kali", "mari", "don"};
    int[] yearning = {11, 1, 55};
    String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
    int[] expected = {67, 0, 55};

    // When
    int[] result = new Problem176963().solution(name, yearning, photo);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
    int[] expected = {5, 15, 0};

    // When
    int[] result = new Problem176963().solution(name, yearning, photo);

    // Then
    assertArrayEquals(expected, result);
  }
}
