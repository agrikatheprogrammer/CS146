class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<Integer>[] adj = new List[n]; //adjacency list for each course
        int[] indegree = new int[n]; //indegrees for each respective course numbered 0..n-1 
        List<Integer> result = new ArrayList<>(); //topological sort's result using Kahn's algorithm

        for (int[] edge : prerequisites) { //edge=[a,b]-->b is a prereq for a so 
          // b needs to be taken before a and therefore, add directed edge from b to a
            int course = edge[0]; 
            int prerequisite = edge[1];
            if (adj[prerequisite] == null) { //no adjacency list in array of list for prereq yet
                adj[prerequisite] = new ArrayList<>(); //create one for course to be added to prereq adj list
            }
            adj[prerequisite].add(course);
            indegree[course]++; //increment course indegree, it has one more prereq pointing to it
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) { //add all courses with prereq/indegree==0 
              //they can be taken without prereq!
              //they're first in topological sort
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll(); //get value at front of queue (lowest indegree/prereq first)
            result.add(current); //add the removed course to the topological sort result
            if (adj[current] != null) { // all adjacent/next courses to be taken 
                for (int next : adj[current]) {
                    indegree[next]--; //have one less prereq (course was removed)
                    if (indegree[next] == 0) {
                        queue.offer(next); //if they now no longer have prereqs, they're next in line
                    }
                }
            }
        }

        return result.size() == n //cycle detection
    }
}

