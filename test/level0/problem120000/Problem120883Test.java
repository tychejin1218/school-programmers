package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120883Test {

  @Test
  void solution01() {

    // Given
    String[] id_pw = {"meosseugi", "1234"};
    String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
    String expected = "login";

    // When
    String result = new Problem120883().solution(id_pw, db);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] id_pw = {"programmer01", "15789"};
    String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
    String expected = "wrong pw";

    // When
    String result = new Problem120883().solution(id_pw, db);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] id_pw = {"rabbit04", "98761"};
    String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
    String expected = "fail";

    // When
    String result = new Problem120883().solution(id_pw, db);

    // Then
    assertEquals(expected, result);
  }
}
