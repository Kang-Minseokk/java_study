import java.lang.reflect.Field;

public class FieldInitValue {
    byte byteField;
    short shortField;
    int intField;
    long logField;
    boolean booleanField;
    char charField;
    float floatField;
    double doubleField;
    int[] arrField;
    String referenceField;

    public static void main(String[] args) {
        FieldInitValue instance = new FieldInitValue();
        System.out.println(instance.byteField);
        System.out.println(instance.intField);
        System.out.println(instance.doubleField);
        System.out.println(instance.arrField);
        System.out.println(instance.floatField);
        System.out.println(instance.shortField);
    }
}
