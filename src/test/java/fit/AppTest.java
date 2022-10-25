package fit;

import fit.domain.Book;
import fit.domain.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCreateBooksWithoutErrors()
    {
        var expectedTitle = "title";
        var expectedEdition = 1;

        var b = new Book(expectedTitle, expectedEdition);
        assertEquals(b.getTitle(), expectedTitle);
        assertEquals(b.getEdition(), expectedEdition);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCreatePersonWithoutErrors()
    {
        var expectedName = "default";
        var expectedAge = 0;
        var expectedGender = "f";

        var p = new Person(expectedName, expectedAge, expectedGender);
        assertEquals(p.getName(), expectedName);
        assertEquals(p.getAge(), expectedAge);
        assertEquals(p.getGender(), expectedGender);
    }
}
