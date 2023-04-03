package examples;

public class EX02 {
    public static void main(String[] args) {
        // p79 ~ p81
        //3, 4, 5, 6

        // 3번
        System.out.println("<3번>");
        int colorPen = 5 * 12;
        int studentCount = 27;

        int divColorPen = colorPen / studentCount;
        System.out.println("학생당 나눠가지는 색연필 수 : " + divColorPen);

        int remainColorPen = colorPen % studentCount;
        System.out.println("똑같이 나눠가지고 남은 색연필 수 : " + remainColorPen);


        // 4번
        System.out.println("\n<4번>");
        int age = 10;
        int height = 110;
        boolean parent = true;
        boolean hearchDease = true;

        String result = (age >= 6 && (height >= 120 ? true : (height < 120 && parent == true) ? true : false) == true && hearchDease == false) ? "탑승 가능" : "탑승 불가능";
        System.out.printf("나이가 %d살이고 키가 %dcm이며 보호자 동반 여부가 %b이고 심장질환여부가 %b이면 %s합니다.\n", age, height, parent, hearchDease, result);

        // 5번
        System.out.println("\n<5번>");
        int year = 1600;
        boolean leapYear = year % 4 == 0 && !(year % 100 == 0) ? true :
                           year % 4 == 0 && year % 100 == 0 && !(year % 400 == 0) ? false :
                           year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ? true : false;
        System.out.println(leapYear);

        // 6번
        System.out.println("\n<6번>");
        int price = 187000;
        int oman = price / 50000;
        int ilman = (price % 50000) / 10000;
        int ochun = ((price % 50000) % 10000) / 5000;
        int ilchun = (((price % 50000) % 10000) % 5000) / 1000;

        System.out.println("5만원권 : " + oman + "장");
        System.out.println("1만원권 : " + ilman + "장");
        System.out.println("5천원권 : " + ochun + "장");
        System.out.println("1천원권 : " + ilchun + "장");
    }
}