import exeption.NotSquareException;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class Square  implements Shape{

    private final double width;
    private final double height;

    public Square(double width,double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double returnArea() throws NotSquareException {

        if (!isSquare()){

            throw new NotSquareException("Not a Square");

        }  else {

            return width * height;
        }

    }

    public boolean isSquare() {
        return width == height ? true : false;
    }
}
