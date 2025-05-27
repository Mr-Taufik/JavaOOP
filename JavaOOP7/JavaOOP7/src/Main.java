public class Main {
    public static void main(String[] args)
    {
        // 多态：用父类型引用指向子类实例
        Animal a1 = new Dog("Buddy");
        Pet    p1 = new Dog("Lassie");

        System.out.println("=== 以 Animal 引用操作 ===");
        a1.identity();     // final 方法，不能被重写
        a1.breathe();      // 调用 Dog 中重写的 breathe()
        a1.eat();          // 调用 Mammal 中实现的 eat()
        // a1.nurseYoung(); // 编译错：Animal 类型看不到 nurseYoung()

        System.out.println("\n=== 以 Pet 引用操作 ===");
        System.out.println("Pet 名称: " + p1.getPetName());
        p1.play();         // 调用接口中的 default 方法

        System.out.println("\n=== 强制转换后调用特有方法 ===");
        if (a1 instanceof Dog)
        {
            Dog dog = (Dog) a1;
            dog.bark();        // Dog 的特有方法
            dog.bark(3);       // 方法重载示例
            dog.nurseYoung();  // Mammal 中的抽象方法实现
        }

        System.out.println("\n=== Animal 统计 ===");
        System.out.println("已创建的 Animal 实例数: " + Animal.getCount());

        // 也可以把多个不同的 Animal 放入数组，演示循环多态
        Animal[] zoo = {
                new Dog("Rex"),
                new Dog("Max"),
                new Dog("Bella")
        };
        System.out.println("\n=== 遍历 Zoo ===");
        for (Animal animal : zoo) {
            animal.breathe();
            animal.eat();
        }

        System.out.println("\n=== Aquatic demo ===");
        AquaticAnimal d1 = new Dolphin("Flipper");

        // 抽象类的具体方法
        d1.swim();
        d1.showMaxDepth();

        // 抽象类的 final 方法
        d1.tailFlap();

        // 接口 default 方法已被重写
        d1.dive();

        // Dolphin 独有实现的抽象方法
        d1.uniqueSound();

        /* 3. 静态方法 & 变量 */
        System.out.println("\n已创建的水生动物数量: " + AquaticAnimal.getAquaticCount());


    }
}



/*
* 多态的两种形式编译时多态（静态多态）——方法重载（Overloading）
* class Printer {
  void print(String s) { … }
  void print(int i)    { … }
}

* 运行时多态（动态多态）——方法重写（Overriding）
* class Animal {
  void speak() { System.out.println("…"); }
}
class Dog extends Animal {
  @Override
  void speak() { System.out.println("Woof"); }
}
class Cat extends Animal {
  @Override
  void speak() { System.out.println("Meow"); }
}
// …
Animal a = getSomeAnimal();
a.speak();  // 运行时根据真实类型决定调用 Dog 或 Cat 的实现

*
* 方法重载就是// Calculator.java
public class Calculator {

    // 1. 两个 int 相加
    public int add(int a, int b) {
        return a + b;
    }

    // 2. 两个 double 相加
    public double add(double a, double b) {
        return a + b;
    }

    // 3. 三个 int 相加
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 4. 可变参数：任意多个 int 相加
    public int add(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }
}

* 同一个方法可以有多种不同的参数输入，然后可以通过自己去判别然后根据不同的参数类型去
* 使用不同的方法。编辑器会根据你调用时传入的的实际参数去自动选择合适的重载版本
* */



