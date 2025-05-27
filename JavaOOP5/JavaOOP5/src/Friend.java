public class Friend
{
    private static int numOfFriends;  // 这个是类本身的变量
    //作用范围：将字段或方法绑定到类本身，而不是某个实例
    //在这里，static int numOfFriends; 表示无论创建多少个 Friend 对象，
    // 所有对象共享同一个 numOfFriends 变量，用来统计“朋友”对象的总数。

    public static final String GREETING = "hello";
    //编译期常量，一般用于定义不可变值（如 GREETING）
    // 3. static 初始化块：在类加载时执行一次且只执行 一次。
    static//类加载时只执行一次，用来初始化静态变量或做类级资源准备。
    {
        System.out.println("Friend 类已加载，初始化 numOfFriends 为 0");
        numOfFriends = 0;
    }

    private String name;  // 这个是实例本身的变量

    public Friend(String name)
    {
        this.name = name;
        numOfFriends++;
        // 每创建一个实例，就让静态计数器加一
    }

    public static void showFriends()
    {
        //下面这行如果取消注释，会编译错误static 方法中不能用 this
        // System.out.println("Latest friend: " + this.name);
        System.out.println("You have " + numOfFriends + " friends");
    }

    // 5. 实例方法：可以访问静态成员，也可以访问实例成员
    public void sayHello()
    {
        System.out.println(GREETING + ", I'm " + this.name + ".");
        System.out.println("Currently total friends: " + numOfFriends);
    }

    //static 嵌套类：类似于工具类，可以不依赖外围实例
    //独立于外围实例，可直接通过 Outer.Inner 来使用；
    //常用于将工具方法或辅助逻辑与主类分离
    public static class FriendUtils
    {
        public static void resetCount()
        {
            numOfFriends = 0;
            System.out.println("朋友计数已重置为 0");
        }
    }
}

/*
*static 字段

属于类本身，所有实例共享一份内存；常用于计数、缓存、配置等。
在上例中，numOfFriends 记录所有 Friend 对象的总数。
*
* 
*
* */