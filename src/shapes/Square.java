package shapes;
//extends from rectangle
public class Square extends Rectangle {

//    all sides of a square are the same

    public Square(double side) {
        super(side,side);
    }


    @Override
    public double getArea(){
        return 4 * super.length;
    }

    @Override
    public double getPerimeter(){
        return super.length * super.width;
    }
//    or Math.pow(super.length,2);
}
//super and @override are hinting that you are overriding from the parent class