package a7_binary_tree;

import java.util.Map;

public class BuildTree {
    public static void main(String[] args) {
        Tools tool = new Tools();
        int[] inorder = {9,3,15,20,7}, postorder = {9,15,7,20,3};
        tool.buildTreeByInAndPost(inorder, postorder);
    }
}
