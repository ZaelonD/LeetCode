package Easy.LevenshteinDistance;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Введите букву в виде списка количества пикселей по горизонтали: ");
        String input = scanner.nextLine();

        int[] inputLetter = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(inputLetter));

//---------------------------ЭТАЛОНЫ---------------------------

        // Числовой вид изображения (по горизонтали)
        Data x = new Data();
        x.put(new int[]{2, 0, 7, 1, 1, 7, 1, 1, 7}, 'Ё');
        x.put(new int[]{3, 5, 5, 5, 3, 5, 5, 5, 3}, 'Ж');
        x.put(new int[]{4, 2, 1, 1, 3, 1, 1, 2, 4}, 'З');
        x.put(new int[]{1, 3, 3, 3, 3, 3, 3, 3, 1}, 'И');
        x.put(new int[]{3, 3, 3, 3, 3, 3, 3, 3, 1}, 'Й');

        // Числовой вид изображения (по вертикали)
        Data y = new Data();
        y.put(new int[]{0, 7, 4, 3, 3, 3, 4, 3, 0}, 'Ё');
        y.put(new int[]{4, 4, 4, 3, 9, 3, 4, 4, 4}, 'Ж');
        y.put(new int[]{0, 0, 2, 2, 3, 3, 3, 6, 0}, 'З');
        y.put(new int[]{9, 1, 1, 1, 1, 1, 1, 1, 9}, 'И');
        y.put(new int[]{8, 1, 1, 2, 2, 2, 1, 1, 8}, 'Й');

        Set<int[]> i = x.keySet();
        int min = Integer.MIN_VALUE;
        char recognizedLetter = ' ';
        for (int[] ints : i) {
            int distance = levenshteinDistance(inputLetter, ints);
            if (distance < min) {
                min = distance;
                recognizedLetter = x.get(ints);
            }
            System.out.println(recognizedLetter);
        }



    }

    public static int levDiv(int i, int j, int[] inputLetter, int[] data, int[][] matrix) {
        if (i == 0 && j == 0)
            return 0;
        if (i > 0 && j == 0)
            return i;
        if (j > 0 && i == 0)
            return j;
        int m = (inputLetter[i - 1] == data[j - 1]) ? 0 : 1;

        int min = matrix[i][j - 1] + 1;
        if (matrix[i - 1][j] + 1 < min)
            min = matrix[i - 1][j] + 1;
        if (matrix[i - 1][j - 1] + m < min)
            min = matrix[i - 1][j - 1] + m;
        return min;
    }

    public static int levenshteinDistance(int[] inputLetter, int[] data) {
        int[][] matrix = new int[inputLetter.length + 1][data.length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = levDiv(i, j, inputLetter, data, matrix);
            }
        }
        return matrix[inputLetter.length][data.length];
    }
}
