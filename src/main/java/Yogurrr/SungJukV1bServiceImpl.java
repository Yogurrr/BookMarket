package Yogurrr;

import java.util.Scanner;

public class SungJukV1bServiceImpl implements SungJukV1bService {
    private Scanner sc = null;
    SungJukVO[] sjs = null;
    private int idx = 0;

    public SungJukV1bServiceImpl() {
        sc = new Scanner(System.in);
        sjs = new SungJukVO[10];
    }

    // 성적 프로그램 메뉴
    public String displayMenu() {
        StringBuilder sb = new StringBuilder();
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
        String menu = sc.next();

        return menu;
    }

    public void processMenu(String menu) {
        switch (menu) {
            case "1":
        newSungJuk(); break;
        case "2":
        readSungJuk(); break;
        case "3":
        readOneSungJuk(); break;
        case "4":
        modifySungJuk(); break;
        case "5":
        removeSungJuk(); break;
        case "0": System.exit(0); break;
        default:
        System.out.println("\n잘못 입력하셨습니다");
    }
}

    public void removeSungJuk() {
    }

    public void modifySungJuk() {
    }

    public void readOneSungJuk() {
    }

    // 성적 리스트 조회 (이름, 국어, 영어, 수학)
    public void readSungJuk() {
        String fmt = "%s %d %d %d\n";
        for(SungJukVO sj : sjs) {
            if (sj != null) System.out.printf(fmt, sj.getNames(), sj.getKors(), sj.getEngs(), sj.getMats());
        }   // sjs 배열에 저장된 모든 성적 데이터 출력
    }

    // 성적 데이터 추가
    public void newSungJuk() {
        System.out.println("이름은? ");
        String name = sc.next();
        System.out.println("국어는? ");
        int kor = sc.nextInt();
        System.out.println("영어는? ");
        int eng = sc.nextInt();
        System.out.println("수학은? ");
        int mat = sc.nextInt();

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
