package level1.p200000_299999;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * [PCCE 기출문제] 10번 / 데이터 분석
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/250121
 */
public class Problem250121 {

  public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

    List<Data> dataList = new ArrayList<>();
    for (int[] dataArr : data) {
      dataList.add(new Data(dataArr[0], dataArr[1], dataArr[2], dataArr[3]));
    }

    Map<String, Predicate<Data>> filterMap = Map.of(
        "code", dataObj -> dataObj.getCode() < val_ext,
        "date", dataObj -> dataObj.getDate() < val_ext,
        "maximum", dataObj -> dataObj.getMaximum() < val_ext,
        "remain", dataObj -> dataObj.getRemain() < val_ext
    );

    Map<String, Function<Data, Integer>> sortMap = Map.of(
        "code", Data::getCode,
        "date", Data::getDate,
        "maximum", Data::getMaximum,
        "remain", Data::getRemain
    );

    List<Data> filterDataList = dataList.stream()
        .filter(filterMap.getOrDefault(ext, dataObj -> true))
        .collect(Collectors.toList());

    Function<Data, Integer> sortFunction = sortMap.getOrDefault(sort_by, Data::getCode);
    filterDataList.sort(Comparator.comparingInt(sortFunction::apply));

    return filterDataList.stream()
        .map(dataObj -> new int[]{dataObj.code, dataObj.date, dataObj.maximum, dataObj.remain})
        .toArray(int[][]::new);
  }

  public static class Data {

    private int code;
    private int date;
    private int maximum;
    private int remain;

    public Data(int code, int date, int maximum, int remain) {
      this.code = code;
      this.date = date;
      this.maximum = maximum;
      this.remain = remain;
    }

    public int getCode() {
      return code;
    }

    public int getDate() {
      return date;
    }

    public int getMaximum() {
      return maximum;
    }

    public int getRemain() {
      return remain;
    }
  }
}
