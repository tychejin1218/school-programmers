package level0.p120000_129999;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 가위 바위 보
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120839
 */
public class Problem120839 {

  public String solution(String rsp) {
    return Arrays.stream(rsp.split(""))
        .map(m ->
            m.equals("2") ? "0" :
                m.equals("0") ? "5" :
                    m.equals("5") ? "2" : "")
        .collect(Collectors.joining());
  }
}
