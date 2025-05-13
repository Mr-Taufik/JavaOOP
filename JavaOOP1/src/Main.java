

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.isRunning = false;
        System.out.println(car.isRunning);
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);

        car.star();
        car.stop();

        car.drive();
        car.brake();

        Car car2 = new Car();
        System.out.println(car2.make + " " + car2.model);


    }
}