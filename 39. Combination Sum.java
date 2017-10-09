class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        combinationSumHelper(candidates, results, new ArrayList<Integer>(), target, 0);
        return results;
    }
    
    public void combinationSumHelper(int[] candidates, List<List<Integer>> results, List<Integer> temp, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) {
            results.add(new ArrayList<Integer>(temp));
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                combinationSumHelper(candidates, results, temp, remain - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
        
    }
}