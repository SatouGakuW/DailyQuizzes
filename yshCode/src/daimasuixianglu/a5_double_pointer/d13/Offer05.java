package daimasuixianglu.a5_double_pointer.d13;

public class Offer05 {

    public String replaceSpace(String s) {

        StringBuilder res = new StringBuilder();
        for(char c : s. toCharArray()){
            if(c == ' ')
                res.append("%20");
            else
                res.append(c);
        }
        return res.toString();
    }

}
