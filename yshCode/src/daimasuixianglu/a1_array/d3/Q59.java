package daimasuixianglu.array.d3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Q59 {
    private int[][] generateMatrix(int n) {
        int total = n * n;
        int num = 1;
        int row = 0, col = 0;
        boolean[][] visited = new boolean[n][n];
        int[][] res = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            res[row][col] = num;
            visited[row][col] = true;
            int nextRow = row + directions[directionIndex][0], nextCol = col + directions[directionIndex][1];
            if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]){
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
            num++;
        }
        return res;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Q59 q59 = Q59.class.newInstance();
        Method method = Q59.class.getDeclaredMethod("generateMatrix", int.class);
        method.setAccessible(true);
        int[][] res = (int[][]) method.invoke(q59,3);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
