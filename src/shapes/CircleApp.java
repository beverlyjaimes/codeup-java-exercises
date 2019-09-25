package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter the radius: "));
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle = " + circle.getCircumference());

    }
}
