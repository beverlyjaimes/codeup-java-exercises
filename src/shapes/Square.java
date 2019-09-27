package shapes;
//extends from rectangle
public class Square extends Quadrilateral {


    public  Square(double side) {
        super(side,side);
    }

    @Override
    void setWidth(double width) {

    }

    @Override
    void setLength(double length) {

    }

    @Override
    public double getArea() {
        return 4 * super.length;

    }

    @Override
    public double getPerimeter() {
        return super.length * super.width;

    }



    ////    all sides of a square are the same
//
//    public Square(double side) {
//        super(side,side);
//    }
//
//
//    @Override
//    public double getArea(){
//        return 4 * super.length;
//    }
////    or Math.pow(super
//    @Override
//    public double getPerimeter(){
//        return super.length * super.width;
//    }
}
//super and @override are hinting that you are overriding from the parent class