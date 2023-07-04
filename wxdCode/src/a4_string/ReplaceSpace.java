package a4_string;

public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(offer05s2(s));
    }

    public static String offer05s1(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ')
                sb.replace(i, i + 1, "%20");
        }
        return sb.toString();
    }

    public static String offer05s2(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        //扩充空间，空格数量2倍
        int oldlength = s.length();
        for (int i = 0; i < oldlength; i++) {
            if (s.charAt(i) == ' ')
                s += "  ";
        }

        //有空格情况 定义两个指针
        int left = oldlength - 1;//左指针：指向原始字符串最后一个位置
        int right = s.length() - 1;//右指针：指向扩展字符串的最后一个位置
        char[] chars = s.toCharArray();
        while(left >= 0){
            if(chars[left] == ' '){
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            }else{
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return new String(chars);
    }
}
