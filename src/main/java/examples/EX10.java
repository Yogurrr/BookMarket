package examples;

import Yogurrr.SungJukVO;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        // ex) 성적 처리프로그램 v5
        // 클래스 기반 성적 처리프로그램
        SungJukVO sj = new SungJukVO();

        readSungJuk(sj);
        computeSungJuk(sj);
        printSungJuk(sj);
    }


    public static void readSungJuk(SungJukVO sj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름은? ");
        sj.setNames( sc.next() );
        System.out.println("국어는? ");
        sj.setKors( sc.nextInt() );
        System.out.println("영어는? ");
        sj.setEngs( sc.nextInt() );
        System.out.println("수학은? ");
        sj.setMats( sc.nextInt() );
    }

    public static void computeSungJuk(SungJukVO sj) {
        sj.setTots( sj.getKors() + sj.getEngs() + sj.getMats() );
        sj.setAvgs((double) sj.getTots() / 3);

        switch ((int)(sj.getAvgs() / 10)) {
            case 10:
            case 9: sj.setGrds('수'); break;
            case 8: sj.setGrds('우'); break;
            case 7: sj.setGrds('미'); break;
            case 6: sj.setGrds('양'); break;
            default: sj.setGrds('가');
        }
    }

    public static void printSungJuk(SungJukVO sj) {
        System.out.println(sj);
    }
}