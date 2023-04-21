class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");

        int previous = 0;

        for (String token : tokens) {
            try {  
                int current = Integer.parseInt(token);  
                if (current <= previous) return false;
                previous = current;
            } catch(NumberFormatException e){  
                ;
            }
        }

        return true; 
    }
}