import exeption.NotACircleException;

import java.text.DecimalFormat;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class Circle implements Shape{

    private final double radius;
    private final DecimalFormat formater = new DecimalFormat("#.##");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double returnArea() throws NotACircleException {
        if (isARadius()) {
            return Double.parseDouble(formater.format((Math.PI) * (radius * radius)));
        } else {
            throw new NotACircleException("Not a Circle");
        }
    }

    public boolean isARadius() {
        return radius > 0 ? true : false;
    }
}
