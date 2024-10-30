package level1.p200000_299999;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 가장 많이 받은 선물
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712
 */
public class Problem258712 {

  public int solution(String[] friends, String[] gifts) {

    Map<String, Integer> sendCount = new HashMap<>();
    Map<String, Integer> receiveCount = new HashMap<>();
    Map<String, Integer> giftIndex = new HashMap<>();
    Map<String, Set<String>> giftPairs = new HashMap<>();

    for (String friend : friends) {
      sendCount.put(friend, 0);
      receiveCount.put(friend, 0);
      giftIndex.put(friend, 0);
      giftPairs.put(friend, new HashSet<>());
    }

    for (String gift : gifts) {
      String[] parts = gift.split(" ");
      String sender = parts[0];
      String receiver = parts[1];

      sendCount.put(sender, sendCount.get(sender) + 1);
      receiveCount.put(receiver, receiveCount.get(receiver) + 1);
      giftIndex.put(sender, sendCount.get(sender) - receiveCount.get(sender));
      giftIndex.put(receiver, sendCount.get(receiver) - receiveCount.get(receiver));
      giftPairs.get(sender).add(receiver);
      giftPairs.get(receiver).add(sender);
    }

    Map<String, Integer> nextMonthReceiveCount = new HashMap<>();
    for (String friend : friends) {
      nextMonthReceiveCount.put(friend, 0);
    }

    for (String friend1 : friends) {
      for (String friend2 : friends) {
        if (!friend1.equals(friend2)) {
          int giftsFromFriend1ToFriend2 = giftsCount(gifts, friend1, friend2);
          int giftsFromFriend2ToFriend1 = giftsCount(gifts, friend2, friend1);
          if (giftsFromFriend1ToFriend2 > giftsFromFriend2ToFriend1) {
            nextMonthReceiveCount.put(friend1, nextMonthReceiveCount.get(friend1) + 1);
          } else if (giftsFromFriend1ToFriend2 == giftsFromFriend2ToFriend1) {
            if (giftIndex.get(friend1) > giftIndex.get(friend2)) {
              nextMonthReceiveCount.put(friend1, nextMonthReceiveCount.get(friend1) + 1);
            }
          }
        }
      }
    }

    int maxGifts = 0;
    for (int count : nextMonthReceiveCount.values()) {
      maxGifts = Math.max(maxGifts, count);
    }

    return maxGifts;
  }

  private int giftsCount(String[] gifts, String sender, String receiver) {
    int count = 0;
    for (String gift : gifts) {
      String[] parts = gift.split(" ");
      if (parts[0].equals(sender) && parts[1].equals(receiver)) {
        count++;
      }
    }
    return count;
  }
}
