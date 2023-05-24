package daimasuixianglu.a5_double_pointer.d13;

public class Q151 {
    public String reverseWords(String s) {
        String reg = "\\s+";
        String[] splitS = s.split(reg);
        StringBuilder res = new StringBuilder();
        for (int i = splitS.length - 1; i >= 0; i--)
            res.append(splitS[i] + " ");
        return res.toString().trim();
    }
}
