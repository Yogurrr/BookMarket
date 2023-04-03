package Yogurrr;

public class C02Operator {
    // psvm + 탭 누르면 기본 구문 나옴
    public static void main(String[] args) {
        // 표현식expression : 리터럴(값), 식별자(변수), 연산자, 함수 호출 등의 조합을 의미
        // 표현식은 평가evaluate(표현식이 실행되어 결과값 생성)되어 하나의 값을 만듦

        int x = 10, y = 20;

        // sout + 탭
        // System.out.println();

        // sout + 탭
        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d\n", x, y, x/y);
        System.out.printf("%d %% %d = %d\n\n", y, x, y%x);
        // 프린트할 때 % 자체를 기호로 나타내고 싶으면 '%%' 이렇게 써야 됨

        // 관계연산자
        System.out.println("<관계연산자>");
        System.out.printf("%d가 %d보다 큰가요? %s\n", x, y, x > y);
        System.out.printf("%d가 %d보다 작은가요? %s\n", x, y, x < y);
        System.out.printf("%d가 %d보다 같은가요? %s\n\n", x, y, x == y);

        // 논리연산자
        System.out.println("<논리연산자>");
        System.out.printf("x < 10 AND x < 20 : %b\n", x < 10 && x < 20);
        System.out.printf("x < 10 OR x < 20 : %b\n", x < 10 || x < 20);
        System.out.printf("NOT(x < 10 AND x < 20) : %b\n\n", !(x < 10 && x < 20));

        // 🤚 : 자바에서는 안 되는 것!
        // System.out.printf("1 + true : %d", 1 + true);
        // System.out.printf("false + true : %d", false + true);

        // 할당연산자 : syntactic sugar
        System.out.println("<할당연산자>");
        System.out.printf("x값은 %d\n", x);

        x += 2;   // x = x + 2
        System.out.printf("x + 2 = %d\n", x + 2);

        x *= 2;   // x = x * 2
        System.out.printf("x * 2 = %d\n", x * 2);

        x -= 2;   // x = x - 2
        System.out.printf("x - 2 = %d\n\n", x - 2);

        // 증가/감소 연산자
        System.out.println("<증가/감소 연산자>");

        x = 10;
        System.out.printf("++x + 1 = %d\n", ++x + 1);

        x = 10;
        System.out.printf("x++ + 1 = %d\n", x++ + 1);

        x = 10;
        System.out.printf("--x + 1 = %d\n", --x + 1);

        x = 10;
        System.out.printf("x-- + 1 = %d\n\n", x-- + 1);

        // 문자열 연산 : +
        // printf 메서드를 사용할 것을 추천!
        System.out.println("<문자열 연산>");
        String name = "홍길동";
        System.out.println("나의 이름은 : " + name);
        System.out.printf("나의 이름은 : %s\n\n", name);

        // 삼항 연산자 : if문의 syntactic sugar
        // 조건식 ? 참일 때의 값 : 거짓일 때의 값

        // ex) 평균 점수가 60점 이상이면 '합격', 아니면 '불합격'이라 출력
        double jumsu = 68.5;
//        double jumsu = 57.5;

        String result = jumsu >= 60 ? "합격" : "불합격";

        String fmt = "평균점수가 %.1f라면 결과는 %s입니다.";
        System.out.printf(fmt, jumsu, result);
    }
}