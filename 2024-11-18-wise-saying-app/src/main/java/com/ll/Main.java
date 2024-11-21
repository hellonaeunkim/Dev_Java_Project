package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    App app = new App();
    app.run();
  }
}

class App {
  public void run() {
    System.out.println("== 명언 앱 ==");

    Scanner scanner = new Scanner(System.in);

    int lastID = 0;
    List<WiseSaying> wiseSayings = new ArrayList<>();

    while (true) {
      System.out.print("명령 ) ");
      String cmd = scanner.nextLine();

      if (cmd.equals("종료")) {
        break;
      } else if (cmd.equals("등록")) {
        System.out.print("명언 : ");
        String content = scanner.nextLine();
        System.out.print("작가 : ");
        String author = scanner.nextLine();
        int id = ++lastID;

        // WiseSaying을 객체에 생성하고 ArrayList에 추가
        WiseSaying wiseSaying = new WiseSaying(id, content, author);
        wiseSayings.add(wiseSaying);

        System.out.println( id + "번 명언이 등록되었습니다.");
      } else if (cmd.equals("목록")) {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("------------------------");

        // 역순으로 출력 (마지막에 등록된 명언이 가장 먼저 출력됨)
        for (int i = wiseSayings.size() -1; i >= 0; i--) {
          WiseSaying ws = wiseSayings.get(i);
          System.out.println(ws.id + " / " + ws.author + " / " + ws.content);
        }
      }
    }
    scanner.close();
  }
}

class WiseSaying {
  int id;
  String content;
  String author;

  // 생성자 추가
  public WiseSaying(int id, String content, String author) {
    this.id = id;
    this.content = content;
    this.author = author;
  }
}
