class Solution {
    public int countTime(String time) {
        int answer = 1;

        if (time.charAt(4) == '?') answer *= 10;

        if (time.charAt(3) == '?') answer *= 6;

        if (time.charAt(0) == '?') {
            if (time.charAt(1) == '?') {
                answer *= 24;
            } else {
                answer *= time.charAt(1) >= '4'? 2 : 3;
            }
        } else if (time.charAt(1) == '?') {
            if (time.charAt(0) == '0' || time.charAt(0) == '1') {
                answer *= 10;
            } else {
                answer *= 4;
            }
        }

        return answer;
    }
}