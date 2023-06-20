package a3_hashtable;

public class CanConstruct {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(solution(ransomNote, magazine));
    }

    public static boolean solution(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int idx = (int) magazine.charAt(i) - 'a';
            alphabet[idx]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = (int) ransomNote.charAt(i) - 'a';
            alphabet[idx]--;
            if (alphabet[idx] < 0) {
                return false;
            }
        }
        return true;
    }
}
