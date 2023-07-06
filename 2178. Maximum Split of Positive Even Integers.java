class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> answerList = new ArrayList<>();

        if (finalSum % 2 != 0) return answerList;

        for (long i = 2; finalSum != 0;i += 2) {
            if (finalSum >= i) {
                answerList.add(i);
                finalSum -= i;
            } else {
                answerList.set(answerList.size() - 1, answerList.get(answerList.size() - 1) + finalSum);
                finalSum = 0;
            }
        }

        return answerList;
    }
}