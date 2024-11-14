package level0.p181900_181999;

/**
 * 간단한 논리 연산
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181917
 */
public class Problem181917 {

  public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
    return (x1 || x2) && (x3 || x4);
  }
}

// x	y	x ∨ y	x ∧ y
// 1	1	  1    	1
// 1	0	  1   	0
// 0	1	  1	    0
// 0	0	  0	    0
