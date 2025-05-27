import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Car[] garage = {
                new Car("Mustang", "Red"),
                new Car("Civic",   "Blue"),
                new Car("Camry",   "White")
        };

        System.out.println("== 普通 for 修改颜色 ==");
        for (int i = 0; i < garage.length; i++)
        {
            garage[i].setColor("Black");
        }
        for (Car c : garage) c.drive();

        System.out.println("\n== 增强型 for 重新 new 引用（不生效） ==");
        for (Car c : garage)
        {
            c = new Car("Ferrari", "Yellow");
        }
        for (Car c : garage) c.drive();

        // —— 3. 浅拷贝 vs 深拷贝 ——
        System.out.println("\n== 浅拷贝 clone() 示例 ==");
        Car[] shallow = garage.clone();
        shallow[0].setModel("ModelX");

        System.out.print("garage[0]: "); garage[0].drive();
        System.out.print("shallow[0]: "); shallow[0].drive();
        System.out.println("\n== 深拷贝 clone() 示例 ==");

        Car[] deep = new Car[garage.length];

        for (int i = 0; i < garage.length; i++)
        {
            deep[i] = garage[i].clone();  // 每个元素都调用 clone()
        }
        deep[0].setModel("Roadster");
        System.out.print("garage[0]: "); garage[0].drive();
        System.out.print("deep[0]:   "); deep[0].drive();

        // —— 4. 多维数组 ——
        System.out.println("\n== 多维数组示例 ==");
        Car[][] showroom = { garage, deep };
        for (Car[] row : showroom)
        {
            for (Car c : row)
            {
                c.drive();
            }
        }

        // —— 5. ArrayList 操作 ——
        System.out.println("\n== ArrayList 示例 ==");
        List<Car> fleet = new ArrayList<>(Arrays.asList(garage));
        fleet.add(new Car("Corolla", "Green"));

        for (Car c : fleet) c.drive();

        // removeIf 按条件删除
        System.out.println("\n== 按条件移除所有 Black 车 ==");
        fleet.removeIf(c -> c.getColor().equalsIgnoreCase("Black"));

        for (Car c : fleet) c.drive();

    }
}