package fit;

import fit.domain.Book;
import fit.services.BookService;
import fit.domain.Person;
import fit.services.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var bookSvc = new BookService();
        System.out.println("Dados de livros...");

        bookSvc.add(new Book("Title default", 1));
        System.out.println(bookSvc.getAll());


        var personSvc = new PersonService();
        System.out.println("Dados de pessoas...");

        personSvc.add(new Person("Name default", 18, "M"));
        System.out.println(personSvc.getAll());
    }
}
