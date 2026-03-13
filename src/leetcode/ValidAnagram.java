package leetcode;

/**
 * Given two strings s and t, return true if t is an of s, and false otherwise.
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] countChar = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countChar[s.charAt(i) - 'a']++;
            countChar[t.charAt(i) - 'a']--;
        }
        for (int count : countChar) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("daniel", "leinad"));
    }
}