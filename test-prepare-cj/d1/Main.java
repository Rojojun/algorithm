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
  }

  record ProgramDetail(int start, int end, int priority, int dur) {
    public boolean isOverlap(int compareStart, int compareEnd) {
      return start < compareEnd && compareStart < end;
    }
  }
}
