![alt text](https://github.com/agrikatheprogrammer/CS146/blob/main/EC/TopologicalSort/IMG_20240411_200413.jpg)

# Kahn's Algorithm:

Kahn's algorithm is a method for topological sorting. It works by iteratively removing nodes that have no incoming edges (in-degree of 0) from the graph.
It starts by initializing a queue with all nodes having in-degree 0. Then, it iteratively dequeues a node, adds it to the result, and decreases the in-degree of its adjacent nodes.
If, during this process, a node's in-degree becomes 0, it gets added to the queue. This process continues until the queue is empty.
Depth-First Search (DFS):

DFS is a graph traversal algorithm that explores as far as possible along each branch before backtracking. It can be modified to find a topological ordering of a directed acyclic graph (DAG). By doing DFS on indegree=0 nodes, preorder traversals of paths can be joined to form topological sorted output.
Now, let's analyze the given graph and see how both algorithms work on it.
                         
# Kahn's Algorithm Output:

Kahn's algorithm processes nodes with in-degree 0 first. So, it starts with nodes 30, 7, 90.
After that, it processes 8, 10, 50, 6, 9, 14, 12, 13, and finally 11.
The resulting order is: [30, 7, 90, 8, 10, 50, 6, 9, 14, 12, 13, 11]

# DFS Output:
The resulting order is:  [90, 7, 8, 9, 6, 50, 30, 10, 11, 13, 12, 14]. 30 (0 indegree node) is explored til end of path (10 -> 11 -> 13 -> 12 -> 14) and pushed nodes on stack in order 14, 12, 13, 11, 10, 30. Then, 7 (0 indegree node) is explored til end of path (8 -> 6 -> 9 -> 50) and pushed nodes on stack in order 50, 6, 9, 8, 7. Finally, last node 90 with 0 indegree is explored (having 10 as a neighbor but it has already been explored) and pushed (90).

## Conclusion
Both algorithms produce different topological ordering because they traverse the graph differently. Kahn's algorithm uses a queue and is more iterative, while DFS is recursive and uses a stack.
