class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Comparator<int[]> comparator = new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        };

        Arrays.sort(slots1, comparator);
        Arrays.sort(slots2, comparator);


        int index1 = 0;
        int index2 = 0;

        while (index1 < slots1.length && index2 < slots2.length) {
            if (slots1[index1][0] < slots2[index2][0]) {
                if (slots1[index1][1] - slots2[index1][0] < duration) {
                    index1++;
                    continue;
                } else {
                    if (slots2[index2][1] - slots2[index2][0] >= duration && slots2[index2][0] + duration <= slots1[index1][1]) {
                        return Arrays.asList(slots2[index2][0], slots2[index2][0] + duration);
                    } else {
                        index1++;
                    }
                }
            } else {
                if (slots2[index2][1] - slots2[index2][0] < duration) {
                    index2++;
                    continue;
                } else {
                    if (slots1[index1][1] - slots1[index1][0] >= duration && slots1[index1][0] + duration <= slots2[index2][1]) {
                        return Arrays.asList(slots1[index1][0], slots1[index1][0] + duration);
                    } else {
                        index2++;
                    }
                }
            }
        }

        return new ArrayList<Integer>();
    }
}