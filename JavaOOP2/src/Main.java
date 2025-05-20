public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Student("taozk", 19, 3.0, true);
        //如果我们有构造函数的话，不传入那写参数就没办法构造对象
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        student1.study();

        Student s1 = new Student("Alice", 20, 3.8, true);
        Undergraduate u1 = new Undergraduate("Bob", 19, 3.5, true, "Computer Science", 2);
        s1.showInfo();
        s1.study();
        u1.showInfo();
        u1.attendLecture();
    }
}