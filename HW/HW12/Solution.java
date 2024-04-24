class Solution {
    private int[] parents;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int[][] possibleEdges = Arrays.copyOf(pipes, pipes.length + n); //make copy of pipes with extra space for n houses
        for (int i = 0; i < n; i++) { //for each house from 1 to n,
            possibleEdges[pipes.length + i] = new int[] {0, i + 1, wells[i]}; 
        // create pipes from virtual node/house
        // representing building a well in that house}
        Arrays.sort(possibleEdges, (a, b) -> a[2] - b[2]); //sort the pipe edges depending on cost
        parents = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parents[i] = i; //each node is its own parent i.e "owns itself"
        }
        int result = 0;
          // cheapest house for well building would be chosen and added to disjoint set of parents
        for (var x : possibleEdges) { //for each edge,
            int start = x[0], destination = x[1], cost = x[2]; //find starting house and destination house as well as cost to 
          // create a water connection
            int startp = find(start), destp = find(destination); //find their parents, which group they belong to
            if (startp != destp) { // if they do not belong to the same group
                parents[startp] = destp; //merge them and make starting house's parent the destination house
              // destination house now "owns" starting house as a part of its group
                result += cost; //add cost after merging them and accepting edge to create a MST via Kruskal's
                if (--n == 0) { //decrement the house that was added/connected and if no more houses to add, return the result
                    return result;
                }
            }
        }
        return result; //returns 0 if no possibleEdges
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]); //recursively finds the parent or group to which x house belongs
        }
        return p[x]; //if p[x] is x itself, it just returns x, does not belong to a group yet
    }
}
