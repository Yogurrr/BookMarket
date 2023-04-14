package Yogurrr;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class J28JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.cvdlpxnz2ebi.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";

    private static String selectBookSQL= "select * from newbooks order by bookno desc";

    public static void main(String[] args) {
        // newbooks 테이블의 모든 레코드 조회
        List<Book> bookdata = new ArrayList<>();

        try {
            Class.forName(DRV);
        } catch (ClassNotFoundException e) {
            System.out.println("mariadb 용 JDBC 드라이버가 없어요!!");
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(URL, USR, PWD);
            pstmt = conn.prepareStatement(selectBookSQL);

            // SQL문 실행 후 결과집합 받음
            rs = pstmt.executeQuery();  // DML 실행시 사용

            while(rs.next()) {
                Book book = new Book(rs.getInt(1),
                rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5));
            }

        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번, SQL문을 확인하세요!!");
        } finally {
            if (rs != null) try { rs.close(); } catch (Exception ex) {}
            if (pstmt != null) try { pstmt.close(); } catch (Exception ex) {}
            if (conn != null) try { conn.close(); } catch (Exception ex) {}
        }

        // 도서정보 출력
        for (Book b : bookdata) {
            System.out.println(b);
        }
    }
}

class Book {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;

    public Book() {
    }

    public Book(int bookno, String title, String writer, int price, String regdate) {
        this.bookno = bookno;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %d %s";
        return String.format(fmt, bookno, title, writer, price, regdate);
    }
}