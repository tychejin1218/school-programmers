package level1.p160000_169999;

/**
 * 덧칠하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */
public class Problem161989 {

  public int solution01(int n, int m, int[] section) {

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

  public int solution(int n, int m, int[] section) {

    int answer = 0;

    int sectionIdx = 0;
    int sectionLen = section.length;

    while (sectionIdx < sectionLen) {

      int startSectionVal = section[sectionIdx];
      int endSectionVal = startSectionVal + m - 1;

      while (sectionIdx < sectionLen && section[sectionIdx] <= endSectionVal) {
        sectionIdx++;
      }

      answer++;
    }

    return answer;
  }
}
