import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class hello {
    public static void main(String[] args) throws IOException {
        // 입력값을 사용자로 부터 받아옵니다.
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = Integer.parseInt(input.readLine());
        // 받아온 입력값을 출력해서 보여줍니다.
        // 입력값은 list의 길이로 사용 됩니다.
        System.out.println(arrayLength);
        // 배열의 길이가 정해져 있지 않은 '가변형' 리스트를 생성합니다.
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        // 원래 제한사항에서는 intergerArrayList 내부의 길이에서 랜덤한 길이만큼을 뽑는 코드가 따로작성되어 있지만
        // 구현하기가 귀찮아서... 단순히 아래로 선언하겠습니다!
        ArrayList<Integer> compareArrayList = new ArrayList<Integer>(Arrays.asList(1,2));
        // 아래의 sum은 기준이 되는 intergerArrayList의 총합의 값을 넣을 빈 상자입니다.
        int sum = 0;

        //for가 0부터 돌아서 배열 [0]까지 사용자가 적은 input값까지 계속해서 반복하며
        //sum에 배열 [i] 만큼 추가가 되고 있습니다.
        for (int i = 0; i <= arrayLength; i++){
            sum += i;
            integerArrayList.add(i);
        }
        //기준이 되는 배열의 총 값입니다.
        System.out.println(sum);
        //기준이 되는 배열의 총 값에서 compareArrayList의 값의 내용 만큼 빼서 최종적으로 출력하는 내용입니다.
        for (int i = 0; i < compareArrayList.size(); i++){
            sum -= compareArrayList.get(i);
        }

        System.out.println(sum);




    }
}
