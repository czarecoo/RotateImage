package com.czareg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixUtilsTest {
    @Test
    public void shouldThrowNPEForNullInput() {
        int[][] input = null;

        Assertions.assertThrows(NullPointerException.class, () -> {
            MatrixUtils.rotate90Clockwise(input);
        });
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNonSquareMatrix() {
        int[][] input = {{1, 2}};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MatrixUtils.rotate90Clockwise(input);
        });
    }


    @Test
    public void shouldThrowIllegalArgumentExceptionFor1x0NInput() {
        int[][] input = {{}};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MatrixUtils.rotate90Clockwise(input);
        });
    }

    @Test
    public void shouldReturnTheSameMatrixFor0x0Input() {
        int[][] input = new int[0][0];

        int[][] actual = MatrixUtils.rotate90Clockwise(input);

        int[][] expected = new int[0][0];
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnTheSameMatrixFor1NInput() {
        int[][] input = {{1}};

        int[][] actual = MatrixUtils.rotate90Clockwise(input);

        int[][] expected = {{1}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRotatedMatrixFor2NInput() {
        int[][] input = {{1, 2}, {3, 4}};

        int[][] actual = MatrixUtils.rotate90Clockwise(input);

        int[][] expected = {{3, 1}, {4, 2}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRotatedMatrixFor3NInput() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] actual = MatrixUtils.rotate90Clockwise(input);

        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRotatedMatrixFor4NInput() {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int[][] actual = MatrixUtils.rotate90Clockwise(input);

        int[][] expected = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        Assertions.assertArrayEquals(expected, actual);
    }
}
