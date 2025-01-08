package level2.p80000_89999;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 전력망을 둘로 나누기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/86971
 */
public class Problem86971 {

  public int solution(int n, int[][] wires) {

    int minDifference = n;

    Map<Integer, List<Integer>> graphMap = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      graphMap.put(i, new ArrayList<>());
    }

    for (int[] wire : wires) {
      int nodeA = wire[0];
      int nodeB = wire[1];
      graphMap.get(nodeA).add(nodeB);
      graphMap.get(nodeB).add(nodeA);
    }

    for (int[] wire : wires) {
      int nodeA = wire[0];
      int nodeB = wire[1];

      graphMap.get(nodeA).remove((Integer) nodeB);
      graphMap.get(nodeB).remove((Integer) nodeA);

      boolean[] visited = new boolean[n + 1];
      int subtreeSizeA = countNodes(graphMap, visited, nodeA);
      int subtreeSizeB = n - subtreeSizeA;

      minDifference = Math.min(minDifference, Math.abs(subtreeSizeA - subtreeSizeB));

      graphMap.get(nodeA).add(nodeB);
      graphMap.get(nodeB).add(nodeA);
    }

    return minDifference;
  }

  public int countNodes(Map<Integer, List<Integer>> graph, boolean[] visited, int node) {

    visited[node] = true;
    int count = 1;

    for (int nextNode : graph.get(node)) {
      if (!visited[nextNode]) {
        count += countNodes(graph, visited, nextNode);
      }
    }

    return count;
  }
}
