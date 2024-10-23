package level0.p120000_129999;

/**
 * 특정 문자 제거하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120826
 */
public class Problem120826 {

  public String solution(String my_string, String letter) {
    return my_string.replace(letter, "");
  }

  /*public String solution(String my_string, String letter) {
    return Arrays.stream(my_string.split(""))
        .filter(p -> !p.equals(letter))
        .collect(Collectors.joining());
  }*/
}
