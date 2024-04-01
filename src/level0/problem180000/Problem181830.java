package level0.problem180000;

/**
 * 정사각형으로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181830
 */
public class Problem181830 {

  public int[][] solution1(int[][] arr) {
    int[][] answer = {};

    int rowLen = arr.length;
    int colLen = arr[0].length;

    if (rowLen == colLen) {
      answer = arr;
    } else if (rowLen > colLen) {
      answer = new int[rowLen][rowLen];
      for (int a = 0; a < rowLen; a++) {
        for (int b = 0; b < colLen; b++) {
          if (b >= colLen) {
            answer[a][b] = 0;
          } else {
            answer[a][b] = arr[a][b];
          }
        }
      }
    } else if (rowLen < colLen) {
      answer = new int[colLen][colLen];
      for (int a = 0; a < colLen; a++) {
        for (int b = 0; b < colLen; b++) {
          if (a >= rowLen) {
            answer[a][b] = 0;
          } else {
            answer[a][b] = arr[a][b];
          }
        }
      }
    }

    return answer;
  }

  public int[][] solution(int[][] arr) {

    int rowLen = arr.length;
    int colLen = arr[0].length;

    if (rowLen == colLen) {
      return arr;
    }

    int ansLen = Math.max(rowLen, colLen);
    int[][] answer = new int[ansLen][ansLen];
    for (int a = 0; a < ansLen; a++) {
      for (int b = 0; b < ansLen; b++) {
        if (a >= rowLen || b >= colLen) {
          answer[a][b] = 0;
        } else {
          answer[a][b] = arr[a][b];
        }
      }
    }

    return answer;
  }
}
