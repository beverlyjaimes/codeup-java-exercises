package shapes;

public class Rectangle {
//    protected properties
    protected int length;
    protected int width;

//    constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

//    methods
public int getArea(){
        return length * width;
}

public int getPerimeter(){
        return 2 * length + 2 * width;
}

}
