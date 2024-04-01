package level0.problem120000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 최빈값 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 */
public class Problem120812 {

  public int solution(int[] array) {

    int answer;

    // 주어진 값을 키로 설정하고, 주어진 값의 밸류가 중복된 경우 1씩 증가
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : array) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // 밸류가 최대인 값을 조회
    Integer maxValue = map.entrySet()
        .stream()
        .max((p1, p2) -> p1.getValue() > p2.getValue() ? 1 : -1)
        .get()
        .getValue();
    System.out.println("maxValue: " + maxValue);

    // 밸류가 최대인 값의 키를 모두 조회 == 최빈값
    List<Integer> modes = map.entrySet()
        .stream()
        .filter(p -> p.getValue() == maxValue)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
    System.out.println("modes : " + modes);

    // 최빈값에 따른 answer 설정
    answer = modes.size() == 1 ? modes.get(0) : -1;
    System.out.println("answer : " + answer);

    return answer;
  }

  /*public int solution(int[] array) {

    int maxCount = 0;
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();

    for (int number : array) {
      int count = map.getOrDefault(number, 0) + 1;
      if (count > maxCount) {
        maxCount = count;
        answer = number;
      } else if (count == maxCount) {
        answer = -1;
      }
      map.put(number, count);
    }

    return answer;
  }*/
}
