// 中间抽象类，继承自 Animal，进一步定义哺乳动物的行为
public abstract class Mammal extends Animal {
    // 特有属性
    protected boolean hasFur;

    // 构造器链式调用 super()
    public Mammal(String name, boolean hasFur)
    {
        super(name);
        this.hasFur = hasFur;
    }

    // 实现父类的抽象方法，提供默认行为
    @Override
    public void eat()
    {
        System.out.println(name + " munches food as a mammal.");
    }

    // 新增抽象方法：哺乳动物特有的哺育行为
    public abstract void nurseYoung();

    // 静态代码块：类加载时执行一次
    static
    {
        System.out.println("Mammal class loaded.");
    }
}
