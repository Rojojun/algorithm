package OpenChat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> chatLog = new ArrayList<>();
        HashMap<String, String> nicknameMap = new HashMap<>();

        for (String log : record) {
            // 문자열을 토큰 단위로 분리한다.
            StringTokenizer st = new StringTokenizer(log);
            String command = st.nextToken();
            String userId = st.nextToken();
            String nickname = "";

            if (!command.equals("Leave")) {
                nickname = st.nextToken();
            }

            switch (command) {
                case "Enter" :
                    nicknameMap.put(userId, nickname);
                    chatLog.add(userId + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    chatLog.add(userId + "님이 나갔습니다.");
                    break;
                case "Change" :
                    nicknameMap.put(userId, nickname);
                    break;
            }
        }
        String[] answer = new String[chatLog.size()];
        int logIdx = 0;
        for (String str : chatLog) {
            int endOfId = str.indexOf("님");
            String userId = str.substring(0, endOfId);

            answer[logIdx++] =str.replace(userId, nicknameMap.get(userId));
        }
        return answer;
    }
}
