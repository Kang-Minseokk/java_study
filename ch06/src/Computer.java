public class Computer {
    int sum1(int[] integerList) {
        int result = 0 ;
        for (int i=0; i<integerList.length; i++) {
            result += integerList[i];
        }
        return result;
    }

    int sum2(int ... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
