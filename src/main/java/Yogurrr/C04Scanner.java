package Yogurrr;

import java.util.Scanner;   // 1

public class C04Scanner {
    public static void main(String[] args) {
        // 데이터 입력 : Scanner
        Scanner sc = new Scanner(System.in);   // 2

        // 이름을 입력 받음
//        System.out.println("이름은?");
//        String name = sc.next();   // 3
//        System.out.printf("이름은 %s", name);

        // ex) 성적 처리프로그램 v2
        // 이름, 국어, 영어, 수학을 키보드로 입력 받아
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        System.out.println("이름은? ");
        String name = sc.next();
        System.out.println("국어는? ");
//        int kor = Integer.parseInt(sc.next());
        int kor = sc.nextInt();
        System.out.println("영어는? ");
        int eng = sc.nextInt();
        System.out.println("수학은? ");
        int mat = sc.nextInt();

        int tot = kor + eng + mat;
        double avg = tot / 3;
        char grd = avg >= 90 ? '수' :
                   avg >= 80 ? '우' :
                   avg >= 70 ? '미' :
                   avg >= 60 ? '양' : '가';

        System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n", name, kor, eng, mat);
        System.out.printf("총점 : %s, 평균 : %.1f, 학점 : %c", tot, avg, grd);


        // 종료시 sc 객체 제거
        sc.close();
    }
}
