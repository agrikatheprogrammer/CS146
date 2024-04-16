from collections import deque

def canFinish(numCourses, prerequisites):
    # Create adjacency list for each course
    adj = [[] for _ in range(numCourses)]
    # Indegree for each respective course numbered 0..numCourses-1
    indegree = [0] * numCourses
    # Topological sort result using Kahn's algorithm
    result = []

    # Construct adjacency list and calculate indegrees
    for course, prerequisite in prerequisites:
        adj[prerequisite].append(course)
        indegree[course] += 1

    # Initialize queue with courses having no prerequisites
    queue = deque()
    for i in range(numCourses):
        if indegree[i] == 0:
            queue.append(i)

    # Perform topological sort
    while queue:
        current = queue.popleft()
        result.append(current)
        for next_course in adj[current]:
            indegree[next_course] -= 1
            if indegree[next_course] == 0:
                queue.append(next_course)

    # If all courses are visited, return True, else False
    return len(result) == numCourses

