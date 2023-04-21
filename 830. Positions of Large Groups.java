class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> resultList = new ArrayList<>();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (count >= 3) {
                    resultList.add(Arrays.asList(i - count + 1,i));
                } 
                count = 1;
            }
            else {
                count++;
            }
        }

        return resultList;
    }
}