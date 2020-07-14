class Solution {
    public boolean isUnique(String astr) {
        BitSet bitSet = new BitSet(256);
        int[] bitSet2 = new int[4];

        for (char c : astr.toCharArray()) {
            int intIndex = ((int) c) / 32;
            int offset = ((int) c) % 32;

            if ((bitSet2[intIndex] >> offset & 0x01) == 1) return false;
            bitSet2[intIndex] = bitSet2[intIndex] | 0x01 << offset;
        }

        return true;
    }
}