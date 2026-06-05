import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());
        int sizeOfA = Integer.parseInt(br.readLine());
        long[] A = new long[sizeOfA + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= sizeOfA; i++) {
            A[i] = A[i - 1] + Long.parseLong(st.nextToken());
        }

        int sizeOfB = Integer.parseInt(br.readLine());
        long[] B = new long[sizeOfB + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= sizeOfB; i++) {
            B[i] = B[i - 1] + Long.parseLong(st.nextToken());
        }

        List<Long> sumA = new ArrayList<>();
        List<Long> sumB = new ArrayList<>();

        for (int i = 1; i <= sizeOfA; i++) {
            for (int j = i; j <= sizeOfA; j++) {
                sumA.add(A[j] - A[i - 1]);
            }
        }

        for (int i = 1; i <= sizeOfB; i++) {
            for (int j = i; j <= sizeOfB; j++) {
                sumB.add(B[j] - B   [i - 1]);
            }
        }

        long count = 0;

        Collections.sort(sumA);
        Collections.sort(sumB);

        int start = 0;
        int end = sumB.size() - 1;

        while (start < sumA.size() && end >= 0) {
            long sum = sumA.get(start) + sumB.get(end);

            if (sum < T) {
                start++;
            } else if (sum > T) {
                end--;
            } else {
                long valA = sumA.get(start);
                long cntA = 0;
                while (start < sumA.size() && sumA.get(start) == valA) {
                    cntA++;
                    start++;
                }
                long valB = sumB.get(end);
                long cntB = 0;
                while (end >= 0 && sumB.get(end) == valB) {
                    cntB++;
                    end--;
                }
                count += cntA * cntB;
            }
        }

        System.out.print(count);
    }
}
