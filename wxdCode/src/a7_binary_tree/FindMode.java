package a7_binary_tree;

import java.util.*;

public class FindMode {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(2, node2, null);
        TreeNode node0 = new TreeNode(1, null, node1);
        Q501 q501 = new Q501();
        int[] ans = q501.solution2(node0);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

// 一次中序遍历解决这个问题
class Q501 {
    // 暴力解法，先遍历一遍树，把树里元素和出现次数存进map，然后根据value从大到小排序
    // 找到最多出现多少次（maxCount）后，再遍历map，把 出现次数 = max 的加入结果数组
    public int[] solution1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        traverse(root, map);
        List<Integer> list = new ArrayList<>();
        // 将出现的次数存入List集合
        map.forEach((k, v) -> {
            list.add(v);
        });
        //集合排序
        Collections.sort(list);
        // 得到最大值
        int maxCount = list.get(list.size() - 1);
        // 根据最大值获取众数
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                res.add(entry.getKey());
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (int r : res) {
            result[i] = r;
            i++;
        }
        return result;
    }

    public void traverse(TreeNode curr, Map<Integer, Integer> map) {
        if (curr == null)
            return;
        traverse(curr.left, map);
        map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
        traverse(curr.right, map);
    }

    ArrayList<Integer> resList;
    // 最大出现次数
    int maxCount;
    // 出现次数
    int count;
    // 记录上一个访问的节点
    TreeNode pre;

    public int[] solution2(TreeNode root) {
        // 初始化
        resList = new ArrayList<>();
        maxCount = 0;
        count = 0;
        pre = null;
        findByInorderTraversal(root);
        // 把 ArrayList 转为 int[]
        int[] result = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            result[i] = resList.get(i);
        }
        return result;
    }

    public void findByInorderTraversal(TreeNode root) {
        // 终止
        if (root == null)
            return;
        // 左
        findByInorderTraversal(root.left);

        // 中
        int rootValue = root.val;
        // 计数
        if (pre == null || rootValue != pre.val) {
            // 新的数，count需要重新计数
            count = 1;
        } else {
            count++;
        }
        // 如果找到了出现次数更多的，就要更新结果以及maxCount
        if (count > maxCount) {
            resList.clear();
            resList.add(rootValue);
            maxCount = count;
        } else if (count == maxCount) {
            resList.add(rootValue);
        }
        pre = root;

        // 右
        findByInorderTraversal(root.right);
    }

}