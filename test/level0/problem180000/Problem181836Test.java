package level0.problem180000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181836Test {

  @Test
  void solution01() {

    // Given
    String[] picture = {
        ".xx...xx.",
        "x..x.x..x",
        "x...x...x",
        ".x.....x.",
        "..x...x..",
        "...x.x...",
        "....x...."};
    int k = 2;
    String[] expected = {
        "..xxxx......xxxx..",
        "..xxxx......xxxx..",
        "xx....xx..xx....xx",
        "xx....xx..xx....xx",
        "xx......xx......xx",
        "xx......xx......xx",
        "..xx..........xx..",
        "..xx..........xx..",
        "....xx......xx....",
        "....xx......xx....",
        "......xx..xx......",
        "......xx..xx......",
        "........xx........",
        "........xx........"};

    // When
    String[] result = new Problem181836().solution(picture, k);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] picture = {
        "x.x",
        ".x.",
        "x.x"};
    int k = 3;
    String[] expected = {
        "xxx...xxx",
        "xxx...xxx",
        "xxx...xxx",
        "...xxx...",
        "...xxx...",
        "...xxx...",
        "xxx...xxx",
        "xxx...xxx",
        "xxx...xxx"};

    // When
    String[] result = new Problem181836().solution(picture, k);

    // Then
    assertArrayEquals(expected, result);
  }
}
