package Yogurrr;

import java.sql.*;
import java.util.Scanner;

public class J27JDBC {

    private static String insertBookSQL= "insert into newbooks (titles, writer, price) values (?, ?, ?)";

    public static void main(String[] args) {
        // newbooks 테이블에 도서정보 저장
        Scanner sc = new Scanner(System.in);
        System.out.println("도서명은? ");
        String bkname = sc.next();
        System.out.println("저자는? ");
        String author = sc.next();
        System.out.println("가격은? ");
        int price = sc.nextInt();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 데이터베이스 접속
            conn = J32JDBCUtil.makeConn();
            // 실행할 SQL문 생성
            pstmt = conn.prepareStatement(insertBookSQL);
            // 실행할 SQL문의 placeholder에 값 전달
            pstmt.setString(1, bkname);
            pstmt.setString(2, author);
            pstmt.setInt(3, price);

            // SQL문 실행 후 결과 확인
            int cnt = pstmt.executeUpdate();  // DML 실행시 사용
            System.out.println("데이터 입력확인 : " + cnt);

        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번, SQL문을 확인하세요!!");
        } finally {
            // 매개변수 하나 없으면 그냥 null이라고 쓰기
            J32JDBCUtil.closeConn(null, pstmt, conn);
        }
    }
}
