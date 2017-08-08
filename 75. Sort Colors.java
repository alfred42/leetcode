
public class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        
        for (int num : nums) {
            counts[num]++;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (counts[0] > 0) {
                nums[i] = 0;
                counts[0]--;
            } else if (counts[1] > 0) {
                nums[i] = 1;
                counts[1]--;
            } else {
                nums[i] = 2;
            }
        }
    }
}