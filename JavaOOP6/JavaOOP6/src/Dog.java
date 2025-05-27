public class Dog extends Animal
{
    private String breed;

    public Dog(String name, int age, String breed)
    {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat() {
        // 调用重载方法
        eat("dog food");
    }

    @Override
    public void describe() {
        super.describe();  // 调用 Organism.describe()
        System.out.println("It's a dog, breed: " + breed + ", age: " + age);
    }

    // 特有行为
    public void bark() {
        System.out.println(name + " barks: Woof!");
    }
}
