import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
    int V;
    List<Integer>[] adjacent;

    public Graph(int v) {
        this.V = v;
        adjacent = new ArrayList[v];
        for (int x = 0; x < v; x++ ) {
            adjacent[x] = new ArrayList<>();
        }
    }

    public Graph(String input) {
        final Path path = Paths.get(input);
        try (final Scanner scanner = new Scanner(path.toFile())) {
            this.V = Integer.parseInt(scanner.nextLine());
            adjacent = new ArrayList[this.V];

            for (int x = 0; x < this.V; x++ ) {
                adjacent[x] = new ArrayList();
            }

            final int edges = Integer.parseInt(scanner.nextLine());
            for (int x = 0; x < edges; x++) {
                String str = scanner.nextLine();
                String[] tokens = str.split(" ");
                addEdge(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found:" + path.toAbsolutePath().toFile());
        }

    }

    public void addEdge(int v, int w) {
        adjacent[v].add(w);
        adjacent[w].add(v);
    }

    public Iterable<Integer> adj(int v) { return adjacent[v]; }
}
