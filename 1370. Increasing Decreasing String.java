class Solution {
    public String sortString(String s) {
        int count = 0;
        int[] arr = new int[256];

        for (char c : s.toCharArray()) {
            count++;
            arr[c]++;
        }

        int index = 0;
        boolean reverse = false;

        StringBuilder sb = new StringBuilder();

        while (count > 0) {
            if (index >= 0 && index < 256 && arr[index] != 0) {
                arr[index]--;
                sb.append((char) index);
                count--;
            }

            if (index < 0) {
                reverse = false;
                index = 0;
            } else if (index == 256) {
                reverse = true;
                index = 255;
            } else {
                index = reverse ? index - 1 : index + 1;
            }
        }

        return sb.toString();
    }
}