package level1.p340000_349999;

/**
 * [PCCE 기출문제] 6번 / 물 부족
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340202
 */
public class Problem340202 {

  public int solution(int storage, int usage, int[] change) {
    int total_usage = 0;
    for(int i=0; i<change.length; i++){

      usage = usage + change[i] / 100;

      usage = total_usage * change[i] / 100;
      total_usage += usage;
      if(total_usage > storage){
        return i;
      }
    }
    return -1;
  }
}
