# Course Schedule

## Problem Statement
You are given a total of numCourses courses labeled from 0 to numCourses - 1. Each course has a prerequisite course(s) that must be completed before taking it. You are provided with an array prerequisites, where prerequisites[i] = [ai, bi] indicates that you must take course bi before taking course ai.

For example, the pair [0, 1] indicates that to take course 0, you must first take course 1.

The task is to determine whether it's possible to finish all courses, i.e., whether it's possible to schedule all courses in such a way that all prerequisites are fulfilled.

## Approach: Topological Sorting (Kahn's Algorithm)
The problem can be approached using topological sorting, particularly Kahn's algorithm. Topological sorting is a linear ordering of vertices in a directed graph where, for every directed edge uv from vertex u to vertex v, vertex u comes before v in the ordering. This ordering is possible if and only if the graph has no directed cycles.

Kahn's algorithm works by iteratively selecting nodes with no incoming edges (in-degree of 0), removing them from the graph, and updating the in-degree of their adjacent nodes. This process continues until all nodes are visited or there are no nodes with in-degree 0 left.

## Algorithm
Create an adjacency list representing the graph where each course is a vertex, and directed edges represent prerequisites.
Initialize an array indegree to keep track of the in-degree of each course.
Initialize an empty queue and add all courses with an in-degree of 0 to the queue.
While the queue is not empty:
Pop a course current from the queue.
Add current to the result list.
For each course next adjacent to current:
Decrement the in-degree of next.
If the in-degree of next becomes 0, add next to the queue.
After traversing all courses, if the size of the result list is equal to the total number of courses (numCourses), return true, indicating it's possible to finish all courses. Otherwise, return false.

## Complexity Analysis
- Time complexity: O(V + E), where V is the number of vertices (courses) and E is the number of edges (prerequisites).
- Space complexity: O(V + E), for storing the adjacency list and in-degree array.
