import exeption.NotRectangleException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class RectangleTest {


    @Test
    public void shouldPass() throws Exception {
        assertTrue(true);
    }

    @Test
    public void shouldReturnTheAreaOfARectangleAsTwenty() throws Exception {
        Rectangle rectangle = new Rectangle(5.4, 2.0);

        assertEquals(10.8, rectangle.returnArea(), 0);
    }

    @Test
    public void shouldReturnTheAreaOfRectangleAsThirty() throws Exception {
        Rectangle rectangle = new Rectangle(6.5, 5.0);

        assertEquals(32.5, rectangle.returnArea(), 0);
    }

    @Test
    public void isARectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2, 4);
        Rectangle rectangle1 = new Rectangle(3, 5);

        assertTrue(rectangle.isRectangle());
        assertTrue(rectangle1.isRectangle());
    }

    @Test
    public void isNotARectangle() throws Exception {
        Rectangle rectangle = new Rectangle(0.0, 5);
        Rectangle rectangle1 = new Rectangle(-2, 5);

        assertTrue(!rectangle.isRectangle());
        assertTrue(!rectangle1.isRectangle());
    }

    @Test
    public void shouldThrowExceptionIfNotRectangle() throws NotRectangleException {
        try {

            Rectangle rectangle = new Rectangle(0, 3.0);
            Rectangle rectangle1 = new Rectangle(-2, 5);

            assertEquals("Not a Rectangle", rectangle.returnArea());
            assertEquals("Not a Rectangle", rectangle1.returnArea());

        } catch (NotRectangleException ex){

            ex.getMessage();
        }
    }
}
