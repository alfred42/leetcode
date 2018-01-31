class Solution {
    public int nthUglyNumber(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
    
        for (int i = 1; i < n; i++) {
            int temp = Math.min(Math.min(answer[index2] * 2, answer[index3] * 3), answer[index5] * 5);
            
            if (temp == answer[index2] * 2) {
                index2++;
            } if (temp == answer[index3] * 3) {
                index3++;
            } if (temp == answer[index5] * 5) {
                index5++;
            }
            
            answer[i] = temp;
            
        }
        
        System.out.println(Arrays.toString(answer));
        return answer[n - 1];
    }
}