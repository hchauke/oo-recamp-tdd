import exeption.NotACircleException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class CircleTest {

    @Test
    public void shouldReturnAreaIfRadiusIsOne() throws NotACircleException {
        Circle circle = new Circle(1);

        assertEquals(3.14, circle.returnArea(), 0);
    }

    @Test
    public void shouldReturnAreaIfRadiusIsTwo() throws NotACircleException {
        Circle circle = new Circle(2);

        assertEquals(12.57, circle.returnArea(), 0);
    }

    @Test
    public void shouldThrowExceptionIfNotACircle() throws Exception {
        try {

            Circle circle = new Circle(0);
            Circle circle1 = new Circle(-3);

            assertEquals("Not a Circle", circle.returnArea());
            assertEquals("Not a Circle", circle1.returnArea());

        } catch (NotACircleException ex){

            ex.getMessage();
        }
    }

    @Test
    public void testIfRadiusIsGreaterThanZero() throws Exception {
        Circle circle = new Circle(2);
        assertTrue(circle.isARadius());
    }

    @Test
    public void testIsNoARadius() throws Exception {
        Circle circle = new Circle(0);
        Circle circle1 = new Circle(-3);

        assertTrue(!circle.isARadius());
        assertTrue(!circle1.isARadius());
    }
}
