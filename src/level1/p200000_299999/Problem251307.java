package level1.p200000_299999;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * [PCCP 기출문제] 1번 / 붕대 감기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/251307
 */
public class Problem251307 {

  public int solution(int[] bandage, int health, int[][] attacks) {

    int castingTime = bandage[0];
    int healingPerSecond = bandage[1];
    int additionalHealing = bandage[2];

    int currentTime = 0;
    int currentHealth = health;
    int healthChange = 0;

    Map<Integer, Integer> attackTimeMap = new HashMap<>();
    for (int[] attack : attacks) {
      attackTimeMap.put(attack[0], attack[1]);
    }
    int finalAttackTime = Collections.max(attackTimeMap.keySet());

    while (finalAttackTime >= 0 && currentHealth > 0) {

      if (attackTimeMap.getOrDefault(currentTime, 0) != 0) {
        currentHealth -= attackTimeMap.get(currentTime);
        healthChange = 0;
      } else if (currentHealth < health) {
        currentHealth += healingPerSecond;
        healthChange++;
      }

      if (healthChange == castingTime) {
        currentHealth += additionalHealing;
        healthChange = 0;
      }

      if (currentHealth > health) {
        currentHealth = health;
      }

      currentTime++;
      finalAttackTime--;
    }

    return currentHealth > 0 ? currentHealth : -1;
  }
}

