public class Cars
{
    private final String model;//final = “只能赋值/定义一次”
    //只能在声明它的那一个类里面直接访问。
    // 即使是同包中的其他类，或者继承自它的子类，也都不能直接访问
    private String color;
    private int price;

    Cars(String model, String color, int price)
    {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel()
    {
        return this.model;
    }

    String getColor()
    {
        return this.color;
    }

    String getPrice()
    {
        return "$" + this.price;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    void setPrice(int price)
    {
        this.price = price;
    }

}
