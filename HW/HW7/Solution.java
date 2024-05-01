import java.util.*;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort the intervals based on start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Use a priority queue to store the end times of currently running jobs
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            int currentStartTime = intervals[i][0];
            int earliestEndTime = minHeap.peek();

            // If the current job starts after the earliest end time of running jobs, 
            // assign a server by removing the earliest end time from the queue
            if (currentStartTime >= earliestEndTime) {
                minHeap.poll();
            }

            // Assign a server for the current job by adding its end time to the queue
            minHeap.offer(intervals[i][1]);
        }

        // The size of the priority queue represents the minimum number of servers required
        return minHeap.size();
    }
}
