import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstPath {

    boolean[] visited;
    Integer[] edgedTo;
    Integer[] distTo;

    Map<String, String> invertedIndex = new HashMap<>();

    int v;

    public BreadthFirstPath(Graph g, Integer v) {
        this.visited = new boolean[g.V];
        this.edgedTo = new Integer[g.V];
        this.distTo = new Integer[g.V];
        bfs(g, v);
        this.v = v;
    }

    private void bfs(Graph g, Integer s) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        visited[s] = true;
        distTo[s] = 0;
        while (!queue.isEmpty()) {
            Integer current = queue.remove();
            Iterable<Integer> children = g.adj(current);
            for (Integer child : children) {
                if (!visited[child]) {
                    queue.add(child);
                    visited[child] = true;
                    edgedTo[child] = current;
                    distTo[child] = distTo[current] + 1;
                }
            }
        }
    }

    public boolean hasPathTo(int w) { return visited[w]; }

    public Stack<Integer> pathTo(int w) {
        final Stack<Integer> stack = new Stack<>();
        for (int x = w; x != v; x = edgedTo[x]) {
            stack.push(x);
        }
        stack.push(v);
        return stack;
    }

    public int distanceTo(int w) {
        return distTo[w];
    }
}
