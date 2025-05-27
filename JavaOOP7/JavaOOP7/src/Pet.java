public interface Pet
{
    String getPetName();


    default void play()
    {
        System.out.println(getPetName() + " is playing!");
    }
    //默认方法实现类可选重写，也可以直接继承默认行为。

}
