class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;

        int leftIndex = 0;
        int rightIndex = people.length - 1;

        while (leftIndex <= rightIndex) {
            if (leftIndex == rightIndex) {
                leftIndex++;
                answer++;
            } else if (people[leftIndex] + people[rightIndex] <= limit) {
                leftIndex++;
                rightIndex--;
                answer++;
            } else {
                rightIndex--;
                answer++;
            }
        }

        return answer;

    }
}