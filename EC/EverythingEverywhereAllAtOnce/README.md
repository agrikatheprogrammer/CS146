# 1. Converting Adjacency List to Adjacency Matrix

Explanation:
Converting an adjacency list to an adjacency matrix involves representing the connections between vertices in a graph as a binary matrix. If there is an edge between vertex i and vertex j, the corresponding entry in the adjacency matrix will be 1; otherwise, it will be 0.

Pseudocode:
    function adjacencyListToMatrix(adjacencyList):
    n = length(adjacencyList)
    matrix = createMatrix(n, n, 0)
    for each vertex v in adjacencyList:
        for each neighbor u of v in adjacencyList[v]:
            matrix[v][u] = 1
    return matrix
    
# 2. Converting Adjacency Matrix to Adjacency List
Explanation:
Converting an adjacency matrix to an adjacency list involves representing each vertex and its neighbors in the graph. For each vertex, we iterate over its adjacent vertices in the adjacency matrix and add them to the adjacency list.

Pseudocode:
    function adjacencyMatrixToList(matrix):
    n = number of rows in matrix
    adjacencyList = create empty list
    for i from 0 to n-1:
        neighbors = create empty list
        for j from 0 to n-1:
            if matrix[i][j] == 1:
                neighbors.append(j)
        adjacencyList[i] = neighbors  
    return adjacencyList
    
# 3. Reversing Direction of Edges in Directed Graph
Explanation:
Reversing the direction of edges in a directed graph involves flipping the direction of each edge. For each directed edge (u, v), we add a new edge from v to u in the reversed graph.

Pseudocode:
    function reverseDirectedGraph(graph):
    reversedGraph = create empty graph
    
    for each vertex v in graph:
        for each neighbor u of v in graph[v]:
            add edge (u, v) to reversedGraph

