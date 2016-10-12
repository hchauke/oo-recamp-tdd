import exeption.NotSquareException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class SquareTest {

    @Test
    public void shouldReturnAreaOfASqureAsFour() throws Exception {
        Square square = new Square(2.5, 2.5);
        Assert.assertEquals(6.25, square.returnArea(), 0);
    }

    @Test
    public void shouldReturnAreaOfASqureAs6() throws Exception {
        Square square = new Square(3.0, 3.0);
        assertEquals(9.0, square.returnArea(), 0);

    }

    @Test
    public void shouldThrowExceptionIfNotSquare() throws NotSquareException {
       try {

           Square square = new Square(2.0, 3.0);
           Assert.assertEquals("Not a Squre", square.returnArea());

       } catch (NotSquareException ex){

           ex.getMessage();
       }
    }

    @Test
    public void isSquare() throws Exception {
        Square square = new Square(2.0, 2.0);
        Square square1 = new Square(4.0, 4.0);

        Assert.assertTrue(square.isSquare());
        Assert.assertTrue(square.isSquare());
    }


    @Test
    public void isNotASquare() throws Exception {
        Square square = new Square(-2.0, 2.0);
        Square square1 = new Square(0.0, 4.0);

        Assert.assertTrue(!square.isSquare());
        Assert.assertTrue(!square.isSquare());
    }
}
