public class Car {
    String company = "tesla";
    String model = "s";
    String color = "black";
    int maxSpeed = 300;
    int speed;

    int gas;

    public Car(String company, String model, String color, int maxSpeed, int speed) {
        company = company;
        model = model;
        color = color;
        maxSpeed = maxSpeed;
        speed = speed;
    }

    public Car(String company, int maxSpeed) {
        company = company;
        maxSpeed = maxSpeed;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas 잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;
            }
        }
    }
}
