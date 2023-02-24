import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {
        //int n = 20; // The line number
        String filename = "C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/ebird.csv";

        long n = 0;

        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            n = lines.count();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(n);
        String line;
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            //int n = (int) lines.count();
            line = lines.skip((int) (Math.random() * n + 1)).findFirst().get();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
