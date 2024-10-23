package level1.p17000_17999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem17681Test {

  @Test
  void solution01() {

    // Given
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    String[] expected = {"#####", "# # #", "### #", "#  ##", "#####"};

    // When
    String[] result = new Problem17681().solution(n, arr1, arr2);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 6;
    int[] arr1 = {46, 33, 33, 22, 31, 50};
    int[] arr2 = {27, 56, 19, 14, 14, 10};
    String[] expected = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};

    // When
    String[] result = new Problem17681().solution(n, arr1, arr2);

    // Then
    assertArrayEquals(expected, result);
  }
}
