public class Car implements Cloneable
{
    private String model;
    private String color;

    public Car(String model, String color)
    {
        this.model = model;
        this.color = color;
    }

    // Getter & Setter
    public String getModel() { return this.model; };
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    void drive()
    {
        System.out.println("You drive the " + this.color + " " + this.model);
    }

    // 实现 Cloneable 以支持深拷贝
    @Override
    public Car clone()
    {
        try
        {
            return(Car) super.clone();
        }catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }
}
