public class Dolphin extends AquaticAnimal {

    public Dolphin(String name)
    {
        super(name, 300);   // 海豚平均下潜深度示例
    }

    /* 实现父类的抽象方法 */
    @Override
    public void uniqueSound() {
        System.out.println(name + " whistles and clicks.");
    }

    /* 可选择重写接口 default 方法 */
    @Override
    public void dive() {
        System.out.println(name + " performs a deep dive!");
    }

    @Override
    public void eat()
    {
        System.out.println(name + " eats the doll!");
    }
}
