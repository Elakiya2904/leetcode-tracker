// Last updated: 7/8/2026, 3:38:01 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        int len = 0;
       
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        
        return len;
    }
}