public class Student
{
    String name;
    int age;
    double gpa;
    boolean isEnrooled;


    //默认构造函数
    //如果在类中未显式定义任何构造函数，编译器会自动提供一个“无参构造函数”，
    // 形如 public ClassName() {}。用于创建对象后采用默认值初始化成员变量

    //无参数构造. 类有一个无参构造函数，以便通过反射自动创建对象
    public Student()
    {
        // 编译器隐式提供，等价于：
        // this.name = null; this.age = 0; this.gpa = 0.0; this.isEnrooled = false;
        this("Unknown", 18, 0.0, false);
    }

    public Student(String name)
    {
        this(name, 18, 0.0, false);
    }

    public Student(String name, int age, double gpa)
    {
        this(name, age, gpa, false);
    }

    public Student(String name, int age, double gpa, boolean isEnrooled)//全参数构造
    {
           this.name = name;
           this.age = age;
           this.gpa = gpa;
           this.isEnrooled = isEnrooled;
           //只要你处在 实例方法或构造方法 里，
           // 编译器都会为你隐式地提供一个名为 this 的引用
    }


    //拷贝函数
    public Student(Student other)//同类型的对象，来创建一个属性完全相同的新对象。
    {
        this(other.name, other.age, other.gpa, other.isEnrooled);
    }

     public void study()
     {
         System.out.println(name + " is studying");
         // 等价写法：System.out.println(this.name + " is studying"); 如果这个数据前面加了static就不可以使用this了
     }

     public void showInfo()
     {
         System.out.printf("Name: %s, Age %d, GPA: %.2f, Enrolled: %b%n", name, age, gpa, isEnrooled);
     }
}






/// 拷贝函数
//Student s1 = new Student("Tom", 20, 3.8, true);
//Student s2 = new Student(s1); // s2 是 s1 的一个“复制品”
//但 s2 是一个新的独立对象，在内存中与 s1 不同。
///Student s2 = s1;
///这只是“引用赋值”，两个变量 s1 和 s2 指向同一个对象，对其中一个的修改会影响另一个。