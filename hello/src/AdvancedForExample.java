public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {94, 90, 97, 100, 94};
        int sum = 0;
        for (int score : scores){
            System.out.println(score);
            sum += score;
        }
        System.out.println("점수의 총합: " + sum);
    }
}
