package shapes;

public class Circle {
    private double radius;

    public static void main(String[] args) {
        Circle circ = new Circle(5);
        System.out.println(circ.getArea());
        System.out.println(circ.getCircumference());
    }

    public Circle(double radius) {

    }
    public double getArea() {
//        area = pi x (radius ^ 2)
        return Math.PI * (radius * radius);


    }
    public double getCircumference() {

//        circumference = 2 x pi x radius
       return 2 * Math.PI * radius;
    }
}
