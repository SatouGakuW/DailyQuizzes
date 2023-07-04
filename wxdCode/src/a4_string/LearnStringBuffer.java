package a4_string;

public class LearnStringBuffer {
    public static void main(String[] args) {
        String s = "abc";
        StringBuffer sb = new StringBuffer(s);

        // append() 追加指定的字符串
        sb.append(10);
        System.out.println(sb);
        sb.append("ef");
        System.out.println(sb);

        // reverse() 反转字符串
        sb.reverse();
        System.out.println(sb);

        // delete() 删除，左闭右开区间 [2, 4)
        sb.delete(2, 4);
        System.out.println(sb);

        // insert() 插入，在指定位置插入
        sb.insert(2, 'd');
        System.out.println(sb);

        // replace() 替换，替换指定位置的子串，左闭右开区间 [3, 6)
        sb.replace(3, 6, "def");
        System.out.println(sb);

        // subString() 获取子串，左闭右开区间 [3, 6)
        System.out.println(sb.substring(3, 6));
    }
}
