package level0.problem181800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 배열의 원소 삭제하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 */
public class Problem181844 {

  public int[] solution01(int[] arr, int[] delete_list) {

    boolean[] isAnswerArr = new boolean[arr.length];

    for (int a = 0; a < arr.length; a++) {
      for (int b = 0; b < delete_list.length; b++) {
        if (arr[a] == delete_list[b]) {
          isAnswerArr[a] = true;
        }
      }
    }

    List<Integer> answers = new ArrayList<>();
    for (int a = 0; a < isAnswerArr.length; a++) {
      if (!isAnswerArr[a]) {
        answers.add(arr[a]);
      }
    }

    return answers.stream().mapToInt(m -> m).toArray();
  }

  public int[] solution02(int[] arr, int[] delete_list) {
    
    Set<Integer> deletes = Arrays.stream(delete_list)
        .boxed()
        .collect(Collectors.toSet());

    return Arrays.stream(arr)
        .map(a -> deletes.contains(a) ? 0 : a)
        .filter(a -> a != 0)
        .toArray();
  }

  public int[] solution(int[] arr, int[] delete_list) {
    return IntStream.of(arr)
        .filter(i -> !IntStream.of(delete_list)
            .anyMatch(s -> s == i))
        .toArray();
  }
}
