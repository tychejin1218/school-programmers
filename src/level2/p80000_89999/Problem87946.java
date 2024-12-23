package level2.p80000_89999;

import java.util.ArrayList;
import java.util.List;

/**
 * 피로도
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */
public class Problem87946 {

  public int solution(int k, int[][] dungeons) {
    int maxDungeons = 0;

    List<int[][]> dungeonList = new ArrayList<>();
    generateDungeonList(dungeonList, dungeons, 0);
    for (int[][] dungeon : dungeonList) {
      int tempDungeons = getMaxDungeons(k, dungeon);
      if (tempDungeons > maxDungeons) {
        maxDungeons = tempDungeons;
      }
    }

    return maxDungeons;
  }

  public int getMaxDungeons(int currentFatigue, int[][] dungeons) {

    int maxDungeons = 0;

    int tempFatigue = currentFatigue;
    for (int[] dungeon : dungeons) {
      int minimumFatigue = dungeon[0];
      int consumedFatigue = dungeon[1];
      if (tempFatigue >= minimumFatigue) {
        tempFatigue -= consumedFatigue;
        maxDungeons++;
      }
    }

    return maxDungeons;
  }

  public void generateDungeonList(List<int[][]> dungeonList, int[][] dungeons, int depth) {

    if (depth == dungeons.length) {
      int[][] tempDungeons = new int[dungeons.length][];
      for (int i = 0; i < dungeons.length; i++) {
        tempDungeons[i] = dungeons[i].clone();
      }
      dungeonList.add(tempDungeons);
      return;
    }

    for (int i = depth; i < dungeons.length; i++) {
      swap(dungeons, depth, i);
      generateDungeonList(dungeonList, dungeons, depth + 1);
      swap(dungeons, depth, i);
    }
  }

  public void swap(int[][] array, int i, int j) {
    int[] temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
