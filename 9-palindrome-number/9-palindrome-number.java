class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0) return false; 
        int reversed = 0, remainder, original = num; 
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder; // get reversed number using this formula
            num /= 10; // the last digit is removed from num after division by 10
        }
        return original == reversed;
    }
}