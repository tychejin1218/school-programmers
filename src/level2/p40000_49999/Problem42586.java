package level2.p40000_49999;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 기능개발
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Problem42586 {

  public int[] solution(int[] progresses, int[] speeds) {

    int progressLen = progresses.length;

    Queue<Integer> dayQueue = new LinkedList<>();
    for (int i = 0; i < progressLen; i++) {
      dayQueue.add(getDay(progresses[i], speeds[i]));
    }

    List<Integer> dayList = new LinkedList<>();
    dayList.add(dayQueue.peek());

    Map<Integer, Integer> dayMap = new LinkedHashMap<>();
    do {

      int lastDay = dayList.get(dayList.size() - 1);
      int currentDay = dayQueue.poll();

      if (lastDay >= currentDay) {
        dayMap.put(lastDay, dayMap.getOrDefault(lastDay, 0) + 1);
      } else {
        dayList.add(currentDay);
        dayMap.put(currentDay, 1);
      }
    } while (!dayQueue.isEmpty());

    return dayMap.values().stream()
        .mapToInt(i -> i)
        .toArray();
  }

  public int getDay(int progress, int speed) {
    return (int) Math.ceil((100.0 - progress) / speed);
  }
}
