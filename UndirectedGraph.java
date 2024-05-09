import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UndirectedGraph {
    Graph g;
    Map<String, Integer> invertedIndex;
    Map<Integer, String> lookup;

    /**
     *  First token is the movie name.  The subsequent tokens are actor names
     * @param inputFile
     * @param delimiter
     */
    public UndirectedGraph(String inputFile, String delimiter) {
        invertedIndex = new HashMap<>();
        lookup = new HashMap<>();
        final Path path = Paths.get(inputFile);
        List<String> text = new ArrayList<>();
        try (final Scanner scanner = new Scanner(path.toFile())) {
            // Your code is here
            

        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found:" + path.toAbsolutePath().toFile());
        }
    }

    public Iterable<String> adj(String v) {
        //Your code is here
    }
}
