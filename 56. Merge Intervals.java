/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            if (a.start - b.start != 0) return a.start - b.start;
            return a.end - b.end;
        }
    }
    
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> merged = new LinkedList<Interval>();
        
        Collections.sort(intervals, new IntervalComparator());
        
        for (Interval interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).end < interval.start) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1).end = Math.max(interval.end, merged.get(merged.size() - 1).end);
            }
        } 
        
        return merged;
    }
    
}