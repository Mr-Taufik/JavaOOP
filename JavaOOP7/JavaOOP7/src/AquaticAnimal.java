public abstract class AquaticAnimal extends Animal implements Swimmable
{

    /* ---------------- 静态成员 ---------------- */
    private static int aquaticCount = 0;                 // 统计水生动物数量
    public static final String KINGDOM = "Animalia";     // 常量

    static
    {                                             // 静态代码块：类加载一次
        System.out.println("AquaticAnimal class loaded.");
    }

    /* ---------------- 实例成员 ---------------- */
    protected double maxDepth;    // 最大潜水深度（米）

    /* ---------------- 构造器 ------------------ */
    public AquaticAnimal(String name, double maxDepth)
    {
        super(name);              // 必须先调父类 Animal 的构造器
        this.maxDepth = maxDepth;
        aquaticCount++;
    }

    /* ---------------- 抽象方法 ---------------- */
    public abstract void uniqueSound();   // 留给具体水生动物去实现

    /* ---------------- 具体/可选重写的方法 ----- */
    @Override
    public void swim() {                  // Swimmable 接口方法的默认实现
        System.out.println(name + " swims gracefully.");
    }

    public void showMaxDepth() {
        System.out.println(name + " can dive to " + maxDepth + " m.");
    }

    /* ---------------- 无法重写的方法 ---------- */
    public final void tailFlap() {        // final：子类不可覆盖
        System.out.println(name + " flaps its tail for propulsion.");
    }

    /* ---------------- 静态方法 ---------------- */
    public static int getAquaticCount() {
        return aquaticCount;
    }
}
