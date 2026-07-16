import java.io.*;
import java.util.*;

/**
 * 채널 리모컨 (Channel Remote)
 * CJ ENM 코테 대비 Day 2 - 구현/시뮬레이션
 *
 * 문제 전문: Question.md 참고
 * 제한시간: 40분
 *
 * TODO: 여기에 직접 구현하세요.
 *  - UP / DOWN / SET / BACK 처리 (채널 순환, 직전 채널 기억)
 *  - 각 조작 직후 채널 방문 +1 (시작 채널 1번도 방문 1회)
 *  - 가장 많이 방문한 채널 출력 (동점이면 작은 번호)
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());

    int cur = 1;   // 현재 채널 (시작 1번)
    // TODO: 직전 채널 기억용 변수, 방문 횟수 저장용 자료구조 준비
    // TODO: 시작 채널(1번) 방문 1회 기록

    for (int i = 0; i < q; i++) {
      st = new StringTokenizer(br.readLine());
      String op = st.nextToken();

      switch (op) {
        case "UP": {
          // TODO
          break;
        }
        case "DOWN": {
          // TODO
          break;
        }
        case "SET": {
          int x = Integer.parseInt(st.nextToken());
          // TODO
          break;
        }
        case "BACK": {
          // TODO
          break;
        }
        default:
          break;
      }
    }

    // TODO: 가장 많이 방문한 채널 출력 (동점이면 작은 번호)
  }
}
