package shapes;
//extends from rectangle
public class Square extends Rectangle {

//    all sides of a square are the same

    public Square(int side) {
        super(side,side);
    }

    public int getArea(){
        return 4 * this.length;
    }
    public int getPerimeter(){
        return this.length * this.width;
    }
}
