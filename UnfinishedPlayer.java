import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 중복 값 확인
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(participant));
        String[] noSameName = linkedHashSet.toArray(new String[0]);
        
        HashMap<Integer, String> players = new HashMap<>();

        Arrays.sort(noSameName);
        Arrays.sort(completion);
        
        // 중복이 될 때
        if (noSameName.length != participant.length) {
            int count = 0;

            /*
            for(int i = 0; i < participant.length; i++) {
                players.put(i, participant[i]);
            }
            */
            for (String player : noSameName) {
                count++;
                if(!player.equals(completion[count]))
                    break;
                /*  
                if (!Arrays.asList(completion[count]).contains(player)){
                    
                    System.out.println(completion[count] + "player : " + player);
                    count++;
                    
                } 
                else
                    count++;
                */
                answer = player;
            }

        }
        else {
            // 중복이 안될 때
            for(int i = 0; i < noSameName.length; i++) {
                players.put(i, noSameName[i]);
                if(!Arrays.asList(completion).contains(players.get(i)))
                {
                    answer = players.get(i);
                }
            } 
        }

        
        /*
        for(int i =)
        Arrays.asList(completion).contains()
        if(HashMap.)
        System.out.println(players);
        */
        return answer;
    }
}
