public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.PowerOn();

        System.out.println("더한 값의 결과는: " + myCal.add(4, 9));


        System.out.println("뺀 값의 결과는: " + myCal.divide(8, 3));
        myCal.PowerOff();
    }

}
