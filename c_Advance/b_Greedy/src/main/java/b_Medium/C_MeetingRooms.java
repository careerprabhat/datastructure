package b_Medium;

public class C_MeetingRooms {
    public static void main(String[] args) {
        // Greedy approach: Sort the intervals by start time and check for overlaps
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean canAttendAll = canAttendMeetings(intervals);
        System.out.println("Can attend all meetings: " + canAttendAll);
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort intervals based on start time
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 1; i < intervals.length; i++) {
            // Check if the current meeting overlaps with the previous one
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false; // Overlap found, cannot attend all meetings
            }
        }
        return true; // No overlaps found, can attend all meetings
    }
}
