package level0.p50000_p59999;

public class Problem584270_2 {

  public int[] solution(String[] wallpaper) {

    int minX = wallpaper[0].length();
    int minY = wallpaper.length;
    int maxX = -1;
    int maxY = -1;

    for (int i = 0; i < wallpaper.length; i++) {
      for (int j = 0; j < wallpaper[i].length(); j++) {
        if (wallpaper[i].charAt(j) == '#') {
          minX = Math.min(minX, j);
          minY = Math.min(minY, i);
          maxX = Math.max(maxX, j);
          maxY = Math.max(maxY, i);
        }
      }
    }

    maxX = maxX + 1;
    maxY = maxY + 1;

    return new int[]{minY, minX, maxY, maxX};
  }
}
