package level2.p40000_49999;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로세스
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
 */
public class Problem42587 {

  public int solution(int[] priorities, int location) {

    int answer = 0;

    Queue<Priority> priorityQueue = new LinkedList<>();
    for (int i = 0; i < priorities.length; i++) {
      boolean isLocation = location == i;
      priorityQueue.offer(new Priority(priorities[i], isLocation));
    }

    while (!priorityQueue.isEmpty()) {

      Priority curPriority = priorityQueue.poll();
      boolean isHigherLocation = false;

      for (Priority priority : priorityQueue) {
        if (priority.priority > curPriority.priority) {
          isHigherLocation = true;
          break;
        }
      }

      if (isHigherLocation) {
        priorityQueue.offer(curPriority);
      } else {
        answer++;
        if (curPriority.isLocation) {
          return answer;
        }
      }
    }

    return answer;
  }

  public static class Priority {

    private int priority;
    private boolean isLocation;

    public Priority(int priority, boolean isLocation) {
      this.priority = priority;
      this.isLocation = isLocation;
    }
  }
}
