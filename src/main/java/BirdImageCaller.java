import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class BirdImageCaller {
    private static String apiKey = "362517c2fc1c2f72b8fc4c646b443761";

    //public static String getImgUrl(String tags) throws IOException {
    public static String getImgUrl() throws IOException {

        boolean running = true;
        String tags = null;
        while(running) {
            tags = new BirdTagMaker().getBirdNames();
            String URI = "https://www.flickr.com/services/feeds/photos_public.gne?tags=" + tags + "&tagmode=All&media=photos&format=json&nojsoncallback=1";
            URI = URI.replace(" ", "%20");

            try {

                URL url = new URL(URI);

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("apikey", apiKey);
                conn.connect();

                //Getting the response code
                int responsecode = conn.getResponseCode();

                if (responsecode != 200) {
                    throw new RuntimeException("HttpResponseCode: " + responsecode);
                } else {

                    StringBuilder inline = new StringBuilder();
                    Scanner scanner = new Scanner(url.openStream());

                    //Write all the JSON data into a string using a scanner
                    while (scanner.hasNext()) {
                        inline.append(scanner.nextLine());
                    }

                    //Close the scanner
                    scanner.close();

                    JSONParser parse = new JSONParser();
                    JSONObject data_obj = (JSONObject) parse.parse(inline.toString());
                    JSONArray itemsObj = (JSONArray) data_obj.get("items");
                    if(itemsObj.size() > 1){
                        JSONObject newObj = (JSONObject) itemsObj.get(1);
                        JSONObject newObj2 = (JSONObject) newObj.get("media");
                        //System.out.println(newObj.get("m"));
                        running = false;
                        return (String) newObj2.get("m");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return tags;
    }

    public static String getImgUrl(String tags) throws IOException {

        boolean running = true;
        while(running) {
            String URI = "https://www.flickr.com/services/feeds/photos_public.gne?tags=" + tags + "&tagmode=All&format=json&nojsoncallback=1";
            URI = URI.replace(" ", "%20");
            System.out.println(URI);

            try {

                URL url = new URL(URI);

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("apikey", apiKey);
                conn.connect();

                //Getting the response code
                int responsecode = conn.getResponseCode();

                if (responsecode != 200) {
                    throw new RuntimeException("HttpResponseCode: " + responsecode);
                } else {

                    StringBuilder inline = new StringBuilder();
                    Scanner scanner = new Scanner(url.openStream());

                    //Write all the JSON data into a string using a scanner
                    while (scanner.hasNext()) {
                        inline.append(scanner.nextLine());
                    }

                    //Close the scanner
                    scanner.close();

                    JSONParser parse = new JSONParser();
                    JSONObject data_obj = (JSONObject) parse.parse(inline.toString());
                    JSONArray itemsObj = (JSONArray) data_obj.get("items");
                    System.out.println(itemsObj.isEmpty());
                    if(!itemsObj.isEmpty()){
                        JSONObject newObj2 = null;
                        if (itemsObj.size() > 1){
                            int n = (int) Math.floor(Math.random() * itemsObj.size());
                            JSONObject newObj = (JSONObject) itemsObj.get(n);
                            newObj2 = (JSONObject) newObj.get("media");
                        } else {
                            JSONObject newObj = (JSONObject) itemsObj.get(0);
                            newObj2 = (JSONObject) newObj.get("media");
                        }
                        running = false;
                        return (String) newObj2.get("m");
                    } else {
                        return null;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return tags;
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


    // NEATEN UP
//    private static String getBirdNames() {
//
//        String tags = "";
//        // parse csv for bird names
//        BufferedReader lineCountBr = null;
//        try {
//            lineCountBr = new BufferedReader(new FileReader("C:/Users/esmee/Desktop/ebd_US-AL-101_202204_202204_relApr-2022_SAMPLE/BIRDNAMES.csv"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        int linesTotal = 0;
//        while (true) {
//            try {
//                if (lineCountBr.readLine() == null) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            linesTotal++;
//        }
//        try {
//            lineCountBr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("C:/Users/esmee/Desktop/ebd_US-AL-101_202204_202204_relApr-2022_SAMPLE/BIRDNAMES.csv"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        Random rand = new Random();
//        int lineNum = rand.nextInt(linesTotal);
//
//        for (int i = 0; i <= lineNum; i++) {
//            if (i == lineNum) {
//                try {
//                    tags = br.readLine();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                try {
//                    br.readLine();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        return tags;
//    }
}

