import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int required = Integer.parseInt(bufferedReader.readLine());
    StringBuilder stringBuilder = new StringBuilder();
    Map<Integer, ProgramDetail> programs = new HashMap<>();

    for (int i = 0; i < required; i++) {
      StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      String command = stringTokenizer.nextToken();

      switch (command) {
        case "RESERVE": {
          int id = Integer.parseInt(stringTokenizer.nextToken());
          if (programs.containsKey(id)) {
            break;
          }

          int start = Integer.parseInt(stringTokenizer.nextToken());
          int dur = Integer.parseInt(stringTokenizer.nextToken());
          int priority = Integer.parseInt(stringTokenizer.nextToken());

          ProgramDetail programDetail = new ProgramDetail(start, start + dur, priority, dur);

          for (var key : programs.entrySet()) {
            ProgramDetail innerDetail = key.getValue();
            if (!innerDetail.isOverlap(start, start + dur))
              continue;
            if (innerDetail.priority >= priority) {
              break;
            }
            programs.put(id, programDetail);
            programs.remove(key.getKey());
            break;
          }
          break;
        }
        case "CANCEL": {
          programs.remove(Integer.parseInt(stringTokenizer.nextToken()));
          break;
        }
        case "MOVE": {
          int id = Integer.parseInt(stringTokenizer.nextToken());
          if (!programs.containsKey(id)) {
            break;
          }

          int start = Integer.parseInt(stringTokenizer.nextToken());
          ProgramDetail original = programs.get(id);

          for (var entry : programs.entrySet()) {
            ProgramDetail compare = entry.getValue();
            if (entry.getKey() == id) {
              continue;
            }
            if (compare.isOverlap(start, start + original.dur)) {
              break;
            }
            programs.put(id, new ProgramDetail(start, start + original.dur, original.priority, original.dur));
          }
          break;
        }
      }
    }

    // ===== 출력부 (로직 아님, 결과 확인용) — for 밖, 딱 한 번 =====
    if (programs.isEmpty()) {
      stringBuilder.append("EMPTY\n");
    } else {
      programs.entrySet().stream()
          .sorted(Comparator.comparingInt(e -> e.getValue().start))
          .forEach(e -> {
            ProgramDetail p = e.getValue();
            stringBuilder.append(p.start).append(' ')
                .append(p.end).append(' ')
                .append(e.getKey()).append(' ')
                .append(p.priority).append('\n');
          });
    }
    System.out.print(stringBuilder);
  }

  record ProgramDetail(int start, int end, int priority, int dur) {
    public boolean isOverlap(int compareStart, int compareEnd) {
      return start < compareEnd && compareStart < end;
    }
  }
}
