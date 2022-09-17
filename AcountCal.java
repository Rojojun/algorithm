class AcountCal {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sumPrice = 0;
        int loopCount = 0;
        
        while(loopCount != count) {
            sumPrice += price * (count - loopCount);
            loopCount++;
        }
        
        // 조건문 해줘야함 why? 금액이 부족하지 않을 때 0을 리턴하기 위해
        if (sumPrice > money) {
            answer = sumPrice - money;
        }
        
        return answer;
    }
}
