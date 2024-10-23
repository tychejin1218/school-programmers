package level0.p120000_129999;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 외계어 사전
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120869
 */
public class Problem120869 {

  public int solution01(String[] spell, String[] dic) {

    int answer = 2;

    for (String dicStr : dic) {

      int check = 0;
      for (String spellStr : spell) {
        if (dicStr.toString().indexOf(spellStr) != -1) {
          check++;
        }
      }

      if (check == spell.length) {
        answer = 1;
        break;
      }
    }

    return answer;
  }

  public int solution(String[] spell, String[] dic) {

    List<String> dicList = Arrays.stream(dic)
        .map(m -> m.chars()
            .sorted()
            .mapToObj(i -> String.valueOf((char) i))
            .collect(Collectors.joining()))
        .collect(Collectors.toList());
    System.out.println(dicList);

    String spellStr = Arrays.stream(spell)
        .sorted()
        .collect(Collectors.joining());
    System.out.println(spellStr);

    return dicList.contains(spellStr) ? 1 : 2;
  }
}
