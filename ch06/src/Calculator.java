public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double)x / (double)y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        double average = sum / 2;
        return average;
    }

    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

}
