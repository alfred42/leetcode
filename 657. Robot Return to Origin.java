class Solution {
    public boolean judgeCircle(String moves) {
        if (moves == null) return false;

        int h = 0;
        int v = 0;

        for (char s : moves.toCharArray()) {
            switch (s) {
                case 'U':
                    v--;
                    break;
                case 'D':
                    v++;
                    break;
                case 'L':
                    h--;
                    break;
                case 'R':
                    h++;
                    break;
            }
        }

        return h == 0 && v == 0;

    }
}