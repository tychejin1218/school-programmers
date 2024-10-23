package level0.p120000_129999;

import java.util.stream.IntStream;

/**
 * 옹알이 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
public class Problem120956 {

  public int solution(String[] babbling) {
    String[] tempArr = {"aya", "ye", "woo", "ma"};
    return (int) IntStream.range(0, babbling.length)
        .mapToObj(m -> {
          String replaceStr = babbling[m];
          for (String tempStr : tempArr) {
            replaceStr = replaceStr.replaceAll(tempStr, "_");
          }
          replaceStr = replaceStr.replaceAll("_", "");
          return "".equals(replaceStr) ? 1 : 0;
        })
        .filter(p -> p == 1)
        .count();
  }
}
