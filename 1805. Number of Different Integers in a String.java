import java.math.BigInteger;

class Solution {
    public int numDifferentIntegers(String word) {
        char[] array = word.toCharArray();

        Set<BigInteger> set = new HashSet<>();

        for (char i = 0; i < array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                StringBuilder sb = new StringBuilder();
                
                while (i < array.length && array[i] >= '0' && array[i] <= '9') {
                    sb.append(array[i]);
                    i++;
                }

                set.add(new BigInteger(sb.toString()));
            }
        }

        return set.size();
    }
}