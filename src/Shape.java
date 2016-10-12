import exeption.NotACircleException;
import exeption.NotRectangleException;
import exeption.NotSquareException;

/**
 * Created by hlulani on 2016/10/12.
 */
public interface Shape {

    double returnArea() throws NotSquareException, NotACircleException, NotRectangleException;
}
