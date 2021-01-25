class Solution {
    public String maximumTime(String time) {
        char[] timeArray = time.toCharArray();

        if (timeArray[0] == '?' && timeArray[1] == '?') {
            timeArray[0] = '2';
            timeArray[1] = '3';
        } else if (timeArray[0] == '?') {
            if (timeArray[1] >= '0' && timeArray[1] <= '3') {
                timeArray[0] = '2';
            } else {
                timeArray[0] = '1';
            }
        } else if (timeArray[1] == '?') {
            timeArray[1] = timeArray[0] == '2' ? '3' : '9';
        }

        if (timeArray[3] == '?' && timeArray[4] == '?') {
            timeArray[3] = '5';
            timeArray[4] = '9';
        } else if (timeArray[3] == '?') {
            timeArray[3] = '5';
        } else if (timeArray[4] == '?') {
            timeArray[4] = '9';
        }

        return new String(timeArray);
    }
}