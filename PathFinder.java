import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class PathFinder {
    BreadthFirstPath path;
    UndirectedGraph graph;

    String actorName;

    public PathFinder(UndirectedGraph undirectedGraph, String name) {
        //Your code is here
    }

    public boolean hasPathTo(int w) { return path.visited[w]; }

    public List<String> pathTo(String name) {
        //Your code is here
    }

    public int distanceTo(String name) {
        return path.distanceTo(graph.invertedIndex.get(name));
    }
}
