package StringCompression;

public class Solution {
    public int solution(String s) {
        int answer = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            int compressionLv = 1;
            String compressionStr = s.substring(0, i);
            StringBuilder result = new StringBuilder();

            for (int j = i; j <= s.length(); j += i) {
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if (compressionStr.equals(next)) compressionLv++;
                else  {
                    result.append((compressionLv != 1 ? compressionLv : "") + compressionStr);
                    compressionStr = next;
                    compressionLv = 1;
                }
            }
            result.append(compressionStr);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}
