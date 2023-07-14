package a0_basic_knowledge;

public class Test {
    public static void main(String[] args) {
        int b = Recursion(3);
        System.out.println(b);
    }

    public static int Recursion(int a) {
        if (a == 0)
            return 0;
        else
            return a + Recursion(a - 1);
    }
}
