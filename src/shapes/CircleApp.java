package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble(1,3));
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle = " + circle.getCircumference());

    }
}
