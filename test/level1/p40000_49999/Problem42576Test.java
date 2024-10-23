package level1.p40000_49999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem42576Test {

  @Test
  void solution01() {

    // Given
    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};
    String expected = "leo";

    // When
    String result = new Problem42576().solution(participant, completion);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};
    String expected = "vinko";

    // When
    String result = new Problem42576().solution(participant, completion);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};
    String expected = "mislav";

    // When
    String result = new Problem42576().solution(participant, completion);

    // Then
    assertEquals(expected, result);
  }
}
