package main;

import java.util.*;

public class Night {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String move = scanner.next();

        List<Character> rows = List.of('a','b','c','d','e','f','g','h');

        int[][] steps = {
                {2, 1}, {-2, 1}, {2, -1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, -2}, {-1, 2}
        };

        char[] moveChar = move.toCharArray();

        int tempRow = rows.indexOf(moveChar[0]);
        int tempCol = Integer.parseInt(move.substring(1));

        int result = 0;

        for (int[] step : steps) {
            if (step[0] + tempRow < 8 && step[0] + tempRow >= 0 && step[1] + tempCol <= 8 && step[1] + tempCol >= 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}
