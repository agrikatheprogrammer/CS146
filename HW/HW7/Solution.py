import heapq

class Solution:
    def minMeetingRooms(self, intervals):
        if not intervals:
            return 0
        
        # Sort the intervals based on start time
        intervals.sort(key=lambda x: x[0])
        
        # Use a priority queue (min heap) to store the end times of currently running jobs
        min_heap = []
        heapq.heappush(min_heap, intervals[0][1])
        
        for i in range(1, len(intervals)):
            current_start_time = intervals[i][0]
            earliest_end_time = min_heap[0]
            
            # If the current job starts after the earliest end time of running jobs, 
            # assign a server by removing the earliest end time from the queue
            if current_start_time >= earliest_end_time:
                heapq.heappop(min_heap)
            
            # Assign a server for the current job by adding its end time to the queue
            heapq.heappush(min_heap, intervals[i][1])
        
        # The size of the priority queue represents the minimum number of servers required
        return len(min_heap)

# Example usage
intervals = [[0, 30], [5, 10], [15, 20]]
solution = Solution()
min_servers = solution.minMeetingRooms(intervals)
print("Minimum number of servers required:", min_servers)  # Output: 2
