import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class hello {
    public static void main(String[] args) throws IOException {
        // 길이가 정해져 있지 않은 가변형 배열을 두개 선언합니다.
        // 하나는 기준 값인 -10,000 ~ 10,000 사이의 값을 넣기 위한 배열이고
        // 하나는 추후 결과값을 반환할 배열입니다.
        ArrayList<Integer> allNumArrayList = new ArrayList<Integer>();
        ArrayList<Integer> compareArrayList = new ArrayList<Integer>();

        // for가 0부터 돌아서 배열 [0]까지 사용자가 적은 input값까지 계속해서 반복하며
        // 기준 값인 -10000부터 10000까지 저장 하고 있습니다.
        for (int i = -10000; i <= 10000; i++){
            allNumArrayList.add(i);
        }
        // 전체 값을 보여줍니다.
        System.out.println(allNumArrayList);
        // 전체값을 shuffle을 이용해 순서 재배치를 합니다.
        Collections.shuffle(allNumArrayList);
        System.out.println("-----------------------------------------------------");
        // 위의 기준이되는 배열인 integerArrayList에서 랜덤으로 배열값의 길이를 정해줍니다.
        // 배열 값의 길이는 기준 값을 초과하지 않습니다.
        Random rand = new Random();
        int compareLength = rand.nextInt(100);
        // 빈 int 값을 선언하여 반복문을 통해 하나씩 int를 선언합니다.
        // 선언된 int값은 compareArrayList안에 shuffle로 랜덤하게 섞인 allNumArrayList값이
        // compareLength 만큼 반복되어 들어갑니다.
        int compareValue;
        System.out.println("compare length is "+ compareLength);
        for (int i = 0; i <= compareLength; i++) {
            compareValue = allNumArrayList.get(i);
            compareArrayList.add((compareValue));
        }
        System.out.println("비교리스트" + compareArrayList);
        // 전체 값이 더해질
        int sum = 0;
        // 기준이 되는 배열의 총 값입니다.
        // 기준이 되는 배열의 총 값에서 compareArrayList의 값의 내용 만큼 빼서 최종적으로 출력하는 내용입니다.
        for (int i = 0; i < compareArrayList.size(); i++){
          sum += compareArrayList.get(i);
        }
        System.out.println("최종값" + sum / compareLength);




    }
}
