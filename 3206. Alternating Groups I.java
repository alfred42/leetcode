class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        if (colors.length < 3) return 0;

        int count = 0;

        for (int i = 1; i < colors.length - 1; i++) {
            if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) count++;
        }

        
        if (colors[0] != colors[1] && colors[0] != colors[colors.length - 1]) count++;
        if (colors[colors.length - 1] != colors[0] && colors[colors.length - 1] != colors[colors.length - 2]) count++;

        return count;
    }
}