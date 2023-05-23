package daimasuixianglu.a5_double_pointer.d12;

import java.util.ArrayList;
import java.util.List;

public class Q844 {

    public boolean backspaceCompare(String s, String t) {
        String ss = compileStr(s);
        String tt = compileStr(t);
        return ss.equals(tt);
    }

    public String compileStr(String s){
        List<Character> res = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c != '#')
               res.add(c);
            else{
                if(res.size() > 0)
                    res.remove(res.size()-1);
            }
        }
        return res.toString();
    }

}
