class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        
        restoreIpAddressesHelper("", 0, 0, 0, s, result);
        
        return result;
    }
    
    public void restoreIpAddressesHelper(String prefix, int currentValue, int currentIndex, int sectionCount, String s, List<String> result) {
        if (sectionCount == 4) {
            if (currentIndex == s.length()) {
                result.add(prefix);
            }   
            return;
        }
        
        if (currentIndex >= s.length() || sectionCount > 4) return;
        
        currentValue = currentValue * 10 + (int) (s.charAt(currentIndex) - '0');
        if (currentValue >= 0 && currentValue <= 255) {
            String nextPrefix = prefix + currentValue;
            if (sectionCount != 3) nextPrefix += ".";
            restoreIpAddressesHelper(nextPrefix, 0, currentIndex + 1, sectionCount + 1, s, result);
            if (currentValue != 0) {
                restoreIpAddressesHelper(prefix, currentValue, currentIndex + 1, sectionCount, s, result);
            }
        } else if (currentValue > 255) {
            return;
        }
    }
}