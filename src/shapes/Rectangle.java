package shapes;

public class Rectangle {
//    protected properties
//    shared with its own class and classes that inherit fromdouble
    protected double length;
    protected double width;

//    constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    methods
    public double getArea(){
        return this.length * this.width;
}

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
}

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
