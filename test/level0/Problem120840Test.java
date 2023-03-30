package level0;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class Problem120840Test {

  @Test
  void solution01() {

    // Given
    int balls = 3;
    int share = 2;
    BigInteger expected = new BigInteger("3");

    // When
    BigInteger result = new Problem120840().solution(balls, share);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int balls = 5;
    int share = 3;
    BigInteger expected = new BigInteger("10");

    // When
    BigInteger result = new Problem120840().solution(balls, share);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int balls = 21;
    int share = 3;
    BigInteger expected = new BigInteger("1330");

    // When
    BigInteger result = new Problem120840().solution(balls, share);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int balls = 1;
    int share = 1;
    BigInteger expected = new BigInteger("1");

    // When
    BigInteger result = new Problem120840().solution(balls, share);

    // Then
    assertEquals(expected, result);
  }
}
