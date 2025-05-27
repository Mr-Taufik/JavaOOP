public abstract class Animal
{
    protected String name;
    private static int count = 0;

    public Animal(String name)
    {
        this.name = name;
        count++;
    }

    public abstract void eat();

    public void breathe()
    {
        System.out.println(name + " is breathing.");
    }

    public static int getCount()
    {
        return count;
    }
    // final 方法：子类不能覆盖
    public final void identity()
    {
        System.out.println("I am an Animal named " + name);
    }
}
/***
常见 abstract 特性速览
 | 特性                | 说明                            | 代码如何体现                                                  |
 | ----------------- | ----------------------------- | ------------------------------------------------------- |
 | **不能被实例化**        | `new AbstractClass()` 会编译错误   | `// AquaticAnimal a = new AquaticAnimal(...); // ❌`     |
 | **可拥有构造器**        | 用来初始化共有字段 / 统计实例数             | `AquaticAnimal(String name, double maxDepth){ … }`      |
 | **可定义字段**         | 普通字段、`static` 字段、`final` 常量都行 | `protected double maxDepth;`                            |
 | **可写具体方法**        | 子类可以直接用，或者选择重写                | `void showMaxDepth(){ … }`                              |
 | **可声明抽象方法**       | 让首个具体子类实现                     | `public abstract void uniqueSound();`                   |
 | **可写 `final` 方法** | 禁止子类重写                        | `public final void tailFlap(){ … }`                     |
 | **可写静态成员**        | `static` 变量 / 方法 / 代码块        | `static{ System.out.println("AquaticAnimal loaded"); }` |
 | **可实现接口**         | 弥补单继承限制                       | `abstract class AquaticAnimal … implements Swimmable`   |


 1 不能被实例化，抽象类不能用new对象，只能被继承然后由子类实现未完成的内容

 2 可以包含构造方法，虽然不能直接创建对象，但可以拥有构造器，通过子类用super调用，完成字段初始化等任务

 3 可以定义字段，可以拥有实例变量 静态变量 常量

 4 可以包含具体方法，而不是抽象方法，可以定义属于自己的已经实现的方法，子类可以选择是否重写

 5 可以包含抽象方法（未实现） 用abstract 修饰的方法没有方法体，由子类必须实现。一旦类里面由abstract方法，类本身也必须是abstract

 6 可以包含 final 方法（不能被子类重写）final 方法在抽象类中可以存在，表示子类不能改写它的实现逻辑。

 7 可以包含 static 方法和静态代码块 static 代码块（类加载时自动执行一次）
 8 可以实现接口
 抽象类可以用 implements 实现接口：

 选择性地实现部分接口方法；

 留下未实现的方法交给具体子类处理。

 abstract class AquaticAnimal extends Animal implements Swimmable {
 public void swim() { ... }
 public abstract void dive(); // 子类来实现
 }


 ***/
