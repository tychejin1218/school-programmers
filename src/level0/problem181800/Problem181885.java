package level0.problem181800;

import java.util.stream.IntStream;

/**
 * 할 일 목록
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */
public class Problem181885 {

  public String[] solution(String[] todo_list, boolean[] finished) {
    return IntStream.range(0, todo_list.length)
        .filter(i -> !finished[i])
        .mapToObj(i -> todo_list[i])
        .toArray(String[]::new);
  }
}
