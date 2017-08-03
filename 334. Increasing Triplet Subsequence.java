public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smaller = Integer.MAX_VALUE;
        int bigger = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= smaller) smaller = num;
            else if (num <= bigger) bigger = num;
            else return true;
        }
        
        return false;
    }
}