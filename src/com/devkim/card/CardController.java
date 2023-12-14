package com.devkim.card;

import java.util.Scanner;

public class CardController {
    Scanner sc = new Scanner(System.in);
    Card[] cards = null;

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void start() {
        boolean end = false;
        while (!end) {
            System.out.println("@@ 명함 프로그램 실행 @@");
            System.out.println("1. 명함 추가");
            System.out.println("2. 명함 수정");
            System.out.println("3. 명함 삭제");
            System.out.println("4. 명함 목록");
            System.out.println("5. 명함 더보기");
            System.out.println("6. 프로그램 종료");
            System.out.println("실행할 프로그램을 입력해주세요.");
            int input = sc.nextInt();
            clearConsole();
            switch (input) {
                case 1:
                    cards = CardManager.addCard(cards);
                    clearConsole();
                    break;
                case 2:
                    System.out.println("수정할 명함 번호를 입력해주세요.");
                    int modifyCardNumber = sc.nextInt();
                    cards[modifyCardNumber - 1] = CardManager.modifyCard(cards[modifyCardNumber - 1]);
                    clearConsole();
                    break;
                case 3:
                    System.out.println("삭제할 명함 번호를 입력해주세요.");
                    int inputNumber = sc.nextInt();
                    cards = CardManager.removeCard(cards, inputNumber);
                    clearConsole();
                    break;
                case 4:
                    CardManager.viewCards(cards);
                    break;
                case 5:
                    System.out.println("확인할 번호를 입력해주세요.");
                    int inputNum = sc.nextInt();
                    CardManager.viewCardDetail(cards[inputNum - 1]);
                    break;
                default:
                    end = true;
                    break;
            }

        }

    }

}
