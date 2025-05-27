
public class Main
{
    public static void main(String[] args)
    {

        //Autoboxing
        Integer a1 = 123;
        Double b1 = 3.14;
        Character c1 = '$';
        Boolean d1 = true;
        String e1 = "Pizza";
        // Unboxing
        int x1 = a1;

        boolean y = d1;

        String a = Integer.toString(123);  //int 是基本类型，不是类，也就不能调用任何方法。
        String b = Double.toString(3.14);
        //Integer 是 int 的包装类（java.lang.Integer），
        // 它是一个普通的类，所以可以在它身上定义静态方法或实例方法
        //Integer.toString(int i) 就是包装类里提供的一个静态方法，专门把 int 转成 String
        String c = Character.toString('a');
        String d = Boolean.toString(false);

        String x = a + b + c + d;
        System.out.println(x);

        String a2 = String.valueOf(123);  //这个和上面那种写法是一样的，这个是直接调用底层了
        String b2 = String.valueOf(3.14);
        String c2 = String.valueOf('a');
        String d2 = String.valueOf(false);

        String x2 = a2 + b2 + c2 + d2;
        System.out.println(x2);


        int a3 = Integer.parseInt("123");   //解析整形
        double b3 = Double.parseDouble("3.14");   //解析双精度
        char c3 = "Pizza".charAt(0);
        boolean d3 = Boolean.parseBoolean("true");   // 解析布尔


        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println(d3);

        char letter = 'a';
        // 判断是不是字母（A–Z 或 a–z）
        System.out.println(Character.isLetter(letter));
        // 判断是不是大写字母（A–Z）
        System.out.println(Character.isUpperCase(letter));
    }
}