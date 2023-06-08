package a1_array;

public class GenerateMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = solution(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] solution(int n) {
        int[][] result = new int[n][n];
        int start = 0;      // 每一圈的起始点，由于是从左上角开始遍历，横纵坐标都是一样的
        int loop = 0;   // 要转几圈
        int offset = 1; // 这圈有多大
        int count = 1;  // 要放的数
        while (loop++ < n / 2) {
            int i, j;   // 横纵坐标
            for (j = start; j < n - offset; j++) {     // →
                result[start][j] = count++;
            }
            for (i = start; i < n - offset; i++) {     // ↓
                result[i][j] = count++;
            }
            for (; j > start; j--) {                   // ←
                result[i][j] = count++;
            }
            for (; i > start; i--) {                   // ↑
                result[i][j] = count++;
            }
            start++;    // 缩小一圈，起始坐标+1
            offset++;   // offset 控制每一圈里每一条边遍历的长度
        }
        // n是奇数的时候最中间的单独赋值
        if (n % 2 == 1) {
            result[start][start] = count;
        }
        return result;
    }
}
