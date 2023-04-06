package examples;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // Q51 - BigGugudan
        // 구구단 표 출력 v1
        System.out.println("        Multiplication Table v1");
        System.out.println("    1   2   3   4   5   6   7   8   9");
        System.out.println("-------------------------------------");
        System.out.println("1 | 1   2   3   4   5   6   7   8   9");
        System.out.println("2 | 2   4   6   8  10  12  14  16  18");
        System.out.println("3 | 3   6   9  12  15  18  21  24  27");
        System.out.println("4 | 4   8  12  16  20  24  28  32  36");
        System.out.println("5 | 5  10  15  20  25  30  35  40  45");
        System.out.println("6 | 6  12  18  24  30  36  42  48  54");
        System.out.println("7 | 7  14  21  28  35  42  49  56  63");
        System.out.println("8 | 8  16  24  32  40  48  56  64  72");
        System.out.println("9 | 9  18  27  36  45  54  63  72  81\n");

        // 구구단 표 출력 v2
        System.out.println("        Multiplication Table v2");
        System.out.print("\t");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d\t", i);
        }
        System.out.println("\n---------------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " " + "|\t");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d\t", i * j);
            }
            System.out.println("");
        }


        // Q53 - CalrendarV1
        // 다음의 공식을 이용해서 입력한 년도의 1월 달력을 출력하는 프로그램을 작성하시오.
        // ((년도 - 1)*365 + (년도 - 1)/4 - (년도 - 1)/100 + (년도 - 1)/400 + 1) % 7
        // 0 : 일, 1 : 월, 2 : 화, … … , 6 : 토
        System.out.println("\nCalrendarV1");
        int year = 2022;
        int day = ((year - 1)*365 + (year - 1)/4 - (year - 1)/100 + (year - 1)/400 + 1) % 7;
        System.out.println(day);
        System.out.printf("January %d\n", year);
        System.out.println("---------------------------");


        // Q55 - JuminCode
        // 다음 조건에 따라 주민번호 유효성 검사 기능을 구현하시오.
        // 주민번호 각 자리를 2,3,4,5,6,7,8,9,2,3,4,5 가중치로 곱함
        // 곱한 결과를 각각 모두 더함
        // 더한 값을 11로 나눠 나머지를 구함
        // 나머지와 주민번호 맨 마지막 자리와 일치여부 검사
        // 나머지가 2자리라면 맨 끝자리와 비교
        Scanner sc = new Scanner(System.in);

        System.out.println("\n주민번호를 입력해주세요 : (ex. 123456-1234567)");
        String jumin = sc.next();
        String[] juminNum = jumin.split("-");
        String jumin1 = juminNum[0];
        String jumin2 = juminNum[1];

        int[] jumin1Nums = new int[jumin1.length()];
        for (int i = 0; i < jumin1.length(); i++) {
            jumin1Nums[i] = jumin1.charAt(i) - '0';
        }
        int a = jumin1Nums[0] * 2;
        int b = jumin1Nums[1] * 3;
        int c = jumin1Nums[2] * 4;
        int d = jumin1Nums[3] * 5;
        int e = jumin1Nums[4] * 6;
        int f = jumin1Nums[5] * 7;

//        int aa = 0;
//        int sum1 = 0;
//        for (int i = 0; i < 6; i++) {
//            for (int j = 2; j <= 7; j++) {
//                aa = jumin1Nums[i] * j;
//            }
//            sum1 += aa;
//        }
//
//        System.out.println(sum1);

        int[] jumin2Nums = new int[jumin2.length()];
        for (int i = 0; i < jumin2.length(); i++) {
            jumin2Nums[i] = jumin2.charAt(i) - '0';
        }
        int g = jumin2Nums[0] * 8;
        int h = jumin2Nums[1] * 9;
        int i = jumin2Nums[2] * 2;
        int j = jumin2Nums[3] * 3;
        int k = jumin2Nums[4] * 4;
        int l = jumin2Nums[5] * 5;

        int sum = a+b+c+d+e+f+g+h+i+j+k+l;
        int rest = sum % 11;
        int verNum = 11 - rest;

        System.out.printf("총합 : %d, 나머지 : %d, 검증 숫자 : %d\n", sum, rest, verNum);
        if (verNum >= 10) verNum = verNum - 10;
        if (jumin2Nums[6] == verNum) System.out.println("일치");
        else System.out.println("불일치");

//        String[] jumin = {"1", };
    }
}
