package examples;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q25
        // 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)
        // 가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
        // 나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
        // 다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
        // 라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력
        System.out.println("Q25");
        System.out.println("복권 숫자 3자리를 입력해주세요 : ");
        int yourkey = sc.nextInt();
        int lottokey = (int) Math.floor(Math.random() * 1000);
        if (yourkey == lottokey) {
            System.out.printf("복권 숫자 : %d, 상금 1백만 지급", lottokey);
        } else {
            System.out.printf("복권 숫자 : %d, 아쉽지만, 다음 기회를!", lottokey);
        }

        // Q30
        // 다음 조건에 따라 숫자 맞추기 프로그램을 작성해보세요. (CatchNumber)
        // 가. 사용자로부터 1 - 100사이의 숫자를 입력 받으세요 (num1)
        // 나. 변수에 임의의 숫자 3자리를 초기화합니다 (num2)
        // 다. num1이 num2보다 크면 “추측한 숫자가 큽니다”라고 출력하세요
        // 라. num1이 num2보다 작으면 “추측한 숫자가 작습니다”라고 출력하세요
        // 마. num1과 num2가 같으면 “빙고! 숫자를 맞췄습니다”라고 출력하고 종료
        System.out.println("\n\nQ30");
        int num2 = (int) (Math.random() * 100) + 1;

        System.out.println("5번 이내에 맞춰주세요");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n1 - 100 사이의 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();
            if (num1 > num2) {
                System.out.println("추측한 숫자가 큽니다");
            } else if (num1 < num2) {
                System.out.println("추측한 숫자가 작습니다");
            } else {
                System.out.println("빙고! 숫자를 맞췄습니다");
            }
        }
        System.out.printf("정답은 %d\n\n", num2);


        // Q32
        // 키보드로 정수를 하나 입력받아 다음 조건에 따라 결과를 출력하는 프로그램을 작성하시오. (CheckNumber)
        // 가. 입력한 값이 10000 보다 작으면 “10000미만” 이라 출력
        // 나. 입력한 값이 10000 이상 20000미만 이면 “10000~20000” 이라 출력
        // 다. 입력한 값이 20000 이상 30000미만 이면 “20000~30000” 이라 출력
        // 라. 입력한 값이 그 이외 값이면 “범위 밖 값” 이라 출력
        System.out.println("Q32");
        System.out.println("숫자를 입력해주세요 : ");
        int input = sc.nextInt();
        String result = "";
        if (input < 10000) {
            result += "10000 미만";
        } else if (input >= 10000 && input < 20000) {
            result += "10000 ~ 20000";
        } else if (input >= 20000 && input < 30000) {
            result += "20000 ~ 30000";
        } else {
            result += "범위 밖 값";
        }
        System.out.println(result + "\n");


        // Q48
        // 지금 현재 수지의 통장잔액이 25,000원이다.
        // 은행이자가 연 6%라 가정할 때, 몇 년이 지나야 통장잔액이 지금의 2배를 넘는지 알아보는 프로그램을
        // 아래 그림을 참고하여 작성하여라. (ComputeInvestment)
        System.out.println("Q48");
        int money = 25000;
        int interest = 6;
        int i = 0;

        for (i = 1; i < money; i++) {
            money = (int) (money * (1 + interest * 0.01));
            if (money > 50000) break;
        }

        System.out.printf("원금 25,000원에 연 이율 %d%%를 적용하면 %d년 뒤에야 2배 수익이 납니다.", interest, i);
    }
}
