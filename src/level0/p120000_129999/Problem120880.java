package level0.p120000_129999;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 특이한 정렬
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120880
 */
public class Problem120880 {

  public int[] solution(int[] numlist, int n) {

    List<Integer> nums = Arrays.stream(numlist)
        .boxed()
        .collect(Collectors.toList());
    Collections.sort(nums);

    nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
    Collections.reverse(nums);

    return nums.stream().mapToInt(Integer::intValue).toArray();
  }
}
