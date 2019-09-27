package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

//    protected is shared with this and subclasses

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

//    abstract methods are methods with no body
//Abstract classes can define abstract methods, which are methods with no body, they only provide information about the method name, return type, and parameters.
     abstract void setLength(double length);

     abstract void setWidth(double width);


}
