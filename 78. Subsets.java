public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        backtrace(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    public void backtrace(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<Integer>(temp));
        
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrace(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}