package level1;

/**
 * [PCCP 기출문제] 1번 / 동영상 재생기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 */
public class Problem340213 {

  public String solution(String video_len,
      String pos,
      String op_start,
      String op_end,
      String[] commands) {

    int videoLenSec = (Integer.parseInt(video_len.substring(0, 2)) * 60) +
        (Integer.parseInt(video_len.substring(3, 5)));
    int posSec = (Integer.parseInt(pos.substring(0, 2)) * 60) +
        (Integer.parseInt(pos.substring(3, 5)));
    int opStartSec = (Integer.parseInt(op_start.substring(0, 2)) * 60) +
        (Integer.parseInt(op_start.substring(3, 5)));
    int opEndSec = (Integer.parseInt(op_end.substring(0, 2)) * 60) +
        (Integer.parseInt(op_end.substring(3, 5)));

    if (opStartSec <= posSec && opEndSec >= posSec) {
      posSec = opEndSec;
    }

    for (String command : commands) {

      if ("next".equals(command)) {
        posSec = Math.min(posSec + 10, videoLenSec);
      } else if ("prev".equals(command)) {
        posSec = Math.max(posSec - 10, 0);
      }

      if (opStartSec <= posSec && opEndSec >= posSec) {
        posSec = opEndSec;
      }
    }

    return String.format("%02d:%02d", (posSec / 60), (posSec % 60));
  }
}
