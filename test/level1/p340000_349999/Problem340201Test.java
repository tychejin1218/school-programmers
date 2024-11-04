package level1.p340000_349999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem340201Test {

  @Test
  void solution01() {

    // Given
    int seat = 5;
    String[][] passengers = {{"On", "On", "On"}, {"Off", "On", "-"}, {"Off", "-", "-"}};
    int expected = 3;

    // When
    int result = new Problem340201().solution(seat, passengers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int seat = 10;
    String[][] passengers = {{"On", "On", "On", "On", "On", "On", "On", "On", "-", "-"},
        {"On", "On", "Off", "Off", "Off", "On", "On", "-", "-", "-"},
        {"On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"},
        {"On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"}};
    int expected = 0;

    // When
    int result = new Problem340201().solution(seat, passengers);

    // Then
    assertEquals(expected, result);
  }
}
