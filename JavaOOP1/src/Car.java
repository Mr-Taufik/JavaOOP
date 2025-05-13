public class Car
{
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 50000.00;
    boolean isRunning = true;

    void star()
    {
        isRunning = true;
        System.out.println("The car is running.");
    }

    void stop()
    {
        isRunning = false;
        System.out.println("The car is stopped.");
    }

    void drive()
    {
        System.out.println("You drive the " + model);
    }

    void brake()
    {
        System.out.println("You brake the " + model);
    }
}
