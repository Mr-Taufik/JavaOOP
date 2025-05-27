public class Plant extends Organism
{
    private double height; // 单位：厘米

    public Plant(String name, double initHeight) {
        super(name);
        this.height = initHeight;
    }

    @Override
    public void grow() {
        height += 1.5;
        System.out.println(name + " grew, now height = " + height + "cm");
    }

    // 特有行为
    public void photosynthesize()
    {
        System.out.println(name + " is photosynthesizing.");
    }
}
