package daimasuixianglu.a4_string.d9;

public class Offer05_2 {
    public String replaceSpace(String s) {

        if(s == null || s.length() == 0)
            return s;

        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' ')
                res.append("%20");
            else
                res.append(arr[i]);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        String s = "hello   world  !";
        String res = new Offer05_2().replaceSpace(s);
        System.out.println(res);
    }
}
