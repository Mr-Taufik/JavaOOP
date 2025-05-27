public class Cat extends Animal {
    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }

    @Override
    public void eat() {
        eat("cat food");
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("It's a " + (indoor ? "indoor" : "outdoor") + " cat, age: " + age);
    }

    // 方法重载：不同玩法
    public void play() {
        System.out.println(name + " is playing with a ball.");
    }
    public void play(String toy) {
        System.out.println(name + " is playing with a " + toy + ".");
    }
}
