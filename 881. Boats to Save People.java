class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;

        int leftIndex = 0;
        int rightIndex = people.length - 1;

        while (leftIndex <= rightIndex) {
            answer++;

            if (people[leftIndex] + people[rightIndex] <= limit) {
                leftIndex++;
            }
            rightIndex--;
        }

        return answer;

    }
}