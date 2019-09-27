package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

//    abstract methods are methods with no body
//Abstract classes can define abstract methods, which are methods with no body, they only provide information about the method name, return type, and parameters.
     abstract void setLength(double length);

     abstract void setWidth(double width);


}
