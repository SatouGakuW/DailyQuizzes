package daimasuixianglu.a7_binary_tree.d21;

import java.util.ArrayList;
import java.util.List;

public class Q590 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return res;
    }
    public void dfs(Node node){
        if(node == null)
            return;
        int size = node.children.size();
        for(int i = 0; i < size; i++){
            dfs(node.children.get(i));
        }
        res.add(node.val);
    }

}
