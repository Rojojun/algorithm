package com.example.records;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] candidates = new int[10];

        int result = 0;
        int near100 = 0;
        int over100 = 0;

        for (int i = 0; i < 10; i++) {
            int value = Integer.parseInt(br.readLine());
            candidates[i] = value;
        }
//        br.close();

        for (int c :  candidates) {
             result += c;
             if (result == 100) {
                 System.out.println(result);
                 break;
             }
             if (result < 100 && near100 < result) {
                 near100 = result;
             }
             if (result > 100) {
                 over100 = result;
                 break;
             }
        }

        if (over100 - 100 == 100 - near100) {
            System.out.println(over100);
        }

        if (result != 100) {
            if (over100 == 0) {
                System.out.println(near100);
            } else if (over100 - 100 > 100 - near100) {
                System.out.println(near100);
            } else if (over100 - 100 < 100 - near100) {
                System.out.println(over100);
            }
        }
    }
}
