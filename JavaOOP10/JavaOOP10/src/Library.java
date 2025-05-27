public class Library
{
    String name;
    int year;
    Book[] books;


    Library(String name, int year, Book[] books)
    {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInFo()
    {
        System.out.println("The " + this.name + "  " + this.year);
        System.out.println("Books Available: ");
        for(Book book : books)
        {
           System.out.println(book.displayInfo());
        }

    }
}
