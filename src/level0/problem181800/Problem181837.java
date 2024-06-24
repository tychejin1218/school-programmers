package level0.problem181800;

import java.util.Arrays;

/**
 * 커피 심부름
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 */
public class Problem181837 {

  public int solution(String[] order) {
    return Arrays.stream(order)
        .mapToInt(o -> {
          if (o.contains("americano") || o.contains("anything")) {
            return 4500;
          } else if(o.contains("cafelatte")){
            return 5000;
          }
          return 0;
        })
        .sum();
  }
}
