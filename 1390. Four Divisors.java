class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            Set<Integer> set = new HashSet<>();
            
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    if (set.size() == 2) {
                        flag = false;
                        break;
                    }

                    set.add(i);
                    set.add(num / i);
                }
            }

            if (flag && set.size() == 2) {
                sum += 1;
                sum += num;
                for (int n : set) {
                    sum += n;
                }
            }
        }

        return sum;
    }
}