public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();

        Car car = carBuilder
                .model("BMW")
                .fuelType("99")
                .speed(250)
                .colour(Colour.RED)
                .build();

        System.out.println(car);
    }
}
