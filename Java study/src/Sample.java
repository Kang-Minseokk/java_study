import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5,6,6));

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);
    }
}