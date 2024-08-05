public class KoreanExample {
    public static void main(String[] args) {
        Korean person = new Korean("강민석", 24);
        person.changeName("강민석2");
        System.out.println(person.isAdult());

        Korean person2 = new Korean("강해린");
        System.out.println("안녕," + person2.name);

    }

}
