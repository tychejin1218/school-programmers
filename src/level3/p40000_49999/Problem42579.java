package level3.p40000_49999;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 베스트앨범
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42579
 */
public class Problem42579 {

  public int[] solution01(String[] genres, int[] plays) {

    Map<String, List<Album>> genreAlbumMap = new LinkedHashMap<>();

    Map<String, Integer> genrePlayMap = new HashMap<>();
    for (int i = 0; i < genres.length; i++) {
      genrePlayMap.put(genres[i], genrePlayMap.getOrDefault(genres[i], 0) + plays[i]);
    }

    List<Entry<String, Integer>> genrePlayList = new ArrayList<>(genrePlayMap.entrySet());
    genrePlayList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

    Map<String, Integer> sortedGenrePlayMap = new LinkedHashMap<>();
    for (Map.Entry<String, Integer> entry : genrePlayList) {
      sortedGenrePlayMap.put(entry.getKey(), entry.getValue());
    }

    List<Album> albumList;
    for (Map.Entry<String, Integer> entry : sortedGenrePlayMap.entrySet()) {
      for (int i = 0; i < genres.length; i++) {

        if (genres[i].equals(entry.getKey())) {

          albumList = genreAlbumMap.getOrDefault(entry.getKey(), new ArrayList<>());
          albumList.add(new Album(i, plays[i]));

          albumList.sort((a1, a2) -> Integer.compare(a2.getPlay(), a1.getPlay()));
          if (albumList.size() > 2) {
            albumList = albumList.subList(0, 2);
          }

          genreAlbumMap.put(entry.getKey(), albumList);
        }
      }
    }

    List<Integer> idxList = new ArrayList<>();
    for (Map.Entry<String, List<Album>> entry : genreAlbumMap.entrySet()) {
      for (Album album : entry.getValue()) {
        idxList.add(album.getIdx());
      }
    }

    return idxList.stream()
        .mapToInt(i -> i).toArray();
  }

  public int[] solution(String[] genres, int[] plays) {
    // 1. 장르별 총 재생횟수와 곡 저장
    Map<String, Integer> genrePlayMap = new HashMap<>();  // 장르별 총 재생 횟수
    Map<String, List<Album>> genreAlbumMap = new HashMap<>(); // 장르별 곡 리스트

    for (int i = 0; i < genres.length; i++) {
      String genre = genres[i];
      int play = plays[i];

      // 장르 총 재생 수 업데이트
      genrePlayMap.put(genre, genrePlayMap.getOrDefault(genre, 0) + play);

      // 장르 내 곡 리스트 업데이트
      genreAlbumMap
          .computeIfAbsent(genre, k -> new ArrayList<>())
          .add(new Album(i, play));
    }

    // 2. 장르별 총 재생 수로 정렬
    List<String> sortedGenres = new ArrayList<>(genrePlayMap.keySet());
    sortedGenres.sort(
        (g1, g2) -> genrePlayMap.get(g2).compareTo(genrePlayMap.get(g1))); // 장르별 재생 횟수 내림차순

    // 3. 장르별로 가장 많이 재생된 곡 두 개씩 선택
    List<Integer> result = new ArrayList<>();
    for (String genre : sortedGenres) {
      List<Album> albumList = genreAlbumMap.get(genre);

      // 각 장르의 곡을 재생 횟수로 정렬 (같은 재생 횟수면 고유 번호로 오름차순)
      albumList.sort((a1, a2) -> {
        if (a2.getPlay() == a1.getPlay()) {
          return Integer.compare(a1.getIdx(), a2.getIdx());
        }
        return Integer.compare(a2.getPlay(), a1.getPlay());
      });

      // 최대 2곡만 추가
      for (int i = 0; i < Math.min(2, albumList.size()); i++) {
        result.add(albumList.get(i).getIdx());
      }
    }

    // 4. 결과 반환
    return result.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public static class Album {

    private int idx;
    private int play;

    public Album(int idx, int play) {
      this.idx = idx;
      this.play = play;
    }

    public int getIdx() {
      return idx;
    }

    public int getPlay() {
      return play;
    }
  }
}
