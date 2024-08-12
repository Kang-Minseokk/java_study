public class CalculatorExample {
    public static void main(String[] args) {
        Calculator mycal = new Calculator();
        System.out.println(mycal.plus(1, 2));

        double result = mycal.divide(8, 2);
        System.out.println(result);

        byte x = 10;
        byte y = 2;
        double result2 = mycal.divide(x, y);
        System.out.println(result2);

        double result3 = mycal.avg(4, 5);
        System.out.println(result3);

        double result4 = mycal.plus(3.5, 5.5);
        System.out.println(result4);
    }
}
