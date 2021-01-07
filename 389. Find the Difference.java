class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[256];

        char[] arrayT = t.toCharArray();
        char[] arrayS = s.toCharArray(); 

        for (int i = 0; i < arrayS.length; i++) {
            count[(int) arrayT[i]]++;
            count[(int) arrayS[i]]--;
        }

        count[(int) arrayT[arrayT.length - 1]]++;

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return (char) i;
        }

        return '-';

    }
}