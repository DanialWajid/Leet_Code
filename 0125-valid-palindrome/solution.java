class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftc = s.charAt(left);
            char rightc = s.charAt(right);
            if (!Character.isLetterOrDigit(leftc)) {
                left++;
            }
            else if (!Character.isLetterOrDigit(rightc)) {
                right--;
            }
            else {
                if (Character.toLowerCase(leftc) != Character.toLowerCase(rightc)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true; 
    }
}
