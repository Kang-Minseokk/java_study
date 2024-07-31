public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] langArray = new String[4];
        langArray[0] = "Java";
        langArray[1] = "Python";
        langArray[2] = "JavaScript";
        langArray[3] = "C";

        String[] newLangArray = new String[5];

        for(int i = 0; i < langArray.length; i++) {
            System.out.println(langArray[i]);
        }

        System.arraycopy(langArray, 0, newLangArray, 1, 3);

        for (int i = 0; i < newLangArray.length; i++) {
            System.out.println("newLangArray[" + i + "]: " + newLangArray[i]);
        }
    }
}
