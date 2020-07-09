class Solution {
    public List<String> commonChars(String[] A) {
        int[] buckets = new int[26];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = Integer.MAX_VALUE;
        }        

        for (String a : A) {
            int[] hitBuckets = new int[26];

            for (char c : a.toCharArray()) {
                hitBuckets[c - 'a']++;
            }

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = Math.min(buckets[i], hitBuckets[i]);
            }
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < buckets.length; i++) {
            while (buckets[i] > 0) {
                list.add(String.valueOf((char)('a' + i)));
                buckets[i]--;
            }
        }

        return list;
    }
}