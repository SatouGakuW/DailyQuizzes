package daimasuixianglu.a3_hash.d7;

public class Q383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] total = new int[26];
        for(char c : magazine.toCharArray()){
            total[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            total[c-'a']--;
            if(total[c-'a'] < 0)
                return false;
        }
        return true;
    }

}
