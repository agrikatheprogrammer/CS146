import java.util.*;

public class TopologicalSort {
    Graph graph;
    HashMap<Node, Integer> indmap=new HashMap<>();
    public TopologicalSort(Graph g) {
        graph=g;
        helper();
    }

    public List<Integer>  Kahns() {
        Queue<Node> q=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        HashMap<Node, Integer> indegreeCopy = new HashMap<>(indmap);
        for (Node node : graph.graph.keySet()) {
            if (indmap.get(node) == 0) {
                q.add(node);
            }
        }
        while (!q.isEmpty()) {
            Node current=q.poll();
            result.add(current.num);
            for (Node adj:graph.graph.get(current)) {
                int updatedIndegree = indegreeCopy.get(adj) - 1;
                indegreeCopy.put(adj, updatedIndegree);

                // If the updated indegree becomes zero, enqueue the node
                if (updatedIndegree == 0) {
                    q.add(adj);
                }
            }
        }
        // Check for cycles
        if (result.size() != graph.graph.values().size()) {
            throw new IllegalArgumentException("The graph contains a cycle!");
        }

        return result;
    }



    public List<Integer> topologicalSortDFS() {
        Set<Node> visited = new HashSet<>();
        Deque<Node> stack = new ArrayDeque<>();
        // Perform DFS starting from all vertices with in-degree 0
        for (Node vertex : graph.getVertices()) {
            if (indmap.get(vertex) == 0 && !visited.contains(vertex)) {
                dfs(vertex, visited, stack);
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop().num); //first element is at top of list
        }
        return result;
    }

    private void dfs(Node vertex, Set<Node> visited, Deque<Node> stack) {
        visited.add(vertex);

        for (Node neighbor : graph.getNeighbors(vertex)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited, stack);
            }
        }

        stack.push(vertex); // Push vertex to stack after all its neighbors are visited
    }


    public void helper() {
        for (Node node : graph.graph.keySet()) {
            int indegree = 0;
            for (List<Node> adjacencyList : graph.graph.values()) {
                for (Node adjacentNode : adjacencyList) {
                    if (adjacentNode == node) {
                        indegree++;
                    }
                }
            }
            indmap.put(node, indegree);
        }
    }


    public void printIndegreeMap() {
        for (Map.Entry<Node, Integer> entry : indmap.entrySet()) {
            Node node = entry.getKey();
            int indegree = entry.getValue();
            System.out.println("Node: " + node.num + ", Indegree: " + indegree);
        }
    }


    public static void main (String[] args) {
        Graph graph1=new Graph();
        Node node1=new Node(7);
        Node node2=new Node(8);
        Node node3=new Node(50);
        Node node4=new Node(6);
        Node node5=new Node(9);
        Node node6=new Node(10);
        Node node7=new Node(14);
        Node node8=new Node(12);
        Node node9=new Node(13);
        Node node10=new Node(11);
        Node node11=new Node(90);
        Node node12=new Node(30);

        graph1.addVertex(node12);
        graph1.addVertex(node11);
        graph1.addVertex(node1);
        graph1.addVertex(node2);
        graph1.addVertex(node3);
        graph1.addVertex(node4);
        graph1.addVertex(node5);
        graph1.addVertex(node6);
        graph1.addVertex(node7);
        graph1.addVertex(node8);
        graph1.addVertex(node9);
        graph1.addVertex(node10);
        graph1.addEdge(node2,node3);

        graph1.addEdge(node1,node2);
        graph1.addEdge(node1,node3);
        graph1.addEdge(node2,node4);
        graph1.addEdge(node2,node5);
        graph1.addEdge(node1,node6);
        graph1.addEdge(node6,node7);
        graph1.addEdge(node6,node8);
        graph1.addEdge(node6,node9);
        graph1.addEdge(node6,node10);
        graph1.addEdge(node11,node6);
        graph1.addEdge(node12,node6);
        TopologicalSort topo1=new TopologicalSort(graph1);
        System.out.println(topo1.Kahns());
        System.out.println();
        System.out.println(topo1.topologicalSortDFS());
    }


}


