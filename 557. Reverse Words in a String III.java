class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;

        char[] array = s.toCharArray();

        int index = 0;

        while (index < s.length()) {
            while (index < s.length() && array[index] == ' ') index++;

            int rightIndex = index;

            while (rightIndex + 1 < s.length() && array[rightIndex + 1] != ' ') rightIndex++;

            reverse(array, index, rightIndex);

            index = rightIndex + 1;
        }

        return new String(array);

    }

    public void reverse(char[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

    }
}