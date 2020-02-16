package com.czareg;

import java.util.Objects;

/**
 * Amazon Coding Interview Question - Rotate Image
 *
 * I coded it before watching the video so I didnt care about extra space I needed for second arr.
 *
 * https://www.youtube.com/watch?v=IdZlsG6P17w
 */
public final class MatrixUtils {
    private MatrixUtils() {
    }

    public static int[][] rotate90Clockwise(int[][] input) {
        Objects.requireNonNull(input, "Input cannot be null");
        int length = input.length;
        if (length == 0) {
            return input;
        }
        if (length != input[0].length) {
            throw new IllegalArgumentException("Matrix has to be NxN");
        }

        int[][] result = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0, k = length - 1; j < length; j++, k--) {
                result[i][j] = input[k][i];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
