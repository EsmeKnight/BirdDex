import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class BirdTagMaker {

    //private static String apiKey = "sd19d8ma255a";

    public BirdTagMaker() {
    }

    public String getBirdNames() {
        String filename = "C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/ebird.csv";

        long n = 0;

        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            n = lines.count();

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(n);
        String tags = null;
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            //int n = (int) lines.count();
            tags = lines.skip((int) (Math.random() * n + 1)).findFirst().get();
            
        } catch (IOException e) {
            System.out.println(e);
        }
        return tags;
    }

}
