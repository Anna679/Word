import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class word {

    public static void main(String[] args)  {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("C:\\test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        TreeMap<String, Integer> statistics = new TreeMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
           // TreeMap.max(TreeMap);(делать через comparable как?
        }
        System.out.println(statistics);
    }
}
