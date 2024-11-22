package level2.p12000_12999;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 영어 끝말잇기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */
public class Problem12981 {

  public int[] solution(int n, String[] words) {

    Map<Integer, Player> playerMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      playerMap.put(i, new Player(new ArrayList<>()));
    }

    List<String> spokenWordList = new ArrayList<>();
    String previousWord = "";

    for (int i = 0; i < words.length; i++) {
      int playerIndex = i % n;
      String currentWord = words[i];

      Player player = playerMap.get(playerIndex);
      List<String> playerWordList = player.getPlayerWordList();

      if (spokenWordList.contains(currentWord) ||
          (!previousWord.isEmpty() &&
              previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0))) {
        return new int[]{playerIndex + 1, playerWordList.size() + 1};
      }

      player.addWord(currentWord);
      playerMap.put(playerIndex, player);
      spokenWordList.add(currentWord);
      previousWord = currentWord;
    }

    return new int[]{0, 0};
  }

  public static class Player {

    private final List<String> playerWordList;

    public Player(List<String> playerWordList) {
      this.playerWordList = playerWordList;
    }

    public void addWord(String word) {
      this.playerWordList.add(word);
    }

    public List<String> getPlayerWordList() {
      return playerWordList;
    }
  }
}
