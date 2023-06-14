package daimasuixianglu.a6_stack_and_queue.d17;

import java.util.TreeMap;

public class TestException {

    public static void main(String[] args) {
        int i = 10;
        try {
            int res = i / 0;
        } catch (Exception e) {
          System.err.println("除数不能为0");
        }
        // 没有对数组进行修复或者跳出循环等操作
        System.out.println("程序继续执行");
        System.out.println("hello world");
        TreeMap map = new TreeMap();
        map.put(null, "123");



    }

}
