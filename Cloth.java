class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; //체육수업 들을 수 있는 학생의 최대값
        int count = 0; //빌린 학생 수
        
        //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){ //도난 당한 학생 == 여벌옷 가져온 학생
                    lost[i] = reserve[j] = -1; //-1로 초기화
                    count++;
                    break;
                }
            }
        }
        
        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
        for(int k : lost){
            for(int j=0; j<reserve.length; j++){
                if(k == reserve[j]-1 || k == reserve[j]+1){
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        
        //결과값 : 전체 학생수 - 잃어버린 학생 수 + 빌린 학생 수
        answer = n - lost.length + count;
        return answer;
    }
}
