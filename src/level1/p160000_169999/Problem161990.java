package level1.p160000_169999;

/**
 * 바탕화면 정리
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/161990
 */
public class Problem161990 {

  public int[] solution01(String[] wallpaper) {

    int lux = -1;
    int luy = -1;
    int rdx = -1;
    int rdy = -1;

    for (int i = 0; i < wallpaper.length; i++) {
      if (wallpaper[i].contains("#")) {
        if (lux == -1) {
          lux = i;
        }
        rdx = i;
      }

      String[] wallpaperArr = wallpaper[i].split("");
      for (int j = 0; j < wallpaperArr.length; j++) {
        if ("#".equals(wallpaperArr[j])) {
          if (luy == -1) {
            luy = j;
          }
          if (luy > j) {
            luy = j;
          }
          if (rdy == -1) {
            rdy = j;
          }
          if(j > rdy){
            rdy = j;
          }
        }
      }
    }

    if (rdx > -1) {
      rdx++;
    }

    if (rdy > -1) {
      rdy++;
    }

    return new int[]{lux, luy, rdx, rdy};
  }

  public int[] solution02(String[] wallpaper) {

    int lux = Integer.MAX_VALUE;
    int luy = Integer.MAX_VALUE;
    int rdx = Integer.MIN_VALUE;
    int rdy = Integer.MIN_VALUE;

    for (int i = 0; i < wallpaper.length; i++) {
      for (int j = 0; j < wallpaper[i].length(); j++) {
        if (wallpaper[i].charAt(j) == '#') {
          lux = Math.min(lux, i);
          luy = Math.min(luy, j);
          rdx = Math.max(rdx, i + 1);
          rdy = Math.max(rdy, j + 1);
        }
      }
    }

    return new int[]{lux, luy, rdx, rdy};
  }

  public int[] solution(String[] wallpaper) {

    int lux = Integer.MAX_VALUE;
    int luy = Integer.MAX_VALUE;
    int rdx = Integer.MIN_VALUE;
    int rdy = Integer.MIN_VALUE;

    for (int i = 0; i < wallpaper.length; i++) {
      if (wallpaper[i].contains("#")) {
        lux = Math.min(lux, i);
        rdx = Math.max(rdx, i + 1);
      }

      char[] wallpaperCharArr = wallpaper[i].toCharArray();
      for (int j = 0; j < wallpaperCharArr.length; j++) {
        if (wallpaperCharArr[j] == '#') {
          luy = Math.min(luy, j);
          rdy = Math.max(rdy, j + 1);
        }
      }
    }

    return new int[]{lux, luy, rdx, rdy};
  }
}
