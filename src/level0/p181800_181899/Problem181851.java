package level0.p181800_181899;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 전국 대회 선발 고사
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181851
 */
public class Problem181851 {

  public int solution01(int[] rank, boolean[] attendance) {

    for (int a = 0; a < attendance.length; a++) {
      if (!attendance[a]) {
        rank[a] = 101;
      }
    }

    int[] sortRank = Arrays.copyOf(rank, rank.length);
    Arrays.sort(sortRank);

    int[] orderArr = new int[3];
    for (int a = 0; a < orderArr.length; a++) {
      for (int b = 0; b < rank.length; b++) {
        if (sortRank[a] == rank[b]) {
          orderArr[a] = b;
        }
      }
    }

    return (10000 * orderArr[0]) + (100 * orderArr[1]) + orderArr[2];
  }

  public int solution02(int[] rank, boolean[] attendance) {
    return IntStream.range(0, rank.length)
        .filter(i -> attendance[i])
        .boxed()
        .sorted(Comparator.comparing(i -> rank[i]))
        .limit(3L)
        .reduce((current, next) -> current * 100 + next)
        .get();
  }

  public int solution(int[] rank, boolean[] attendance) {

    int[] indexArr = IntStream.range(0, rank.length)
        .filter(i -> attendance[i])
        .boxed()
        .sorted(Comparator.comparing(i -> rank[i]))
        .mapToInt(Integer::intValue)
        .limit(3)
        .toArray();

    return (10000 * indexArr[0]) + (100 * indexArr[1]) + indexArr[2];
  }
}
