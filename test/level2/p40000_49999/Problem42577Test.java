package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42577Test {

  @Test
  void solution01() {

    // Given
    String[] phone_book = {"119", "97674223", "1195524421"};
    boolean expected = false;

    // When
    boolean result = new Problem42577().solution(phone_book);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] phone_book = {"123", "456", "789"};
    boolean expected = true;

    // When
    boolean result = new Problem42577().solution(phone_book);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] phone_book = {"12", "123", "1235", "567", "88"};
    boolean expected = false;

    // When
    boolean result = new Problem42577().solution(phone_book);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String[] phone_book = {"987654321", "123456789", "555"};
    boolean expected = true;

    // When
    boolean result = new Problem42577().solution(phone_book);

    // Then
    assertEquals(expected, result);
  }
}
