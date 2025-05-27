public abstract class Animal extends Organism
{
    protected int age;

    public Animal(String name, int age)
    {
        super(name);    // 调用 Organism 的构造器
        this.age = age;
    }

    // 抽象方法：不同动物的“进食”方式各不相同
    public abstract void eat();

    // 方法重载：带参数的 eat  Overload  提供一组同名方法，针对不同输入做不同处理。
    public void eat(String food)
    {
        System.out.println(name + " is eating " + food + ".");
    }

    // 重写父类的 grow 方法：动物生长增加年龄
    @Override
    public void grow()
    {
        age++;
        System.out.println(name + " grew older, now age = " + age);
    }

    // protected 方法：子类或同包可以调用
    protected void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
