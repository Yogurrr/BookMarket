package examples;

import java.util.Date;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        System.out.println("<11번 - MyInfo>");
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요. ");
        String name = sc.next();
        System.out.println("몸무게를 입력하세요. ");
        double weight = sc.nextDouble();
        System.out.println("나이를 입력하세요. ");
        int age = sc.nextInt();

        System.out.printf("이름 : %s\n", name);
        System.out.printf("몸무게 : %.1fkg\n", weight);
        System.out.printf("나이 : %d세\n\n", age);


        System.out.println("<12번 - MyAge>");
        System.out.println("탄생년도를 입력하세요. ");
        int byear = sc.nextInt();
        System.out.println("탄생월을 입력하세요. ");
        int bmonth = sc.nextInt();
        System.out.println("탄생일을 입력하세요. ");
        int bday = sc.nextInt();

        Date Today = new Date();
        int Tyear = Today.getYear() + 1900;
        int Tmonth = Today.getMonth() + 1;
        int Tday = Today.getDate();

        // 1) 현재년도에서 생년을 빼서 나이 계산
        int age2 = Tyear - byear;

        // 2) 생일이 지났으면 나이 + 1 해줌
        age2 = (bmonth > Tmonth || (bmonth-Tmonth) == 0) && ((bday-Tday) >= 0) ? age2 += 1 : age2;;

        String fmt = "입력하신 생일 : %d-%02d-%02d\n";
        fmt += "현재 날짜 : %d-%02d-%02d\n";
        fmt += "나이 : %d세\n\n";
        System.out.printf(fmt, byear, bmonth, bday, Tyear, Tmonth, Tday, age2);


        System.out.println("<13번 - GuGu7Dan>");
        String dan7 = "7 x 1 = " + (7 * 1);
        dan7 += "\n7 x 2 = " + (7 * 2);
        dan7 += "\n7 x 3 = " + (7 * 3);
        dan7 += "\n7 x 4 = " + (7 * 4);
        dan7 += "\n7 x 5 = " + (7 * 5);
        dan7 += "\n7 x 6 = " + (7 * 6);
        dan7 += "\n7 x 7 = " + (7 * 7);
        dan7 += "\n7 x 8 = " + (7 * 8);
        dan7 += "\n7 x 9 = " + (7 * 9);

        System.out.println(dan7);


        System.out.println("\n<14번> - TimeTime");
        // 시간 환산하기
        int daysec = 86400;
        int data1 = 1234567890;
        int hour = 3600;
        int data2 = 98765;
        int minute = 60;
        int data3 = 12345;

        fmt = "하루는 86,400초, %,d초는 약 %,.2f일\n";
        System.out.printf(fmt, data1, data1 / daysec);

        fmt = "한 시간은 3,600초, %,d초는 약 %.2f시간\n";
        System.out.printf(fmt, data2, data2 / hour);

        fmt = "1분은 60초, %,d초는 약 %.2f분";
        System.out.printf(fmt, data3, data3 / minute);
    }
}
