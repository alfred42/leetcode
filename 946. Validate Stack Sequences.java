class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();

        int popIndex = 0;

        for (int pushIndex = 0; pushIndex < pushed.length; pushIndex++) {
            stack.push(pushed[pushIndex]);

            while (!stack.isEmpty() && stack.peek().equals(popped[popIndex])) {
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }
}