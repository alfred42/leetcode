class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        combinationSumHelper(result, new ArrayList<>(), 0, target, candidates);
        
        return result;
    }
    
    public void combinationSumHelper(List<List<Integer>> result, List<Integer> temp, int startIndex, int remain, int[] candidates) {
        if (remain < 0) return;
        else if (remain == 0) {
            result.add(new ArrayList<Integer>(temp));
        } else {
             for (int i = startIndex; i < candidates.length; i++) {
                 if (i > startIndex && candidates[i] == candidates[i - 1]) continue;
                temp.add(candidates[i]);
                combinationSumHelper(result, temp, i + 1, remain - candidates[i], candidates);
                temp.remove(temp.size() - 1);
            }
        }
    }
}