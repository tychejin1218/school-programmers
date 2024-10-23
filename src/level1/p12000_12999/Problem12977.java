package level1.p12000_12999;

/**
 * 소수 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */
public class Problem12977 {

  public int solution(int[] nums) {
    int answer = 0;

    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int sum = nums[i] + nums[j] + nums[k];
          if (isPrime(sum)) {
            answer++;
          }
        }
      }
    }

    return answer;
  }

  private boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
