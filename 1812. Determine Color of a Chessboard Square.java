class Solution {
    public boolean squareIsWhite(String coordinates) {
        Map<String, Boolean> map = new HashMap<>();

        map.put("a1", false);
        map.put("b1", true);
        map.put("c1", false);
        map.put("d1", true);
        map.put("e1", false);
        map.put("f1", true);
        map.put("g1", false);
        map.put("h1", true);

        map.put("a2", true);
        map.put("b2", false);
        map.put("c2", true);
        map.put("d2", false);
        map.put("e2", true);
        map.put("f2", false);
        map.put("g2", true);
        map.put("h2", false);

        map.put("a3", false);
        map.put("b3", true);
        map.put("c3", false);
        map.put("d3", true);
        map.put("e3", false);
        map.put("f3", true);
        map.put("g3", false);
        map.put("h3", true);

        map.put("a4", true);
        map.put("b4", false);
        map.put("c4", true);
        map.put("d4", false);
        map.put("e4", true);
        map.put("f4", false);
        map.put("g4", true);
        map.put("h4", false);

        map.put("a5", false);
        map.put("b5", true);
        map.put("c5", false);
        map.put("d5", true);
        map.put("e5", false);
        map.put("f5", true);
        map.put("g5", false);
        map.put("h5", true);

        map.put("a6", true);
        map.put("b6", false);
        map.put("c6", true);
        map.put("d6", false);
        map.put("e6", true);
        map.put("f6", false);
        map.put("g6", true);
        map.put("h6", false);

        map.put("a7", false);
        map.put("b7", true);
        map.put("c7", false);
        map.put("d7", true);
        map.put("e7", false);
        map.put("f7", true);
        map.put("g7", false);
        map.put("h7", true);

        map.put("a8", true);
        map.put("b8", false);
        map.put("c8", true);
        map.put("d8", false);
        map.put("e8", true);
        map.put("f8", false);
        map.put("g8", true);
        map.put("h8", false);

        return map.get(coordinates);
    }
}