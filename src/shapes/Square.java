package shapes;
//extends from rectangle
public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    void setWidth(double width) {
        super.width = width;

    }

    @Override
    void setLength(double length) {
        super.length =length;
    }

    @Override
    public double getArea() {
        return super.length * super.length;

    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;


    }
}
//super and @override are hinting that you are overriding from the parent class