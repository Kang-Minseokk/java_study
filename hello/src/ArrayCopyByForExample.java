public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};

        int[] newIntArray = new int[5];

        System.arraycopy(oldIntArray, 0, newIntArray, 0, 3);

        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println("newIntArray[" + i + "]: " + newIntArray[i]);
        }
    }
}
