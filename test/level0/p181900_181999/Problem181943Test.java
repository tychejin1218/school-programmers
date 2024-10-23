package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181943Test {

  @Test
  void solution01() {

    // Given
    String my_string = "He11oWor1d";
    String overwrite_string = "lloWorl";
    int s = 2;
    String expected = "HelloWorld";

    // When
    String result = new Problem181943().solution(my_string, overwrite_string, s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "Program29b8UYP";
    String overwrite_string = "merS123";
    int s = 7;
    String expected = "ProgrammerS123";

    // When
    String result = new Problem181943().solution(my_string, overwrite_string, s);

    // Then
    assertEquals(expected, result);
  }
}
