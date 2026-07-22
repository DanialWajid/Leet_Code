class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse  = 0;
        Boolean result=false;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp/10;
        }
        if (reverse == x) {
            result=true;
        } else {
            result=false;
        }

    return result;
    }
}
