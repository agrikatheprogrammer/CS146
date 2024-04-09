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
}

