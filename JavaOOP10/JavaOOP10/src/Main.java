public class Main
{
    public static void main(String[] args)
    {

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Teo Towers", 253);

        Book[] books = {book1, book2};

        System.out.println(book1.displayInfo());

        for(Book book : books)
        {
            System.out.println(book.displayInfo());
        }

        Library library = new Library("asdf", 124, books);

        library.displayInFo();


        Car car = new Car("Corvette", 2025, "V8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}