package daimasuixianglu.a4_string.d10;

public class Q1147_2 {

    private static final long MOD = (long)(1e9 + 7);
    private long[] pow26;
    public int longestDecomposition(String text) {

        // pow26[i] = 26 ^ i
        pow26 = new long[text.length()];
        pow26[0] = 1;
        for(int i = 1; i < pow26.length; i++){
            pow26[i] = pow26[i-1] * 26 % MOD;
        }

        int left = 0, right = text.length() - 1;

        return solve(text, left, right);
    }

    // s[left,right] 可以分成多少段
    private int solve(String s, int left, int right) {

        if(left > right) return 0;

        long preHash = 0, poshHash = 0;

        for(int i = left, j = right; i < j; i ++,j --){
            preHash = ((preHash * 26) + (s.charAt(i) - 'a')) % MOD;
            poshHash = ((s.charAt(j) - 'a') * (pow26[right-j]) + poshHash) % MOD;
            // s[left,i] == s[j, right]
            if(preHash == poshHash && equal(s, left, i, j, right))
                return 2 + solve(s, i + 1, j - 1);
        }
        return 1;

    }

    // s[l1,r1] == s[l2, r2] ?
    private boolean equal(String s, int l1, int r1, int l2, int r2) {
        for(int i = l1, j = l2; i <=r1 && j <=r2; i ++, j++){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

}
