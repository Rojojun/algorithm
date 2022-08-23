import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReportResult {
    public int[] solution(String[] id_list, String[] report, int k){
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
        HashMap<String, Integer> reportedCountMap = new HashMap<>();
        HashSet<String> reporterSet = new HashSet<>(Arrays.asList(report));

        for (String reporterInfo : reporterSet) {
            String reporter = reporterInfo.split(" ")[0];
            String reported = reporterInfo.split(" ")[1];

            reporterInfoMap.putIfAbsent(reporter, new HashSet<String>(){{add(reported);}});
            reporterInfoMap.get(reporter).add(reporter);
            reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0) + 1);
        }

        for (String reported : reportedCountMap.keySet()){
            int reportedCount = reportedCountMap.get(reported);
            if (reportedCount >= k){
                for (int i = 0; i < id_list.length; i ++) {
                    if (reporterInfoMap.containsKey(id_list[i]) && reporterInfoMap.get(id_list[i]).contains(reported)){
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}
