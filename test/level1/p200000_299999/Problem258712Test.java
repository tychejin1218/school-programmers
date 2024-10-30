package level1.p200000_299999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem258712Test {

  @Test
  void solution01() {

    // Given
    String[] friends = {"muzi", "ryan", "frodo", "neo"};
    String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi",
        "frodo muzi", "frodo ryan", "neo muzi"};
    int expected = 2;

    // When
    int result = new Problem258712().solution(friends, gifts);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
    String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro",
        "alessandro david"};
    int expected = 4;

    // When
    int result = new Problem258712().solution(friends, gifts);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] friends = {"a", "b", "c"};
    String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
    int expected = 0;

    // When
    int result = new Problem258712().solution(friends, gifts);

    // Then
    assertEquals(expected, result);
  }
}
