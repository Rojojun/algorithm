import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class hello {
    public static void main(String[] args) throws IOException {
        // 입력값을 사용자로 부터 받아옵니다.
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = Integer.parseInt(input.readLine());
        // 받아온 입력값을 출력해서 보여줍니다.
        // 입력값은 list의 길이로 사용 됩니다.
        System.out.println(arrayLength);
        // 배열의 길이가 정해져 있지 않은 '가변형' 리스트를 두 개 생성합니다.
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<Integer> compareArrayList = new ArrayList<Integer>();
        // 아래의 sum은 기준이 되는 intergerArrayList의 총합의 값을 넣을 빈 상자입니다.
        int sum = 0;

        //for가 0부터 돌아서 배열 [0]까지 사용자가 적은 input값까지 계속해서 반복하며
        //sum에 배열 [i] 만큼 추가가 되고 있습니다.
        for (int i = 0; i <= arrayLength; i++){
            sum += i;
            integerArrayList.add(i);
        }
        // 차례대로 추가된 숫자를 shuffle을 이용해 순서 재배치를 합니다.
        Collections.shuffle(integerArrayList);
        System.out.println(integerArrayList);
        System.out.println("-----------------------------------------------------");
        // 위의 기준이되는 배열 값에서 랜덤으로 배열값의 길이를 정해줍니다.
        // 배열 값의 길이는 기준 값을 초과하지 않습니다.
        Random rand = new Random();
        int compareLength = rand.nextInt(arrayLength);
        int compareValue;
        System.out.println("compare length is "+ compareLength);
        for (int i = 0; i <= compareLength; i++) {
            compareValue = integerArrayList.get(i);
            compareArrayList.add((compareValue));
        }
        System.out.println("비교리스트" + compareArrayList);
        // 기준이 되는 배열의 총 값입니다.
        System.out.println(sum);
        // 기준이 되는 배열의 총 값에서 compareArrayList의 값의 내용 만큼 빼서 최종적으로 출력하는 내용입니다.
        for (int i = 0; i < compareArrayList.size(); i++){
            sum -= compareArrayList.get(i);
        }

        System.out.println("최종값" + sum);




    }
}
