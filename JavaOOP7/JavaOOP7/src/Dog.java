public class Dog extends Mammal implements Pet
{
    public static final String SPECIES = "Canis lupus familiaris";

    // 构造器：链式调用
    public Dog(String name)
    {
        super(name, true);
    }

    // 实现 Mammal 的抽象方法
    @Override
    public void nurseYoung()
    {
        System.out.println(name + " nurses its puppies.");
    }

    // 可以重写父类的具体方法
    @Override
    public void breathe()
    {
        System.out.println(name + " breathes through its nose.");
    }

    // 实现 Pet 接口方法
    @Override
    public String getPetName()
    {
        return name;
    }

    // 独有方法
    public void bark()
    {
        System.out.println(name + " says: Woof!");
    }

    // 演示方法重载
    public void bark(int times)
    {
        for (int i = 0; i < times; i++)
        {
            bark();
        }
    }


}
