![alt text](https://github.com/agrikatheprogrammer/CS146/blob/main/EC/TopologicalSort/IMG_20240411_200413.jpg)

# Kahn's Algorithm:

Kahn's algorithm is a method for topological sorting. It works by iteratively removing nodes that have no incoming edges (in-degree of 0) from the graph.
It starts by initializing a queue with all nodes having in-degree 0. Then, it iteratively dequeues a node, adds it to the result, and decreases the in-degree of its adjacent nodes.
If, during this process, a node's in-degree becomes 0, it gets added to the queue. This process continues until the queue is empty.
Depth-First Search (DFS):

DFS is a graph traversal algorithm that explores as far as possible along each branch before backtracking. It can be modified to find a topological ordering of a directed acyclic graph (DAG).
In topological sorting using DFS, we recursively visit each node's neighbors, pushing them onto a stack after visiting all their adjacent nodes.
Once all neighbors are visited, we pop the node from the stack. The order of popping the nodes from the stack gives us the topological ordering.
Now, let's analyze the given graph and see how both algorithms work on it.
                         
# Kahn's Algorithm Output:

Kahn's algorithm processes nodes with in-degree 0 first. So, it starts with nodes 30, 7, 90.
After that, it processes 8, 10, 50, 6, 9, 14, 12, 13, and finally 11.
The resulting order is: [30, 7, 90, 8, 10, 50, 6, 9, 14, 12, 13, 11]

# DFS Output:
The resulting order is: [30, 10, 14, 12, 13, 11, 7, 8, 50, 6, 9, 90]. In-degree of nodes with 0 are processed first here (although a descending order from higher in-degree nodes would have worked), pushed to stack as they are visited (forming a path that backtracks recursively once it reaches a node with no more outdegree). So, 30 is explored first (first node in vertices list to have indegree==0), its outdegree nodes are visited and added i.e. 10 which then goes on to add its outdegree nodes (14, 12, 13, 11 which are added). Next vertex with indegree 0 is explored (7), its outdegree nodes (8, 50) are added, 8's (unvisited) nodes are added (6, 9). Finally, last vertex w indegree==0 (90) is explored and added using dfs, forming topological search completion. Elements are reversed ultimately for the right order in list.

## Conclusion
Both algorithms produce the same topological ordering, but they traverse the graph differently. Kahn's algorithm uses a queue and is more iterative, while DFS is recursive and uses a stack.
