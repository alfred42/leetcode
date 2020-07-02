class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

        int index = 0;

        for (int i = 0; index < target.length; i++) {
            if (i + 1 == target[index]) {
                result.add("Push");
                index++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }

        return result;
    }
}