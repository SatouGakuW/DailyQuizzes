package daimasuixianglu.a4_string.d10;

public class Q1147 {

    public int longestDecomposition(String text) {

        int left = 0, right = text.length() - 1;

        return solve(text, left, right);
    }

    // s[left,right] 可以分成多少段
    private int solve(String s, int left, int right) {

        if(left > right) return 0;

        for(int i = left, j = right; i < j; i ++,j --){

            // s[left,i] == s[j, right]
            if(equal(s, left, i, j, right))
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

    public static void main(String[] args) {
        int res = new Q1147().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi");
        System.out.println(res);
    }

}
