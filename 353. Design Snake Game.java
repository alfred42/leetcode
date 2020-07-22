class SnakeGame {
    private class Node {
        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Node(Node node) {
            this.x = node.x;
            this.y = node.y;
        }

        public boolean equals(Node node) {
            return this.x == node.x && this.y == node.y;
        }
    }

    Deque<Node> deque;
    int[][] food;
    int width;
    int height;
    int score;
    int foodIndex;

    /** Initialize your data structure here.
        @param width - screen width
        @param height - screen height 
        @param food - A list of food positions
        E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0]. */
    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;

        this.deque = new ArrayDeque<>();
        deque.addLast(new Node(0, 0));

        this.score = 0;
        this.foodIndex = 0;
    }
    
    /** Moves the snake.
        @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down 
        @return The game's score after the move. Return -1 if game over. 
        Game over when snake crosses the screen boundary or bites its body. */
    public int move(String direction) {

        Node newNode = new Node(deque.getLast());

        switch(direction) {
            case "U":
                newNode.x--;
                break;
            case "L":
                newNode.y--;
                break;
            case "R":
                newNode.y++;
                break;
            case "D":
                newNode.x++;
                break;
        }
        
        if (hitWall(newNode)) return -1;

        if (foodIndex >= 0 && foodIndex < food.length && newNode.x == food[foodIndex][0] && newNode.y == food[foodIndex][1]) {
            score++;
            foodIndex++;
        } else {
            deque.removeFirst();
        }

        if (hitSnake(newNode)) return -1;
                
        deque.addLast(newNode);

        return score;
    }

    private boolean hitWall(Node node) {
        return node.x < 0 || node.x >= height || node.y < 0 || node.y >= width;

    }

    private boolean hitSnake(Node node) {
        for (Node n : deque) {
            if (node.equals(n)) return true;
        }

        return false;
    }
}

/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */