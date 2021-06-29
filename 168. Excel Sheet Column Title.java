class Solution {
    public String convertToTitle(int columnNumber) {
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        map.put(3, "D");
        map.put(4, "E");
        map.put(5, "F");
        map.put(6, "G");
        map.put(7, "H");
        map.put(8, "I");
        map.put(9, "J");
        map.put(10, "K");
        map.put(11, "L");
        map.put(12, "M");
        map.put(13, "N");
        map.put(14, "O");
        map.put(15, "P");
        map.put(16, "Q");
        map.put(17, "R");
        map.put(18, "S");
        map.put(19, "T");
        map.put(20, "U");
        map.put(21, "V");
        map.put(22, "W");
        map.put(23, "X");
        map.put(24, "Y");
        map.put(25, "Z");

        StringBuilder sb = new StringBuilder();
        
        // 95 / 10 = 9

        while (columnNumber != 0) {
            sb.append(map.get((columnNumber - 1) % 26));
            columnNumber = (columnNumber - (columnNumber - 1) % 26) / 26;
        }

        return sb.reverse().toString();
    }
}