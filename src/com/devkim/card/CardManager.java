package com.devkim.card;

import java.util.Scanner;

public class CardManager {
    static Scanner sc = new Scanner(System.in);

    public static Card getCardInfo() {
        System.out.println("이름, 이메일, 전화번호, 회사이름, 부서를 입력해주세요.");
        String inputString = sc.nextLine();
        String[] parseString = inputString.split(" ");
        Card card = new Card();
        card.setName(parseString[0]);
        card.setEmail(parseString[1]);
        card.setPhoneNumber(parseString[2]);
        card.setCompanyName(parseString[3]);
        card.setJob(parseString[4]);
        return card;
    }

    public static Card[] addCard(Card[] _cards) {
        Card[] cards = null;
        if (_cards == null) {
            cards = new Card[1];
        } else {
            cards = new Card[_cards.length + 1];
        }

        for (int i = 0; i < cards.length - 1; i++) {
            cards[i] = _cards[i];
        }
        cards[cards.length - 1] = getCardInfo();

        return cards;
    }

    public static Card modifyCard(Card card) {
        return card = getCardInfo();
    }

    public static Card[] removeCard(Card[] _cards, int removeCardNumber) {
        Card[] cards = new Card[_cards.length - 1];
        for (int i = 0, j = 0; i < _cards.length; i++, j++) {
            if (i == removeCardNumber - 1) {
                j--;
                continue;
            }
            cards[j] = _cards[i];
        }
        return cards;
    }

    public static void viewCards(Card[] cards) {
        if (cards.length == 0) {
            System.out.println("명함이 없습니다.");
        }
        for (int i = 0; i < cards.length; i++) {
            System.out
                    .println((i + 1) + "번 명함 - " + "이름: " + cards[i].getName() + " 회사명: " + cards[i].getCompanyName());
        }
        System.out.println("");
    }

    public static void viewCardDetail(Card card) {
        System.out.println("이름 : " + card.getName());
        System.out.println("이메일 : " + card.getEmail());
        System.out.println("전화번호 : " + card.getPhoneNumber());
        System.out.println("회사이름 : " + card.getCompanyName());
        System.out.println("부서 : " + card.getJob());
        System.out.println("");
    }
}
