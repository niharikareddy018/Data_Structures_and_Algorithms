class Solution {
    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int len = 0;
        boolean odd = false;
        for (int count : map.values()) {
            if (count % 2 == 0) {
                len += count;
            } else {
                len += count - 1;
                odd = true;
            }
        }
        if (odd) {
            len++;
        }
        return len;
    }
}