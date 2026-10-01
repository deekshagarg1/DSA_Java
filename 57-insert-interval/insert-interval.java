class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        //adding intervals that come before the new interval

        while(i<n && intervals[i][1] < newInterval[0]){//agar end chota ho and start bada ho to do nothing (no ovelapping)
            result.add(intervals[i]);
            i++;
        }

        //adding new interval
        while(i < n && intervals[i][0] <= newInterval[1]){ //new interval k end bada ho array k start se overlapping

            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

            i++;
        }

        //adding new interval 
          result.add(newInterval);

        //adding remainiing intervals
        while(i < n){
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}