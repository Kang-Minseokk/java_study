public class Korean {
    String nation = "Korea";
    String name;
    int age;

    public Korean(String n, int s) {
        name = n;
        age = s;
    }

    public Korean(String n) {
        name = n;
    }

    public void changeName(String n) {
        this.name = n;
        System.out.println("이제부터 당신의 이름은" + this.name + " 입니다.");
    }

    public boolean isAdult() {
        if (this.age < 19) {
            return false;
        } else return true;
    }
}
