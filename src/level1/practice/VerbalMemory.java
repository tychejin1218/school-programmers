package level1.practice;

import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * Verbal Memory 게임
 * <p/>
 * [문제 설명]
 * 각 라운드마다 주어진 단어가 몇 번째 라운드에 처음 등장했는지 판단합니다.
 * 해당 라운드에 처음 등장한 단어라면 현재 라운드 번호를 반환합니다.
 * 이전에 등장한 단어라면 처음 등장했던 라운드 번호를 반환합니다.
 * <p/>
 * [제한 사항]
 * - 게임은 1라운드 이상, 200,000라운드 이하
 * - 단어는 영문 소문자로만 구성
 * - 단어 길이: 1 이상 30 이하
 * <p/>
 * [핵심 아이디어]
 * - HashMap을 사용해 단어별 첫 등장 라운드를 저장합니다.
 * - 단어가 HashMap에 없으면 → 현재 라운드 번호를 저장 (첫 등장)
 * - 단어가 HashMap에 있으면 → 저장된 라운드 번호를 사용 (이전 등장)
 * <p/>
 * [예시] words = ["one", "one", "two", "one"]
 * 라운드 1: "one" 첫 등장 → map에 {"one": 1} 저장 → answer[0] = 1
 * 라운드 2: "one" 기존 등장 → map에서 1 조회 → answer[1] = 1
 * 라운드 3: "two" 첫 등장 → map에 {"one": 1, "two": 3} 저장 → answer[2] = 3
 * 라운드 4: "one" 기존 등장 → map에서 1 조회 → answer[3] = 1
 * 정답: [1, 1, 3, 1]
 * <p/>
 * [시간복잡도] O(n) - 라운드 수만큼 순회, HashMap 조회는 O(1)
 * [공간복잡도] O(k) - k는 고유 단어 수, 최대 라운드 수만큼의 공간
 * <p/>
 * [면접 포인트]
 * Q. 왜 HashMap을 사용했나요?
 * A. 단어의 첫 등장 라운드를 key-value 형태로 저장하고 O(1)로 조회할 수 있기 때문입니다.
 *    배열로 구현하면 매번 O(n) 탐색이 필요해 최악의 경우 O(n²)이 됩니다.
 * Q. 왜 long[]을 반환하나요?
 * A. 라운드 수가 최대 200,000으로 int 범위(약 21억) 내에 있지만,
 *    문제에서 long 타입을 요구하므로 long[]으로 반환합니다.
 * Q. HashMap의 시간복잡도는?
 * A. 평균 O(1), 최악 O(n)이지만 실무에서는 해시 충돌이 거의 없어 O(1)로 간주합니다.
 * Q. Stream 리팩토링이 가능한가요?
 * A. computeIfAbsent를 활용하면 가능합니다. (solution 참고)
 *    computeIfAbsent: key가 없으면 값을 계산해서 put하고 반환, 있으면 기존 값 반환.
 *    단, Stream 내부에서 외부 상태(HashMap)를 변경하므로 병렬 스트림에서는 사용 불가합니다.
 */
public class VerbalMemory {

  // for 루프 방식 (기본)
  public long[] solutionForLoop(String[] words) {

    long[] answer = new long[words.length];

    // 단어가 처음 등장한 라운드를 저장하는 맵
    // key: 단어, value: 처음 등장한 라운드 번호
    HashMap<String, Long> firstAppearMap = new HashMap<>();

    for (int i = 0; i < words.length; i++) {

      // 라운드 번호는 1부터 시작하므로 i + 1
      long currentRound = i + 1;
      String currentWord = words[i];

      if (!firstAppearMap.containsKey(currentWord)) {
        // 처음 등장한 단어 → 현재 라운드 번호를 맵에 저장
        firstAppearMap.put(currentWord, currentRound);
      }

      // 해당 단어가 처음 등장한 라운드를 answer에 저장
      answer[i] = firstAppearMap.get(currentWord);

      System.out.println("라운드 " + currentRound + ": 단어 \"" + currentWord
          + "\" → 처음 등장한 라운드: " + answer[i]);
    }

    return answer;
  }

  // Stream 방식 (리팩토링)
  // computeIfAbsent: key가 없으면 람다로 값을 계산해서 put 후 반환, 있으면 기존 값 반환
  // 주의: 외부 상태(HashMap)를 변경하므로 반드시 순차 스트림(sequential)으로만 사용할 것
  public long[] solution(String[] words) {

    HashMap<String, Long> firstAppearMap = new HashMap<>();

    return IntStream.range(0, words.length)
        .mapToLong(i -> firstAppearMap.computeIfAbsent(words[i], key -> (long) (i + 1)))
        .toArray();
  }

  public static void main(String[] args) {
    VerbalMemory sol = new VerbalMemory();

    String[] words = {"one", "one", "two", "one"};

    System.out.println("=== for 루프 방식 ===");
    long[] result1 = sol.solutionForLoop(words);

    System.out.println("\n=== Stream 방식 ===");
    long[] result2 = sol.solution(words);

    System.out.println("\n최종 결과:");
    for (int i = 0; i < result2.length; i++) {
      System.out.println("라운드 " + (i + 1) + " 답: " + result2[i]);
    }
  }
}
