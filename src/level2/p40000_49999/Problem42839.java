package level2.p40000_49999;

import java.util.HashSet;
import java.util.Set;

/**
 * 소수 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class Problem42839 {

  public int solution(String numbers) {

    Set<Integer> allNumSet = new HashSet<>();

    getAllNumbers("", numbers, allNumSet);

    return (int) allNumSet.stream()
        .filter(this::isPrime)
        .count();
  }

  public void getAllNumbers(String cNum, String rNum, Set<Integer> allNumSet) {

    if (!cNum.isBlank()) {
      allNumSet.add(Integer.parseInt(cNum));
    }

    for (int i = 0; i < rNum.length(); i++) {
      getAllNumbers(
          cNum + rNum.charAt(i),
          rNum.substring(0, i) + rNum.substring(i + 1),
          allNumSet);
    }
  }

  public boolean isPrime(int num) {

    if (num < 2) {
      return false;
    }

    if (num == 2) {
      return true;
    }

    if (num % 2 == 0) {
      return false;
    }

    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}

