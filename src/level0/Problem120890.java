package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 가까운 수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */
public class Problem120890 {

  public int solution(int[] array, int n) {
    int answer = 0;

    List<Integer> nums = Arrays.stream(array)
        .boxed()
        .collect(Collectors.toList());

    if (nums.indexOf(n) != -1) {
      answer = n;
    } else {

      nums.add(n);

      Collections.sort(nums);

      int index = nums.indexOf(n);
      if (index == 0) {
        answer = nums.get(index + 1);
      } else if (index == nums.size() - 1) {
        answer = nums.get(index - 1);
      } else {
        int num1 = nums.get(index - 1);
        int num2 = nums.get(index + 1);
        int distance1 = Math.abs(n - num1);
        int distance2 = Math.abs(n - num2);
        if (distance1 > distance2) {
          answer = num2;
        } else if (distance1 < distance2) {
          answer = num1;
        } else {
          answer = num1;
        }
      }
    }

    return answer;
  }
}
