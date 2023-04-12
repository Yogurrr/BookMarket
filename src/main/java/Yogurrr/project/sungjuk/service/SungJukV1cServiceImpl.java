package Yogurrr.project.sungjuk.service;

import Yogurrr.project.sungjuk.model.SungJukVO;
import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SungJukV1cServiceImpl implements SungJukV1cService {
    private Scanner sc = null;
    SungJukVO[] sjs = null;
    private int idx = 0;

    public SungJukV1cServiceImpl() {
        sc = new Scanner(System.in);
        sjs = new SungJukVO[10];
    }

    // 성적 프로그램 메뉴
    public int displayMenu() {
        int menu = -1;

        StringBuffer sb = new StringBuffer();
        sb.append("---------------------------------\n")
                .append(" 성적 처리 프로그램 v1\n")
                .append("---------------------------------\n")
                .append("1. 성적 데이터 추가\n")
                .append("2. 성적 데이터 조회\n")
                .append("3. 성적 데이터 상세 조회\n")
                .append("4. 성적 데이터 수정\n")
                .append("5. 성적 데이터 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("---------------------------------\n")
                .append("작업을 선택하세요");
        System.out.println(sb);

        try {
            menu = sc.nextInt();
        } catch (InputMismatchException ex) {
            // nextInt 시 문자를 입력했을 때 입력 버퍼에 남은 나머지 문자를 제거
            sc.nextLine();
            // 숫자가 아닌 그 이외 문자 입력 시 menu에 -1 대입
            menu = -1;
        }

        return menu;
    }

    public void processMenu(int menu) {
        switch (menu) {
            case 1:
        newSungJuk(); break;
        case 2:
        readSungJuk(); break;
        case 3:
        readOneSungJuk(); break;
        case 4:
        modifySungJuk(); break;
        case 5:
        removeSungJuk(); break;
        case 0: System.exit(0); break;
        default:
        System.out.println("\n잘못 입력하셨습니다");
    }
}

    public void removeSungJuk() {
        // 이름 입력 -> 대상 검색 -> 대상 제거
        System.out.print("삭제할 학생 이름은?");
        String name = sc.next();

        try {
            for (int i = 0; i < sjs.length; i++) {
                if (sjs[i].getNames().equals(name)) {
                    sjs[i] = null;   // 삭제할 배열 요소에 null 대입
                    System.out.println("\n삭제되었습니다\n");
                    break;
                }
            }
        } catch (NullPointerException ex) {
        }
    }

    public void modifySungJuk() {
        // 이름 입력 -> 대상 검색 -> 새로운 데이터 입력 -> 성적 처리
        System.out.print("수정할 학생 이름은? ");
        String name = sc.next();

        for (int i = 0; i < sjs.length; i++) {
            try {
                if (sjs[i].getNames().equals(name)) {
                    System.out.println("국어는? ");
                    int kor = sc.nextInt();
                    System.out.println("영어는? ");
                    int eng = sc.nextInt();
                    System.out.println("수학은? ");
                    int mat = sc.nextInt();

                    SungJukVO sj = new SungJukVO(name, kor, eng, mat);
                    computeSungJuk(sj);
                    sjs[i] = sj;   // 기존 성적데이터 위치에 새롭게 생성한 객체 대입
                    System.out.println("\n수정 완료!!\n");

                    break;
                }
            } catch (NullPointerException ex) {
            } catch (InputMismatchException ex) {
                System.out.println("\n잘못 입력하셨습니다... 다시 시도하세요!\n");
                sc.nextLine();
                return;
            }
        }
    }

    public void readOneSungJuk() {
        // 이름 입력 -> 대상 검색 -> 대상 출력
        System.out.print("조회할 학생 이름은? ");
        String name = sc.next();

        SungJukVO one = null;
        try {
            for (SungJukVO sj : sjs) {
                if (sj.getNames().equals(name)) {
                    one = sj;
                    break;
                }
            }
        } catch (NullPointerException ex) {
        }

        if (one != null) {
            System.out.printf("\n%s\n", one);
        } else {
            System.out.println("찾는 데이터가 없습니다!\n");
        }
    }

    // 성적 리스트 조회 (이름, 국어, 영어, 수학)
    public void readSungJuk() {
        String fmt = "\n%s %d %d %d\n\n";

        try {
            for (SungJukVO sj : sjs) {
                System.out.printf(fmt, sj.getNames(), sj.getKors(), sj.getEngs(), sj.getMats());
            }   // sjs 배열에 저장된 모든 성적 데이터 출력
        } catch (NullPointerException ex) {
        }
    }

    // 성적 데이터 추가
    public void newSungJuk() {
        String name = "";
        int kor = 0, eng = 0, mat = 0;

        try {
            System.out.println("이름은? ");
            name = sc.next();
            System.out.println("국어는? ");
            kor = sc.nextInt();
            System.out.println("영어는? ");
            eng = sc.nextInt();
            System.out.println("수학은? ");
            mat = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("\n잘못 입력하셨습니다... 다시 입력하세요!");
            sc.nextLine();
            return;   // 함수, 메서드 실행 중지
        }

        SungJukVO sj = new SungJukVO(name, kor, eng, mat);
        computeSungJuk(sj);     // 성적 처리
        sjs[idx++] = sj;        // 처리된 성적 데이터 배열에 저장
    }

    public void computeSungJuk(SungJukVO sj) {
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
}
