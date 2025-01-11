import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int max = 0;
        List<String> list = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < index; i++) {
            String key = sc.next();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for(String key : map.keySet()) {
            int count = map.get(key);
            if(count > max) {
                max = count;
                list.clear();
                list.add(key);
            } else if (count == max) {
                list.add(key);
            }
        }
        Collections.sort(list);
        
        System.out.println(list.get(0));
    }
}
