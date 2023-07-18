package a7_binary_tree;

import java.util.*;

public class FindMode {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(2, node2, null);
        TreeNode node0 = new TreeNode(1, null, node1);
    }

    public static int[] q501s1(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        traverse(root, vec);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : vec) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        // 将出现的次数存入List集合
        map.forEach((k, v) -> {
            list.add(v);
        });
        //集合排序
        Collections.sort(list);
        // 得到最大值
        int max = list.get(list.size() - 1);
        // 根据最大值获取众数
        for (Map.Entry<Integer, Integer> entry : set) {
            if (entry.getValue() == max) {
                res.add(entry.getKey());
            }
        }
    }

    public static void traverse(TreeNode curr, List<Integer> vec) {
        if (curr == null)
            return;
        traverse(curr.left, vec);
        vec.add(curr.val);
        traverse(curr.right, vec);
    }

}
