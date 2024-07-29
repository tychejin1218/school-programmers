package level1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 폰켓몬
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class Problem1845 {

  public int solution(int[] nums) {

    Set<Integer> numSet = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());

    int midpointOfNums = nums.length / 2;
    int sizeOfNumSet = numSet.size();

    return sizeOfNumSet > midpointOfNums ? midpointOfNums : sizeOfNumSet;
  }
}
