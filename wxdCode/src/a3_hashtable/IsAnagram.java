package a3_hashtable;

// LeetCode Q242
public class IsAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(q242(s, t));
    }

    public static boolean q242(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = (int) s.charAt(i) - 'a';
            alphabet[idx]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int idx = (int) t.charAt(i) - 'a';
            alphabet[idx]--;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
