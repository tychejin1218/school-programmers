package level2.p17000_17999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17680Test {

  @Test
  void solution01() {

    // Given
    int cacheSize = 3;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
    int expected = 50;

    // When
    int result = new Problem17680().solution(cacheSize, cities);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int cacheSize = 3;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
    int expected = 21;

    // When
    int result = new Problem17680().solution(cacheSize, cities);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int cacheSize = 2;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
    int expected = 60;

    // When
    int result = new Problem17680().solution(cacheSize, cities);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int cacheSize = 5;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
    int expected = 52;

    // When
    int result = new Problem17680().solution(cacheSize, cities);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    int cacheSize = 2;
    String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
    int expected = 16;

    // When
    int result = new Problem17680().solution(cacheSize, cities);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution06() {

    // Given
    int cacheSize = 0;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
    int expected = 25;

    // When
    int result = new Problem17680().solution(cacheSize, cities);

    // Then
    assertEquals(expected, result);
  }
}
