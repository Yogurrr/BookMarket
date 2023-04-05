package Yogurrr;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class J07Array {
    public static void main(String[] args) {
        // 배열
        // 동일한 자료형의 자료를 여러 개 저장하기 위한 자료구조
        // 데이터 입력 순서 기억, 중복자료 저장 가능

        // 점심메뉴 정의 v1
        String menu1 = "라면";
        String menu2 = "짜장면";
        String menu3 = "탕수육";
        String menu4 = "민트초코";
        String menu5 = "떡볶이";

        System.out.printf("%s %s %s %s %s \n", menu1, menu2, menu3, menu4, menu5);

        // 점심메뉴 정의 v2
        // 자료형 변수명[] = {값, 값, 값, ...}
        // 자료형[] 변수명 = {값, 값, 값, ...}
        // String menus[] = {"라면", "짜장면", "탕수육", "민트초코", "떡볶이"};
        String[] menus = {"라면", "짜장면", "탕수육", "민트초코", "떡볶이"};

        // System.out.printf("%s %s %s %s %s \n", menus[0], menus[1], menus[2], menus[3], menus[4]);
        for (int i = 0; i < menus.length; i++) {
            System.out.printf(menus[i] + " ");
        }
        System.out.println("");

        // 점심메뉴 정의 v3
        // 배여 정의 시 한 번 설정한 크기는 변경 불가 - 고정 크기
        // 자료형[] 변수명 = new 자료형[크기]
        String[] menus2 = new String[5];

        menus2[0] = "라면";
        menus2[1] = "짜장면";
        menus2[2] = "탕수육";
        menus2[3] = "민트초코";
        menus2[4] = "떡볶이";
        // menus2[5] = "라볶이"; -> 오류 발생

        for (int i = 0; i < menus2.length; i++) {
            System.out.printf(menus2[i] + " ");
        }
        System.out.println("");


        // 점심메뉴 정의 v4
        // 동적 배열 - ArrayList
        // ArrayList<자료형> 변수명 = new ArrayList<>();
        ArrayList<String> menus3 = new ArrayList<>();

        menus3.add("라면");
        menus3.add("짜장면");
        menus3.add("탕수육");
        menus3.add("민트초코");
        menus3.add("떡볶이");

        for (int i = 0; i < 5; i++) {
            System.out.printf(menus3.get(i) + " ");
        }
        System.out.println("");

        // 5개의 정수를 입력 받아 총합, 평균을 구하고 결과 출력 v1
        Scanner sc = new Scanner(System.in);
        System.out.println("\n5개의 정수를 입력 받아 총합을 구하고 결과 출력 v1");
        int [] nums = new int[5];
        int sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            System.out.println((i + 1) + "번째 숫자는? ");
            nums[i] = sc.nextInt();
            sum += nums[i];             // 누적합
        }
        double avg = sum / nums.length;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.printf("\n총합은 %d, 평균은 %.1f입니다\n\n", sum, avg);

        // 5개의 정수를 입력 받아 총합, 평균을 구하고 결과 출력 v3b
        // 배열에 저장된 값 출력할 때 코드 개선
        // JDK 1.5부터 추가된 enhanced for loop
        // for (변수 선언 : 대상 객체) {
        //      변수 출력
        // }
        for (int val : nums) {
            System.out.printf("%d ", val);
        }
        System.out.println("\n");

        // ex) 성절 처리프로그램 v3
        // 3명의 학생에 대해
        // 이름, 국어, 영어, 수학을 입력 받아
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        // 단, 학점은 수우미양가 중 하나가 출력되어야 함
        String[] names = new String[3];
        int[] kors = new int[3];
        int[] engs = new int[3];
        int[] mats = new int[3];

        int[] tots = new int[3];
        double[] avgs = new double[3];
        char[] grds = new char[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "번 학생 이름은? ");
            names[i] = sc.next();
            System.out.println((i + 1) + "번 학생 국어는? ");
            kors[i] = sc.nextInt();
            System.out.println((i + 1) + "번 학생 영어는? ");
            engs[i] = sc.nextInt();
            System.out.println((i + 1) + "번 학생 수학은? ");
            mats[i] = sc.nextInt();
        }   // 성적 데이터 입력

        for (int i = 0; i < kors.length; i++) {
            tots[i] = kors[i] + engs[i] + mats[i];
            avgs[i] = tots[i] / 3;

            switch ((int)(avgs[i] / 10)) {
                case 10:
                case 9: grds[i] = '수'; break;
                case 8: grds[i] = '우'; break;
                case 7: grds[i] = '미'; break;
                case 6: grds[i] = '양'; break;
                default: grds[i] = '가';
            }
        }   // 성적 처리

        String result = "";
        for (int i = 0; i < names.length; i++) {
            result += String.format("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d \n", names[i], kors[i], engs[i], mats[i]);
            result += String.format("총점 : %d, 평균 : %.1f, 학점 : %c \n", tots[i], avgs[i], grds[i]);
        }   // 결과 출력 준비

        System.out.println(result);
    }
}
