public class CarExample {
    public static void main(String[] args) {
        Car dreamCar = new Car("tesla", "S", "Black", 300, 40);
        System.out.println(dreamCar.company);

        dreamCar.changeColor("Blue");
        System.out.println(dreamCar.color);
    }


}
