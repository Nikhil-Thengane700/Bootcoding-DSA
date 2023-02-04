package com.bootcoding.dsa.Tree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePreorder_144 {
    List<Integer> list  = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root== null){
            return list;
        }
        list.add(root.data);
        preorderTraversal(root.left);

        preorderTraversal(root.right);
        return list;
    }
}
