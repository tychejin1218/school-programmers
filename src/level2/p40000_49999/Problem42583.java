package level2.p40000_49999;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 다리를 지나는 트럭
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42583?
 */
public class Problem42583 {

  public int solution(int bridge_length, int weight, int[] truck_weights) {

    int answer = bridge_length;
    int bridgeWeight = 0;

    Queue<Integer> bridgeQueue = new LinkedList<>();
    for(int i=0; i<bridge_length; i++) {
      bridgeQueue.offer(0);
    }

    int i = 0;
    while(i < truck_weights.length) {

      bridgeWeight -= bridgeQueue.poll();

      if(bridgeWeight + truck_weights[i] <= weight) {
        bridgeQueue.offer(truck_weights[i]);
        bridgeWeight += truck_weights[i];
        i++;
      } else {
        bridgeQueue.offer(0);
      }
      answer++;
    }

    return answer;
  }
}