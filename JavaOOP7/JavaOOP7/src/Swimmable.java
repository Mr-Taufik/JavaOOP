public interface Swimmable
{
    // 抽象方法：必须由实现类提供代码
    void swim();

    // default 方法：实现类可用也可重写
    default void dive()
    {
        System.out.println("Diving into the water...");
    }
}
