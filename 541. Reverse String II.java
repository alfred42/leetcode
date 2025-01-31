class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i = i + 2 * k) {
            reverse(charArray, i, Math.min(i + k, charArray.length) - 1);
        }

        return new String(charArray);
    }

    public void reverse(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}