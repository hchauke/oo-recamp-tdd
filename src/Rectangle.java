import exeption.NotRectangleException;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double returnArea() throws NotRectangleException {
        if (isRectangle()){
            return width * height;

        } else {
            throw new NotRectangleException("Not a Rectangle");
        }
    }


    public boolean isRectangle() {
        return width > 0.0 && height > 0.0 ? true : false;
    }
}
