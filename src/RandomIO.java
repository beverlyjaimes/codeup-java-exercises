import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RandomIO {

    public static List<String> getFiles(String x) {
//
        Path p = Paths.get("src", x);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        making it a List<string> allows for manipulation
        for (String name : lines) {
            System.out.println("Hello, " + name + "!");
        }
        return lines;

    }


    public static void main(String[] args) {
        System.out.println(getFiles("shapes/circles.txt"));
    }
}