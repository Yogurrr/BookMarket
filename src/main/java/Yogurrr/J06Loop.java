package Yogurrr;

import java.util.Scanner;

public class J06Loop {
    public static void main(String[] args) {
        // 반복문
        // 일정 횟수만큼 어떤 코드(들)을 반복해서 실행하는 제어문
        // 반복적으로 실행하는 동작을 loop이라고 함
        // 자바에서는 기본적으로 for, while, do-while 등이
        // 지원되고, 추가적으로 for-in도 있음

        // for문
        // 1-5까지 정수 출력 v1
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        // 1-5까지 정수 출력 v2
        System.out.print("\n1-5까지 정수 출력 v2\n");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d", i);
        }

        // 1-100 사이 짝수 출력 v1
        System.out.print("\n\n1-100 사이 짝수 출력 v1\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d, ", i);
            }
        }

        // 1-100 사이 짝수 출력 v2
        System.out.print("\n\n1-100 사이 짝수 출력 v2\n");
        for (int i = 2; i <= 100; i += 2) {
            System.out.printf("%d, ", i);
        }

        // 1 ~ 100까지의 청수의 총합 출력 v1
        System.out.print("\n\n1 ~ 100까지의 청수의 총합 출력 v1\n");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 1 ~ 100까지의 청수의 총합 출력 v2 - 가우스 덧셈
        // (시작숫자 + 종료숫자) x ((종료숫자 - 시작숫자 + 1) / 2)
        System.out.print("\n1 ~ 100까지의 청수의 총합 출력 v2 - 가우스 덧셈\n");
        int stnum = 1, ednum = 100;

        sum = (stnum + ednum) * ((ednum - stnum + 1) / 2);

        System.out.println(sum);

        // 10부터 1까지 정수 출력
        System.out.print("\n10부터 1까지 정수 출력\n");
        for (int i = 10; i >= 1; --i) {
            System.out.printf("%d, ", i);
        }

        // 구구단 출력 v1
        System.out.print("\n\n구구단 출력 v1\n");
        for (int i = 1; i <= 9; ++i) {
            System.out.printf("8 x %d = %2d\n", i, 8 * i);
        }

        // 구구단 출력 v2
        System.out.print("\n구구단 출력 v2\n");
        int dan = 7;
        for (int i = 1; i <= 9; ++i) {
            System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
        }

        // 무한 반복문 v1
        // for문의 경우, 초기식, 조건식, 증감식을 비워두면
        // 반복을 끊임없이 실행하는 반복문이 됨
        // for ( ; ; ) {
        //     System.out.println("Hello, Java!!");
        // }

        // 5개의 정수를 입력 받아 총합을 구하고 결과 출력 v1
        System.out.println("\n5개의 정수를 입력 받아 총합을 구하고 결과 출력 v1");
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e;

        System.out.print("1번째 숫자는? ");
        a = sc.nextInt();
        System.out.print("2번째 숫자는? ");
        b = sc.nextInt();
        System.out.print("3번째 숫자는? ");
        c = sc.nextInt();
        System.out.print("4번째 숫자는? ");
        d = sc.nextInt();
        System.out.print("5번째 숫자는? ");
        e = sc.nextInt();

        sum = a + b + c + d + e;
        double avg = (double) sum / 5;

        System.out.printf("입력하신 숫자는 %d, %d, %d, %d, %d이고", a, b, c, d, e);
        System.out.printf("총합은 %d, 평균은 %.1f입니다\n", sum, avg);

        // 5개의 정수를 입력 받아 총합을 구하고 결과 출력 v2
        System.out.println("\n5개의 정수를 입력 받아 총합을 구하고 결과 출력 v2");
        String nums = "";
        sum = 0;

        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + "번째 숫자는? ");
            int num = sc.nextInt();
            sum += num;             // 누적합
            nums += num + ", ";     // 입력받은 숫자를 변수에 계속 저장
        }
        avg = (double) sum / 5;

        System.out.printf("입력하신 숫자는 %s이고\n", nums);
        System.out.printf("총합은 %d, 평균은 %.1f입니다\n\n", sum, avg);

        // 분기문 : braek
        // 원하는 시점에 반복문이나 코드블록에서 벗어남

        // 1부터 10000까지의 총합을 계산
        // 단, 총합이 10000을 넘으면 중지
        System.out.println("\n1부터 10000까지의 총합을 계산");
        sum = 0;
        for (int i = 0; i <= 10000; i++) {
            sum += i;
            if (sum >= 10000) break;
        }
        System.out.printf("sum : %d\n", sum);

        // 분기문 : continue
        // 반복을 일시적으로 건너 뛰어 다음 반복으로 넘어가도록 함
        // 1부터 10000까지의 총합을 계산
        // 단, 5의 배수나 7의 배수는 계산에서 제외함
        System.out.println("\n1부터 10000까지의 총합을 계산 - 단, 5의 배수나 7의 배수는 계산에서 제외함");
        sum = 0;
        for (int i = 0; i <= 10000; i++) {
            if (i % 5 == 0 || i % 7 == 0) continue;
            sum += i;
            if (sum >= 10000) {
                break;
            }
        }
        System.out.printf("sum : %d\n", sum);
    }
}
