public class Main
{
    public static void main(String[] args)
    {
        //父类引用指向子类对象：是 Java 类型兼容性（向上转型）的规则，最常用来实现多态。
        //这里面主要是看new后面的类去定实例是哪一个具体的类了
        Organism oak = new Plant("Oak Tree", 120.0);
        Animal dog = new Dog("Buddy", 3, "Labrador");
        Animal cat = new Cat("Kitty", 2, true);

        // 多态演示
        oak.describe();
        oak.grow();
        ((Plant) oak).photosynthesize();
        //子类特有功能：如果你需要使用到子类独有的方法，就必须告诉编译器“这个 Organism 其实是个 Plant”，所以要 向下转型。



        dog.describe();
        dog.eat();
        dog.grow();
        ((Dog) dog).bark();
        dog.showCount();  // final 方法

        cat.describe();
        cat.eat();
        cat.grow();
        ((Cat) cat).play();
        ((Cat) cat).play("yarn");

        // instanceof 检查
        if (dog instanceof Animal)
        {
            System.out.println(dog.name + " is indeed an Animal.");
        }


    }
}

/*oak.describe()：

编译期看 oak 的类型是 Organism，describe() 在 Organism 中定义为普通方法，所以可以直接调用。
运行期，若子类重写了 describe()，JVM 会执行 Plant 或其他子类的版本；否则就执行父类的实现。

oak.grow()：

grow() 在 Organism 中声明为抽象方法，子类必须实现。
编译期同样只检查父类签名；运行时 JVM 动态绑定到 Plant.grow()，调用子类的生长逻辑。

((Plant) oak).photosynthesize()：

photosynthesize() 是 Plant 特有的方法，不在 Organism 或其共同父类中声明。
因此必须先把 oak（父类引用）向下转型为 Plant，才能访问这一子类独有的方法。
转型前最好用 if (oak instanceof Plant) 检查，避免 ClassCastException。

方法重载（Overloading）是在一个类里提供同名而参数不同的方法，这属于编译时多态，是静态的。
真正的运行时多态是方法重写（Overriding）+ 向上转型（Upcasting）+ 动态绑定，核心在于“同一个方法调用表达式，在不同类型的对象上执行不同的实现”。
*
“对外用统一的父类（或接口）来操作，对内在运行时能触发不同子类的具体行为。”

Organism oak = new Plant(...) 与 Plant oak = new Plant(...) 的区别
|               | `Organism oak = new Plant(...)`  | `Plant oak = new Plant(...)`     |
| ------------- | -------------------------------- | -------------------------------- |
| 变量的静态类型       | `Organism`                       | `Plant`                          |
| 可调用的方法（编译时）   | 只有 `Organism` 中定义的方法（如 `grow()`） | `Plant`（和其父类）中所有方法               |
| 体现的多态         | ✔ 可以统一用 `Organism` 引用不同子类        | ✘ 变量只能指向 `Plant`                 |
| 调用子类特有方法是否需转型 | ✔ 需要 `((Plant) oak)`             | ✘ 直接调用即可 `oak.photosynthesize()` |

*/