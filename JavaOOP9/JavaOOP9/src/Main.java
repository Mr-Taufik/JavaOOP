public class Main
{
    public static void main(String[] args)
    {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car, bike, boat};
//只要让所有子类都继承同一个父类（或实现同一个接口），
// 就可以把它们放进同一个类型的数组／集合，从而享受多态的便利
        for(Vehicle vehicle : vehicles)
        {
            vehicle.go();
        }

        Vehicle vehicle;
        Vehicle vehicle2 = new Bike();
        vehicle = new Car();


        Cars cars = new Cars("aaa", "red", 1234);

        System.out.println(cars.getModel());

        cars.setColor("yellow");
        cars.setPrice(4567);
        System.out.println(cars.getColor());
        System.out.println(cars.getPrice());
    }
}