import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // 인형 제거 횟수
        int answer = 0;
        // 인형 뽑기의 통 크기
        Stack<Integer> stack = new Stack<>();       
        
        
        for(int i =0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1] != 0 ) {                   
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]){
                        // 인형들을 제거하는 횟수 증가.
                        answer++;
                        // 바구니에 있는 인형을 제거.
                        stack.pop();
                        board[j][moves[i]-1] = 0;
                        break;
                    }else{
                        stack.push(board[j][moves[i]-1]);                      
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }                        
            }
        }
        
       
      return answer*2;
    }
}
