package com.mainapp;
import com.libraries.BinarySearchTree;
import com.libraries.TreeNode;
public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();
        myTree.insertNode(null, new TreeNode<Integer>(4));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(10));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(23));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(134));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(31));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(451));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(21));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(43));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(9));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(76));
        myTree.insertNode(myTree.getRoot(), new TreeNode<Integer>(24));
        myTree.displayTree();
    }
}
