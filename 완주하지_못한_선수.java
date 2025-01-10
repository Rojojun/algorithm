import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> participantMap = new HashMap<>();
        Map<String, Integer> completionMap = new HashMap<>();

        for(String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            completionMap.put(c, completionMap.getOrDefault(c, 0) + 1);
        }
        
        for(String p : participant) {
            int p_value = participantMap.get(p);
            int c_value = completionMap.getOrDefault(p, 0);
            
            if (p_value != c_value) {
                answer += p;
                break;
            }
        }
        
        return answer;
    }
}
