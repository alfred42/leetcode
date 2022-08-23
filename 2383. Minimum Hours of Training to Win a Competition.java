class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int answer = Arrays.stream(energy).sum() + 1 - initialEnergy;
        
        if (answer < 0) answer = 0;
        
        for (int e : experience) {
            if (initialExperience <= e) {
                answer +=  e + 1 - initialExperience;
                initialExperience = e + 1;
            } 
            initialExperience += e;
        }
        
        return answer;
    }
}