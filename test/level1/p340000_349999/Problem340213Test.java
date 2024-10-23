package level1.p340000_349999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem340213Test {

  @Test
  void solution01() {

    // Given
    String video_len = "34:33";
    String pos = "13:00";
    String op_start = "00:55";
    String op_end = "02:55";
    String[] commands = {"next", "prev"};
    String expected = "13:00";

    // When
    String result = new Problem340213().solution(video_len, pos, op_start, op_end, commands);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String video_len = "10:55";
    String pos = "00:05";
    String op_start = "00:15";
    String op_end = "06:55";
    String[] commands = {"prev", "next", "next"};
    String expected = "06:55";

    // When
    String result = new Problem340213().solution(video_len, pos, op_start, op_end, commands);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String video_len = "07:22";
    String pos = "04:05";
    String op_start = "00:15";
    String op_end = "04:07";
    String[] commands = {"next"};
    String expected = "04:17";

    // When
    String result = new Problem340213().solution(video_len, pos, op_start, op_end, commands);

    // Then
    assertEquals(expected, result);
  }
}
