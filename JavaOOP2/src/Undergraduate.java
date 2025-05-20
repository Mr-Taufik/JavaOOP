public class Undergraduate extends Student
{
    String major;
    int year;

    public Undergraduate(String name, int age, double gpa,
                         boolean isEnrooed, String major, int year)
    {
        super(name, age, gpa, isEnrooed);
        this.major = major;
        this.year = year;
    }

    public void attendLecture()
    {
        System.out.println(name + " is attending a lecture in " + major);
    }

    @Override
    public void showInfo()
    {
        super.showInfo();
        System.out.printf("Major: %s, Year: %d%n", major, year);
    }
}



//super关键字的用法
/*
*|
| 1️⃣ 调用父类构造方法 | 用于子类构造函数中初始化父类部分   | `super(...)`         |
| 2️⃣ 调用父类成员方法 | 子类覆盖了方法，但还想调用父类原方法 | `super.methodName()` |
| 3️⃣ 访问父类成员变量 | 子类有同名变量，需访问父类版本    | `super.variableName` |
调用父类构造器（必须是构造方法第一行）
* super 不能在静态方法中使用 因为没有 this 对象，自然也不能访问 super
* super 只能直接访问父类一层的成员  不能跨多级，比如访问“爷爷类”的方法
* */