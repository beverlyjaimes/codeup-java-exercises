package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();

        System.out.println(test.getString());
        System.out.println(test.yesNo());
        System.out.println(test.getInt( 5,10));
        System.out.println(test.getInt());
        System.out.println(test.getDouble(2,10));
        System.out.println(test.getDouble());

    }
}
