package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 그림 확대
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181836
 */
public class Problem181836 {

  public String[] solution02(String[] picture, int k) {

    List<String> answers = new ArrayList<>();
    for (String row : picture) {
      StringBuilder sb = new StringBuilder();
      for (char pixel : row.toCharArray()) {
        for (int i = 0; i < k; ++i) {
          sb.append(pixel);
        }
      }
      for (int i = 0; i < k; ++i) {
        answers.add(sb.toString());
      }
    }

    String[] answer = new String[answers.size()];
    answer = answers.toArray(answer);
    return answer;
  }

  public static String[] solution01(String[] picture, int k) {
    int height = picture.length;
    int width = picture[0].length();

    // 가로 세로를 k배로 늘린 그림을 저장할 새로운 배열 생성
    int newHeight = height * k;
    int newWidth = width * k;
    String[] newPicture = new String[newHeight];

    // 새로운 그림 배열 초기화
    for (int i = 0; i < newHeight; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < newWidth; j++) {
        sb.append(picture[i / k].charAt(j / k));
      }
      newPicture[i] = sb.toString();
    }

    return newPicture;
  }

  public static String[] solution(String[] picture, int k) {
    int height = picture.length;
    int width = picture[0].length();

    int newHeight = height * k;
    int newWidth = width * k;

    String[] newPicture = IntStream.range(0, newHeight)
        .mapToObj(i -> {
          StringBuilder sb = new StringBuilder();
          for (int j = 0; j < newWidth; j++) {
            sb.append(picture[i / k].charAt(j / k));
          }
          return sb.toString();
        })
        .toArray(String[]::new);

    return newPicture;
  }
}
