package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12933Test {

  @Test
  void solution01() {

    // Given
    long n = 118372L;
    long expected = 873211L;

    // When
    long result = new Problem12933().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
