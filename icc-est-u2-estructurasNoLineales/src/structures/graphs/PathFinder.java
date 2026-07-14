package structures.graphs;

public interface PathFinder<T> {

    PathResult<T> findPath(Graph<T> graph, T start, T end);

}