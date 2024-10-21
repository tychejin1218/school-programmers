package level1;

/**
 * 덧칠하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */
public class Problem161989 {

  public int solution(int n, int m, int[] section) {

    int answer = 0;

    if (n == m) {
      answer = 1;
    } else {

      int sectionIdx = 1;
      int sectionLen = section.length;
      int sectionDiff = 0;

      while (sectionLen > sectionIdx) {

        int curSectionVal = section[sectionIdx - 1];
        int preSectionVal = section[sectionIdx];
        sectionDiff += (preSectionVal - curSectionVal);

        if (sectionDiff >= m) {
          answer++;
          sectionDiff = 0;
        }
        sectionIdx++;
      }

      if (m >= sectionDiff) {
        answer++;
      }
    }

    return answer;
  }
}
