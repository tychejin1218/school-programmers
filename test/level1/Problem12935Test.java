package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem12935Test {

    @Test
    void solution01() {

        // Given
        int[] arr = {4, 3, 2, 1};
        int[] expected = {4, 3, 2};

        // When
        int[] result = new Problem12935().solution(arr);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    void solution02() {

        // Given
        int[] arr = {10};
        int[] expected = {-1};

        // When
        int[] result = new Problem12935().solution(arr);

        // Then
        assertArrayEquals(expected, result);
    }
}