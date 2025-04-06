package main;

import java.util.*;

// Greedy1 java version
public class Main {

  public static void main(String[] args) {
    int n = 5;
    int m = 8;
    int k = 3;

    int[] list = new int[] {2, 4, 5, 4, 6};

    method(n, m, k, list);
  }

  public static void method(int n, int m, int k, int[] list) {
    Arrays.sort(list);
    int count = k;
    int result = 0;

    for (int i = 0; i < m; i++) {
      if (count == 0) {
        result += list[n - 2];
        count += k;
      } else {
        result += list[n - 1];
        count -= 1;
      }
    }

    System.out.println(result);
  }
}

