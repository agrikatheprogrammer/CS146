# Server Allocation Problem
## Overview
As a sysadmin for a tech company, you need to estimate the number of servers required to handle a set of long-running jobs. Each server can handle only one job at a time, and each job can only be executed by one server at a time. Given the start and end times of the jobs, you need to determine the minimum number of servers needed to run all jobs efficiently.

## Approach: Priority Queue
* Sort Intervals: Start by sorting the intervals based on their start times. This allows us to process the jobs in chronological order.
* Priority Queue: Use a priority queue (min heap) to keep track of the end times of currently running jobs. We'll prioritize the servers that finish their jobs earliest.
* Assign Servers: Iterate through the sorted intervals. For each interval:

  Check if the current job can be assigned to an existing server by comparing its start time with the earliest end time of running jobs.
  
  If the job starts after the earliest end time, remove the earliest end time from the queue (indicating that a server is available).
* Assign a server for the current job by adding its end time to the queue.
* Minimum Servers: The size of the priority queue at the end represents the minimum number of servers required to handle all jobs simultaneously.

## Complexity Analysis
* Time Complexity: Sorting the intervals takes O(n log n) time, where n is the number of intervals. The priority queue operations take O(log n) time for each interval. Overall, the time complexity is O(n log n).
* Space Complexity: The space complexity is O(n) for the priority queue.
