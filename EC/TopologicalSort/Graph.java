import java.util.*;

class Graph {

    HashMap<Node,List<Node>> graph;

    int size=50;
    public Graph() {
        graph=new HashMap<>(size);
    }
    public void addEdge(Node a, Node b) {

        // Add node b to the adjacency list of node a if it's not already present
            if (graph.get(a)!=null)
            graph.get(a).add(b);


    }

    public void addVertex(Node a) {
        graph.put(a, new LinkedList<>());

    }

    public void removeEdge(Node a, Node b) {
        if (graph.get(a)!=null && graph.get(a).contains(b))
         {
            List<Node> updatedadjA=graph.get(a);
            updatedadjA.remove(b);
            graph.put(a,updatedadjA);}
        }

    public void removeVertex(Node a) {
        // Remove vertex 'a' from the graph
        graph.remove(a);

        // Remove any edges pointing to 'a' from other vertices
        for (List<Node> adjList : graph.values()) {
            adjList.removeIf(node -> node.equals(a));
        }
    }

    public void printGraph(Graph graph1) {
        for (Map.Entry<Node, List<Node>> entry : graph1.graph.entrySet()) {
            Node currentNode = entry.getKey();
            List<Node> adjacentNodes = entry.getValue();

            System.out.print(currentNode.num + ": ");
            for (Node adjacentNode : adjacentNodes) {
                System.out.print(adjacentNode.num + " ");
            }
            System.out.println();
        }
    }

    public Set<Node> getVertices() {
        return graph.keySet();
    }

    public List<Node> getNeighbors(Node vertex) {
        return graph.getOrDefault(vertex, Collections.emptyList());
    }

    }
