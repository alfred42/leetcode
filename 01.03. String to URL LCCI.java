class Solution {
    public String replaceSpaces(String S, int length) {
        int spaceCount = 0;

        char[] arr = S.substring(0, length).toCharArray();

        for (char c : arr) {
            if (c == ' ') spaceCount++;
        }

        char[] newArr = new char[arr.length + 2 * spaceCount];

        int index = arr.length - 1;
        int newIndex = newArr.length - 1;

        while (index >= 0) {
            char temp = arr[index--];
            if (temp == ' ') {
                newArr[newIndex--] = '0';
                newArr[newIndex--] = '2';
                newArr[newIndex--] = '%';
            } else {
                newArr[newIndex--] = temp;
            }
        }

        return new String(newArr);
    }
}