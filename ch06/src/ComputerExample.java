public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int result1 = myCom.sum1(new int[] {1,2,3,4});
        System.out.println(result1);

        int[] second_list = new int[] {3,5,1,3,2,7};
        int result2 = myCom.sum1(second_list);
        System.out.println(result2);

        int[] third_list = new int[4];
        third_list = new int[]{3,1,5,3};
        System.out.println(myCom.sum1(third_list));

        System.out.println(myCom.sum2(1,2,3,4,5,6,7,8,9,10));
    }
}
