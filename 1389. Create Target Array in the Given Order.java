class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        if (nums == null || index == null || nums.length != index.length) return null;

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            resultList.add(index[i], nums[i]);
        }
        
        return resultList.stream().mapToInt(i->i).toArray();
    }
}