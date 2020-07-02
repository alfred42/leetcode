class Solution {
    public String reformat(String s) {
        int alphaCount = 0;
        int numberCount = 0;

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c >= '0' && c <= '9') numberCount++;
            else alphaCount++;
        }

        if (Math.abs(alphaCount - numberCount) > 1) return "";

        int alphaIndex = 0;
        int numberIndex = 0;

        if (alphaCount > numberCount) numberIndex = 1;
        else alphaIndex = 1;

        for (char c : s.toCharArray()) {
            if (c >= '0' &&  c <= '9') {
                arr[numberIndex] = c;
                numberIndex += 2;
            } else {
                arr[alphaIndex] = c;
                alphaIndex += 2;
            }
        }

        return new String(arr);

    }
}