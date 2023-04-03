package examples;

import java.util.Date;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        System.out.println("<7번>");
        // 우선순위 : *, /
        System.out.println("가. " + (3 + 4.5 * 2 + 27 / 8));

        // 우선순위 : !, &&, ||
        System.out.println("나. " + (true || false && 3 < 4 || !(5 == 7)));
        System.out.println("다. " + (true || (3 < 5 && 6 >= 2)));

        // 실행불가!
        // System.out.println("라. " + (!true > 'A'));

        // 단일문자가 수식에 사용되면 ascii 코드로 자동 형변환
        // Z : 90, D : 68, M : 77
        // System.out.println("Z => " + (0 + 'Z'));

        System.out.println("마. " + (7 % 4 + 3 - 2 / 6 * 'Z'));
        System.out.println("바. " + ('D' + 1 + 'M' % 2 / 3));
        System.out.println("사. " + (5.0 / 3 + 3 / 3));
        System.out.println("아. " + (53 % 21 < 45 / 18));
        System.out.println("자. " + ((4 < 6) || true && false || false && (2 > 3)));
        System.out.println("차. " + (7 - (3 + 8 * 6 + 3) - (2 + 5 * 2)));


        System.out.println("\n<8번>");
        // print : 괄호 안의 문자열 출력
        // println : 괄호 안의 문자열 출력 후 자동 줄바꿈 처리
        System.out.println( "가. May 13, 1988 fell on day number" );
        // 특정 일의 요일을 알 수 있음
        System.out.println("나. " + ( (13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100) ) % 7 + 7) % 7 );
        System.out.println( "다. Check out this line ");
        System.out.println( "라. //hello there " + '9' + 7 );

        // 단일문자가 수식에 사용되면 ascii 코드로 자동 형변환
        // H : 72, I : 73, T : 84
        System.out.println( "마. ");
        System.out.println( 'H' + 'I' + " is " + 1 + "more example" );
        System.out.println( "바. ");
        System.out.println( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
        System.out.println( "사. Print both of us" + "Me too");

        // 문자가 문자열과 + 연산 시 문자결합 발생!
        System.out.println("아. ");
        System.out.println( " Reverse " + 'I' + 'T' );
        System.out.println( "자. No! Here is" + 1 + "more example" );

        // 10 * 10을 먼저 연산 후 문자열로 변환해서 문자결합
        System.out.println( "차. Here is " + 10 * 10); // that’s 100 ;
        System.out.println( " Reverse " + 'I' * 'T' );

        System.out.println( "카. Not x is " + true ); // that’s true.
//        System.out.print(  );
//        System.out.println;
        System.out.println( "하. How about this one" + '?' + "Huh?" );

        // 요일 계산
        System.out.println( " Dec 25, 2023 fell on day number " );
        System.out.println( ( (25 + (25 * 2 - 1) / 12 + 2023 % 100 + 2023 % 100 / 4 + 2023 / 400 - 2 * (2023 / 100) ) % 7 + 7) % 7);


        System.out.println("\n<9번>");
        // 우선순위 : !, &&, ||
        // 단축식 평가 1 : and 연산 시 한 쪽이 False면 더 볼 것 없이 전체식의 결과는 False
        // 단축식 평가 2 : or 연산 시 한 쪽이 True면 더 볼 것 없이 전체식의 결과는 True
        System.out.println("가. " + (true && false && true || true));
        System.out.println("나. " + (true || true && true && false));
//        System.out.println("다. " + (true && false) || (true && ! false) || (false && !false));
        System.out.println("라. " + ((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4));
        System.out.println("마. " + (6 == 9 || 5 < 6 && 8 < 4 || 4 > 3));
    }
}
