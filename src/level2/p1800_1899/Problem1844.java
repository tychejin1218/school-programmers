package level2.p1800_1899;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 깊이/너비 우선 탐색(DFS/BFS)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */
public class Problem1844 {

  public int solution(int[][] maps) {

    int maxNodeX = maps.length;
    int maxNodeY = maps[0].length;

    Queue<Node> nodeQueue = new LinkedList<>();
    nodeQueue.add(new Node(0, 0, 1));

    boolean[][] isNode = new boolean[maps.length][maps[0].length];
    isNode[0][0] = true;

    while (!nodeQueue.isEmpty()) {

      Node node = nodeQueue.poll();

      int nodeX = node.x;
      int nodeY = node.y;
      int count = node.count;

      if (nodeX == maxNodeX - 1 && nodeY == maxNodeY - 1) {
        return count;
      }

      if (nodeY < maxNodeY - 1 && maps[nodeX][nodeY + 1] == 1
          && !isNode[nodeX][nodeY + 1]) {
        nodeQueue.add(new Node(nodeX, nodeY + 1, count + 1));
        isNode[nodeX][nodeY + 1] = true;
      }

      if (nodeY > 0 && maps[nodeX][nodeY - 1] == 1
          && !isNode[nodeX][nodeY - 1]) {
        nodeQueue.add(new Node(nodeX, nodeY - 1, count + 1));
        isNode[nodeX][nodeY - 1] = true;
      }

      if (nodeX < maxNodeX - 1 && maps[nodeX + 1][nodeY] == 1
          && !isNode[nodeX + 1][nodeY]) {
        nodeQueue.add(new Node(nodeX + 1, nodeY, count + 1));
        isNode[nodeX + 1][nodeY] = true;
      }

      if (nodeX > 0 && maps[nodeX - 1][nodeY] == 1
          && !isNode[nodeX - 1][nodeY]) {
        nodeQueue.add(new Node(nodeX - 1, nodeY, count + 1));
        isNode[nodeX - 1][nodeY] = true;
      }
    }

    return -1;
  }

  public static class Node {

    private int x;
    private int y;
    private int count;

    public Node(int x, int y, int count) {
      this.x = x;
      this.y = y;
      this.count = count;
    }
  }
}
