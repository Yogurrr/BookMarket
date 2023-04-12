package Yogurrr.project.bookmarket;

import Yogurrr.MemberShip;

import java.util.Scanner;

public class BookMarketService {
    private Scanner sc = null;
    private MemberShip m = null;   // 회원정보 저장용
    private Book[] books = null;   // 도서정보 저장용

    public BookMarketService() {
        sc = new Scanner(System.in);
        registerBooks();   // 도서 생성
    }
    public String displayMenu() {   // bookmarket 메뉴 작성
        StringBuilder sb = new StringBuilder();

        sb.append("--------------------------\n")
            .append("Welcome To Shopping Mall\n")
            .append("Welcome To Book Market!\n")
            .append("--------------------------\n")
            .append("1. 고객 정보 확인하기\n")
            .append("2. 장바구니 상품 목록 보기\n")
            .append("3. 장바구니 비우기\n")
            .append("4. 바구니에 항목 추가하기\n")
            .append("5. 장바구니의 항목 수량 줄이기\n")
            .append("6. 장바구니의 항목 삭제하기\n")
            .append("7. 영수증 표시하기\n")
            .append("0. 종료\n")
            .append("--------------------------\n")
            .append("작업을 선택하세요 : ");
        System.out.println(sb);

        String menu = sc.next();   // 작업할 메뉴 입력 받기

        return menu;
    }

    // 메뉴 분기 처리
    public void processMenu(String menu) {
        switch (menu) {
            case "1":
                System.out.println("\n고객정보 확인\n");
                System.out.println(m);
                break;
            case "2": System.out.println("\n장바구니 상품 목록\n"); break;
            case "3": System.out.println("\n장바구니 비우기\n"); break;
            case "4":
                System.out.println("\n장바구니 상품 추가\n");
                for (Book b : books) {
                    System.out.println(b);
                }
                break;
            case "5": System.out.println("\n주문수량 변경\n"); break;
            case "6": System.out.println("\n상품 삭제\n");break;
            case "7": System.out.println("\n주문 영수증 출력\n");break;
            case "0":
                System.out.println("프로그램을 종료합니다\n");
                System.exit(0); break;   // 정상 종료
            default: System.out.println("\n잘못 입력하셨습니다\n");
        }   // switch
    }

    // 회원 등록
    public void registerMember() {
        System.out.print("회원이름은? ");
        String name = sc.next();
        System.out.print("회원 이메일은? ");
        String email = sc.next();
        System.out.print("회원 전화번호는? ");
        String hp = sc.next();

        m = new MemberShip(230410, name, email, hp);
    }

    // 도서정보 자동등록
    public void registerBooks() {
        books = new Book[3];

        books[0] = new Book("2304101234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018-10-08");
        books[1] = new Book("1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022-01-22");
        books[2] = new Book("1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문", "2019-06-10");
    }

}
