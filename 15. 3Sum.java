class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    if (nums[left] + nums[right] == -nums[i]) {
                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);

                        result.add(temp);

                        while(left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        left++;

                        while(right > left && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        right--;
                    } else if (nums[left] + nums[right] < -nums[i]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            
        }
    
        return result;    
    }
}