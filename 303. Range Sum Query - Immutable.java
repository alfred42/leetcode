class NumArray {

    private int[] array;

    public NumArray(int[] nums) {
        int current = 0;

        array = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            array[i + 1] = current;
        }
    }
    
    public int sumRange(int left, int right) {
        return array[right + 1] - array[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */