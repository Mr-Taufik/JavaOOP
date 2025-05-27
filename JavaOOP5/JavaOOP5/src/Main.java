public class Main
{
    public static void main(String[] args)
    {
        // 1. 调用 static 方法，无需创建实例
        Friend.showFriends();  // 输出：Hello! You have 0 friends.

        // 2. 创建实例
        Friend alice = new Friend("Alice");
        Friend bob   = new Friend("Bob");
        Friend charlie = new Friend("Charlie");

        // 3. 再次调用 static 方法，查看累积效果
        Friend.showFriends();  // 输出：Hello! You have 3 friends.

        // 4. 调用实例方法，可以同时访问静态与实例字段
        alice.sayHello();
        // 输出：
        // Hello, I'm Alice.
        // Currently total friends: 3

        // 5. 使用 static 嵌套类的方法，重置计数器
        Friend.FriendUtils.resetCount();  // 输出：朋友计数已重置为 0

        // 6. 再创建新对象，验证重置是否生效
        Friend david = new Friend("David");
        Friend.showFriends();  // 输出：Hello! You have 1 friends.
    }
}