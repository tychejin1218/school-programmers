package level0;

/**
 * 정수를 나선형으로 배치하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181832
 */
public class Problem181832 {

  public int[][] solution(int n) {

    int[][] answer = new int[n][n];

    for (int a = 0; a < n; a++) {
      for (int b = 0; b < n; b++) {
        answer[a][b] = 0;
      }
    }

    int x = 0;
    int y = 0;
    String direction = "RIGHT";

    for (int i = 0; i < n * n; i++) {

      answer[x][y] = i + 1;

      if ("RIGHT".equals(direction)) {
        y += 1;
        if (y == n - 1 || answer[x][y + 1] != 0) {
          direction = "DOWN";
        }
      } else if ("DOWN".equals(direction)) {
        x += 1;
        if (x == n - 1 || answer[x + 1][y] != 0) {
          direction = "LEFT";
        }
      } else if ("LEFT".equals(direction)) {
        y -= 1;
        if (y == 0 || answer[x][y - 1] != 0) {
          direction = "UP";
        }
      } else if ("UP".equals(direction)) {
        x -= 1;
        if (x == 0 || answer[x - 1][y] != 0) {
          direction = "RIGHT";
        }
      }
    }

    return answer;
  }

  public int[][] solution01(int n) {

    int[][] answer = new int[n][n];
    int maxValue = n * n;
    int x = 0;
    int y = 0;
    int current = 1;

    int[] dx = {0, 1, 0, -1}; // x의 방향 (우, 하, 좌, 상)
    int[] dy = {1, 0, -1, 0}; // y의 방향 (우, 하, 좌, 상)
    int direction = 0; // 초기 방향: 우

    while (current <= maxValue) {
      answer[x][y] = current;
      int nx = x + dx[direction];
      int ny = y + dy[direction];

      if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
        direction = (direction + 1) % 4; // 방향 전환
        nx = x + dx[direction];
        ny = y + dy[direction];
      }

      x = nx;
      y = ny;
      current++;
    }

    return answer;
  }
}
