class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[] {};
        if (k == 1) return nums;

        int leftIndex = 0;
        int rightIndex = 0;
        
        int[] result = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        while (rightIndex < nums.length) {
            if (rightIndex - leftIndex < k)  {
                offer(deque, nums, rightIndex);
                rightIndex++;
            } else {
                result[leftIndex] = nums[deque.getFirst()];

                if (leftIndex == deque.getFirst()) {
                    deque.removeFirst();
                }
                
                leftIndex++;
            }
        }

        result[leftIndex] = nums[deque.getFirst()];
        return result;
    }

    public void offer(Deque<Integer> deque, int[] nums, int index) {
        while (!deque.isEmpty() && nums[deque.getLast()] < nums[index]) {
            deque.removeLast();
        }

        deque.addLast(index);
    }
}