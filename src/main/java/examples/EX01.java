package examples;

public class EX01 {
    public static void main(String[] args) {
        // 1번
        System.out.println("1. ");
        System.out.println("*   *     **     ****    ****    *   *        /////");
        System.out.println("*   *    *  *    *   *   *   *   *   *       | 0 0 |");
        System.out.println("*****   *    *   ****    ****     * *       (|  ^  |)");
        System.out.println("*   *   ******   *   *   *   *     *         | [_] |");
        System.out.println("*   *   *    *   *    *  *    *    *          -----");
        System.out.println("            +---+");
        System.out.println("            |   |");
        System.out.println("        +---+---+");
        System.out.println("        |   |   |");
        System.out.println("    +---+---+---+      /\\___/\\     ______");
        System.out.println("    |   |   |   |     ( '   ' )   / Hello \\");
        System.out.println("+---+---+---+---+     (   -   )  <  Junior |");
        System.out.println("|   |   |   |   |      |  |  |    \\ Coder! /");
        System.out.println("+---+---+---+---+     (___|___)    ￣￣￣￣");
        
        
        // 2번
        int soju = 3000;
        int sj_qty = 2;
        int chicken = 12000;
        int chck_qty = 1;

        int total = (soju * sj_qty) + (chicken * chck_qty);
        double vat = total * 0.1;
        double sum = total * 0.9;

        int money = 50000;
        int charge = money - total;

        System.out.println(" ");
        System.out.println("2.");
        System.out.println("[ 음식나라 ]");
        System.out.println("------------------------------");
        System.out.println("소주\t\t\t " + sj_qty + "\t\t" + soju * sj_qty);
        System.out.printf("너나치킨\t\t %d\t\t%d\n", chck_qty, chicken);
        System.out.println("------------------------------");
        System.out.printf("과세합계\t\t\t\t%.0f\n", sum);
        System.out.printf("부가세\t\t\t\t%.0f\n", vat);
        System.out.println("------------------------------");
        System.out.printf("총합계\t\t\t\t%d\n", total);
        System.out.printf("받은금액\t\t\t\t%d\n", money);
        System.out.printf("잔돈\t\t\t\t    %d\n", charge);
        System.out.println("------------------------------");
        System.out.println("2023. 03. 30 17:36:00");
    }
}
