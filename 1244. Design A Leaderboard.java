class Leaderboard {

    private Map<Integer, Integer> scoreMap;

    public Leaderboard() {
        scoreMap = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        scoreMap.put(playerId, scoreMap.getOrDefault(playerId, 0) + score);

    }
    
    public int top(int K) {
        List<Integer> list = scoreMap.entrySet().stream().map(entry -> entry.getValue()).sorted().collect(Collectors.toList());

        int sum = 0;
        for (int i = list.size() - 1; K > 0; K--, i--) {
            sum += list.get(i);
        }

        return sum;
    }
    
    public void reset(int playerId) {
        scoreMap.put(playerId, 0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */