public class UpDownLeftRight {
    public static void main(String[] args) {
        int v = 5;
        char[] move = new char[] {'R', 'R', 'R', 'U', 'D', 'D'};

        List<Integer> result = new java.util.ArrayList<>(List.of(1, 1));

        Map<Character, List<Integer>> map = Map.of(
                'R', List.of(0, 1),
                'L', List.of(0, -1),
                'U', List.of(-1, 0),
                'D', List.of(1, 0)
        );

        for (Character c : move) {
            int resultOfX = map.get(c).get(0) + result.get(0);
            int resultOfY = map.get(c).get(1) + result.get(1);

            if (resultOfX < 1 || resultOfY < 1) {
                continue;
            }
            System.out.println(c + " : " + map.get(c));
            result.set(0, resultOfX);
            result.set(1, resultOfY);
        }
        result.forEach(System.out::println);
    }
}
