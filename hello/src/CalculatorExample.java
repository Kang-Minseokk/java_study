public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();

        double add_result = calculator.add(3,4);
        System.out.println("더한 결과는: " + add_result);


        double divide_result = calculator.divide(6, 2);
        System.out.println("나눈 결과는: " + divide_result);

        calculator.powerOff();

    }
}
