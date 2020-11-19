class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : num.toCharArray()) {
            while (!deque.isEmpty() && deque.peekLast() > c && k > 0) {
                deque.pollLast();
                k--;
            }

            deque.offerLast(c);
        }

        for (int i = 0; i < k; i++) {
            deque.pollLast();
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        while (!deque.isEmpty()) {
            if (leadingZero && deque.peekFirst() == '0') {
                deque.pollFirst();
                continue;
            }

            leadingZero = false;
            sb.append(deque.pollFirst());
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}