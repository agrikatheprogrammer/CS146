import java.util.*;

public class Graph {
    public int[][] adjacencyListToMatrix(List<List<Integer>> adjacencyList) {
        int n = adjacencyList.size();
        int[][] matrix = new int[n][n];
        
        for (int v = 0; v < n; v++) {
            for (int u : adjacencyList.get(v)) {
                matrix[v][u] = 1;
            }
        }
        
        return matrix;
    }

    public List<List<Integer>> adjacencyMatrixToList(int[][] matrix) {
        int n = matrix.length;
        List<List<Integer>> adjacencyList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    neighbors.add(j);
                }
            }
            adjacencyList.add(neighbors);
        }
        
        return adjacencyList;
    }

    public List<List<Integer>> reverseDirectedGraph(List<List<Integer>> graph) {
        int n = graph.size();
        List<List<Integer>> reversedGraph = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            reversedGraph.add(new ArrayList<>());
        }
        
        for (int v = 0; v < n; v++) {
            for (int u : graph.get(v)) {
                reversedGraph.get(u).add(v);
            }
        }
        
        return reversedGraph;
    }
}

