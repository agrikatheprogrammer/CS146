
# Problem Statement:

There are n houses in a village. We want to supply water for all the houses by building wells and laying pipes.

For each house i, we can either build a well inside it directly with cost wells[i - 1] (note the -1 due to 0-indexing), or pipe in water from another well to it. The costs to lay pipes between houses are given by the array pipes where each pipes[j] = [house1j, house2j, costj] represents the cost to connect house1j and house2j together using a pipe. Connections are bidirectional, and there could be multiple valid connections between the same two houses with different costs.

Return the minimum total cost to supply water to all houses.

# Approach:

The given problem can be solved using the Minimum Spanning Tree (MST) approach, specifically Kruskal's algorithm. We treat each house and each pipe as edges of a graph, where the cost of building a well in a house is considered as the cost of connecting the house to a virtual node.

* Create a copy of the pipes array, adding space for n additional edges to represent building wells in each house.
* Sort the edges based on their costs.
* Initialize a disjoint set data structure to keep track of the parent of each node (house).
* Iterate through each edge in sorted order and perform union-find operations to build the MST.
* Keep track of the total cost while adding edges until all houses are connected.
* Return the total cost.
  
