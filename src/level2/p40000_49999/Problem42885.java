package level2.p40000_49999;

import java.util.Arrays;

/**
 * 구명보트
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 */
public class Problem42885 {

  public int solution(int[] people, int limit) {

    Arrays.sort(people);

    int left = 0;
    int right = people.length - 1;
    int boatsCount = 0;

    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        left++;
      }
      right--;
      boatsCount++;
    }

    return boatsCount;
  }
}
