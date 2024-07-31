public class ArrayInArrayExample {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores["+i+"]["+j+"]=" + mathScores[i][j]);
            }
        }
        System.out.println();

        int[][] javaScores = {{32, 64}, {12, 56, 100}};

        for (int i = 0; i < javaScores.length; i++) {
            for (int j = 0; j < javaScores[i].length; j++) {
                System.out.println("javaScore[" + i + "][" + j + "]: " + javaScores[i][j]);
            }
        }

    }
}
