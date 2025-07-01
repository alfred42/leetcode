class Solution {
    public int possibleStringCount(String word) {
        int result = 0;

        char[] array = word.toCharArray();

        int i = 1;
        int currentLength = 1;

        while (i < array.length) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            } else {
                result = result + currentLength - 1;
                currentLength = 1;
            }

            i++;
        }

        result = result + currentLength;
        
        return result;
    }
}