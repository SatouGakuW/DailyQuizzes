package daimasuixianglu.a5_double_pointer.d13;

public class Offer05_2 {

    public String replaceSpace(String s) {

      String reg = "\\s";
      s = s.replaceAll(reg,"%20");
        return s;
    }

}
