package daimasuixianglu.a7_binary_tree.d20;

import java.util.*;

public class Q429 {

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
    };


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Node> deque = new LinkedList<>();
        if(root == null)
            return res;
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node node = deque.poll();
                list.add(node.val);
                List<Node> children = node.children;
                if(children == null || children.size() == 0)
                    continue;
                for(Node child : children){
                    deque.add(child);
                }
            }
            res.add(list);
        }
        return res;
    }

}
