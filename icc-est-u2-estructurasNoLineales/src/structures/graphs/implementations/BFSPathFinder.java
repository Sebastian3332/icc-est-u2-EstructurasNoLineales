package structures.graphs.implementations;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import structures.graphs.Graph;
import structures.graphs.PathFinder;
import structures.graphs.PathResult;
import structures.node.Node;

public class BFSPathFinder<T> implements PathFinder<T> {
    @Override
    public PathResult<T> findPath(Graph<T> graph,T start,T end) {
        Queue<T> queue = new LinkedList<>();
        Set<T> visited = new LinkedHashSet<>();
        Map<Node<T>, Node<T>> parent = new LinkedHashMap<>();
        Set<T> visited1 = new LinkedHashSet<>();
        queue.add(start);
        visited.add(start);
        parent.put(new Node<>(start), null);
        while (!queue.isEmpty()) {
            T current = queue.poll();
            visited1.add(current);
            if (current.equals(end)) {
                return new PathResult<>(visited1, buildPath(parent, end));
            }
            //for(int i = 0; i <size; i = i + 1>)
            for(Node<T> vecino : graph.getVecinos(current)){
                if (!visited.contains(vecino.getValue())) {
                    visited.add(vecino.getValue());
                    parent.put(vecino, new Node<>(current));
                    queue.add(vecino.getValue());
                }
            }

        }
        return new PathResult<>(visited1, new HashSet<>());
    }
    private Set<T> buildPath(Map<Node<T>, Node<T>> parent, T end) {
        Set<T> path = new LinkedHashSet<>();
        Node<T> nEnd = new Node<>(end);
        for (Node<T> at = nEnd; at != null; at = parent.get(at)) {
            path.add(at.getValue());
        }
        return path;

}
}