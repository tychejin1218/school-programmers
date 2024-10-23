package level0.p181800_181899;

import java.util.stream.IntStream;

/**
 * 1로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181880
 */
public class Problem181880 {

  public int solution01(int[] num_list) {
    int answer = 0;

    for (int i = 0; i < num_list.length; i++) {
      int num = num_list[i];
      int count = 0;
      while (num != 1) {
        if (num % 2 == 0) {
          num = num / 2;
        } else {
          num = (num - 1) / 2;
        }
        count++;
      }
      answer += count;
    }

    return answer;
  }

  public int solution(int[] num_list) {
    return IntStream.range(0, num_list.length)
        .map(i -> {
          int num = num_list[i];
          int count = 0;
          while (num != 1) {
            num = num % 2 == 0 ? num / 2 : (num - 1) / 2;
            count++;
          }
          return count;
        })
        .sum();
  }
}
