class Solution {
    public boolean isPalindrome(String s) {
        String sl = s.toLowerCase();
        String se = "";

        for (int i = 0; i < sl.length(); i++) {
            char ch = sl.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                se = se + ch;
            }
        }

        int len = se.length();
        for (int i = 0; i < len / 2; i++) {
            if (se.charAt(i) != se.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
