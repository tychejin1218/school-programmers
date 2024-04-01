package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120869Test {

  @Test
  void solution01() {

    // Given
    String[] spell = {"p", "o", "s"};
    String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
    int expected = 2;

    // When
    int result = new Problem120869().solution(spell, dic);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] spell = {"z", "d", "x"};
    String[] dic = {"def", "dww", "dzx", "loveaw"};
    int expected = 1;

    // When
    int result = new Problem120869().solution(spell, dic);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] spell = {"s", "o", "m", "d"};
    String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
    int expected = 2;

    // When
    int result = new Problem120869().solution(spell, dic);

    // Then
    assertEquals(expected, result);
  }
}
