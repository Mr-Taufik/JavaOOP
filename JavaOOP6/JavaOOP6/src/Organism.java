public abstract class Organism
{
    // 受保护字段，子类可见
    protected String name;
    // 私有静态字段，所有实例共享
    private static int count = 0;

    // 构造器：初始化名称并累加实例计数
    public Organism(String name)
    {
        this.name = name;
        count++;
    }

    // 抽象方法：所有生物都要实现的“生长”行为
    public abstract void grow();

    // 普通方法：让实例自我描述
    public void describe()
    {
        System.out.println("This is an organism named " + name + ".");
    }

    // final 方法：子类不能重写，用于打印已创建的实例数
    public final void showCount()
    {
        System.out.println("Total organisms created: " + count);
    }
}
