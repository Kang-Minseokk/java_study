public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i ++;
        }
        System.out.println("100까지의 총합: " + sum);
    }
}
