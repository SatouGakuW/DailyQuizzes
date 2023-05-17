package daimasuixianglu.a4_string.d9;

public class Q151_2 {

    public String reverseWords(String s) {
       s.trim();// 删除收尾空格
        int j = s.length() - 1;
        int i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0){
            while(i >= 0 && s.charAt(i) != ' ')
                i--;
            // 添加单词
            res.append(s.substring(i + 1, j + 1) + " ");
            //跳过单词中的空格
            while(i>= 0 && s.charAt(i) == ' ')
                i--;
            j = i; // 指向下一个单词的末尾
        }
        return res.toString().trim();

    }

    public static void main(String[] args) {
        String s = "hello   world"; // 包含三个空格
        String[] res = s.split("\\s+");
        System.out.println(res.length);
    }

}
