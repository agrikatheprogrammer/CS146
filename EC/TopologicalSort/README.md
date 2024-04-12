

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
The resulting order is: [30, 10, 14, 12, 13, 11, 7, 8, 50, 6, 9, 90].

## Conclusion
Both algorithms produce the same topological ordering, but they traverse the graph differently. Kahn's algorithm uses a queue and is more iterative, while DFS is recursive and uses a stack.
