package examples;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) throws IOException {
        // Q27
        // 특정년도에 윤년여부를 출력
        // 조건1 : 4로 나눠 떨어지고, 100으로는 나눠 떨어지지 않으면 윤년
        // 조건2 : 400으로 나눠 떨어지면 윤년

        // ex) 1988, 2000, 2008, 2020 : 윤년
        //     1900, 2100, 2022 : 평년
        Scanner sc = new Scanner(System.in);

        System.out.println("연도는? ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
            System.out.println("윤년입니다");
        } else {
            System.out.println("평년입니다");
        }


        // Q16 - Charge
        int price = 47800;
        int pay = 150000;
        int charge = pay - price;
        int w50000 = charge / 50000;
        int w10000 = (charge % 50000) / 10000;
        int w5000 = ((charge % 50000) % 10000) / 5000;
        int w1000 = (((charge % 50000) % 10000) % 5000) / 1000;
        int w500 = ((((charge % 50000) % 10000) % 5000) % 1000) / 500;
        int w100 = (((((charge % 50000) % 10000) % 5000) % 1000) % 500) / 100;
        int w50 = ((((((charge % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
        int w10 = (((((((charge % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;

        System.out.printf("\n계산할 금액 : %d 원\n", price);
        System.out.printf("지불 금액 : %d 원\n", pay);
        System.out.printf("지급 금액 : %d 원\n", charge);
        System.out.println("----------------------------");
        System.out.println("5만원권 : " + w50000 + "장");
        System.out.println("1만원권 : " + w10000 + "장");
        System.out.println("5천원권 : " + w5000 + "장");
        System.out.println("1천원권 : " + w1000 + "장");
        System.out.println("5백원 : " + w500 + "개");
        System.out.println("1백원 : " + w100 + "개");
        System.out.println("5십원 : " + w50 + "개");
        System.out.println("1십원 : " + w10 + "개\n");


        // Q26 - Tax
        // 가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
        // 나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%
        System.out.println("결혼 여부는? (Y/N)");
        String isMarried = sc.next();
        System.out.println("연봉은? ");
        int salary = sc.nextInt();
        double tax = 0;
        String fmt = "결혼 여부가 %s이고 연봉이 %,d만원인 경우 세율은 %.0f%%이고 세금은 %,.0f원입니다.\n\n";

        if (Objects.equals(isMarried, "Y") || Objects.equals(isMarried, "y")) {
            if (salary >= 3000) tax = 35;
            else tax = 15;
        } else if (Objects.equals(isMarried, "N") || Objects.equals(isMarried, "n")) {
            if (salary >= 3000) tax = 25;
            else tax = 10;
        } else {
            fmt = "잘못 입력했습니다!\n\n";
        }

        System.out.printf(fmt, isMarried, salary, tax, salary * tax);



        // Q28 - GUGUDAN
        // 사용자로부터 숫자(1 - 9)를 하나 입력 받아, 구구단을 출력하는 프로그램을 작성해보세요.
        // 단, 1 - 9 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다.
        System.out.println("구구단의 단은? : ");
        int dan = sc.nextInt();
        String result = "";

        if (dan <= 9 && dan > 0) {
            result += String.format("%d x 1 = %d\n", dan, dan * 1);
            result += String.format("%d x 2 = %d\n", dan, dan * 2);
            result += String.format("%d x 3 = %d\n", dan, dan * 3);
            result += String.format("%d x 4 = %d\n", dan, dan * 4);
            result += String.format("%d x 5 = %d\n", dan, dan * 5);
            result += String.format("%d x 6 = %d\n", dan, dan * 6);
            result += String.format("%d x 7 = %d\n", dan, dan * 7);
            result += String.format("%d x 8 = %d\n", dan, dan * 8);
            result += String.format("%d x 9 = %d\n", dan, dan * 9);
        } else {
            result = "잘못 입력했습니다!\n";
        }

        System.out.println(result);

        // Q29 - UpperCase (아스키코드 이용)
        // System.in.read() : 키보드로부터 문자 하나를 입력 받음
        // 단, 입력받은 문자는 ASCII코드값(10진수)이기 때문에
        // char형으로의 변환 필요!
        // A의 ASCII코드값 : 65
        // a의 ASCII코드값 : 97
        // 소문자와 대문자의 차이 : 32
        System.out.println("알파벳 소문자를 입력해주세요 : ");
        char lwch = (char) System.in.read();
        result = "";

        if (lwch >= 97 && lwch <= 122) {
            char upch = (char) (lwch - 32);
            result = String.format("입력한 %c의 대문자는 %c입니다.\n", lwch, upch);
        } else {
            result = "잘못 입력했습니다!\n";
        }

        System.out.printf(result);


        // Q33 - CardCheck
        // 임의의 숫자 6자리를 입력하면 신용카드의 종류와 은행정보를 출력하는 프로그램을 작성해보세요.
        // 35(JCB카드)
        // 356317 - NH농협카드, 356901 - 신한카드, 356912 - KB국민카드
        // 4(비자카드)
        // 404825 – 비씨카드, 438676 – 신한카드, 457973 – 국민은행
        // 5(마스타카드, Maestro)
        // 515594 – 신한카드, 524353 - 외환카드, 540926 – 국민은행
        System.out.println("\n카드 번호를 입력하세요 : ");
        String cardnum = sc.next();

        String cdno1 = cardnum.charAt(0) + "";
        String cdno2 = cdno1 + cardnum.charAt(1);

        result = "";
        if (cdno1.equals("4")) {
            result += "비자카드/";
            switch (cardnum) {
                case "404825" : result += "비씨카드"; break;
                case "438676" : result += "신한카드"; break;
                case "457973" : result += "국민카드"; break;
            }
        } else if (cdno1.equals("5")) {
            result += "마스터카드/";
            switch (cardnum) {
                case "515594" : result += "신한카드"; break;
                case "524353" : result += "외환카드"; break;
                case "540926" : result += "국민카드"; break;
            }

        } else if (cdno2.equals("35")) {
            result += "JCB카드/";
            switch (cardnum) {
                case "356317" : result += "농협카드"; break;
                case "356901" : result += "신한카드"; break;
                case "356912" : result += "국민카드"; break;
            }
        } else {
            result = "잘못된 카드번호입니다!";
        }

        System.out.printf(result);



        // Q34 - CalcurateFee
        // 거리에 따라 다음 요금이 정해져 있다. 거리를 km로 입력했을 때 배송료를 계산하는 프로그램을 작성하여라.
        // 가. 50km 미만 : 10000원
        // 나. 50 ~ 100km : 18000원
        // 다. 100 ~ 300km : 55000원
        // 라. 300km 이상 : 75000원
        System.out.println("\n\n거리는? ");
        int distance = sc.nextInt();
        int fee = 0;

        if (distance >= 300) fee = 75000;
        else if (distance < 300 && distance >= 100) fee = 55000;
        else if (distance < 100 && distance >= 50) fee = 18000;
        else fee = 10000;

        System.out.printf("거리가 %dkm면 배송료는 %d원입니다.", distance, fee);
    }
}
