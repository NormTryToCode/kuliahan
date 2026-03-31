package com.libraries;
public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public TreeNode<T> getRoot(){
        return this.root;
    }

    public void setRoot(TreeNode<T> root){
        this.root = root;
    }

    public BinarySearchTree(){
        ;
    }
    public BinarySearchTree(TreeNode<T> root){
        setRoot(root);
    }

    public void insertNode(TreeNode<T> root, TreeNode<T> newNode){
        setRoot(insertNodeHelper(root, newNode));
    }

    private TreeNode<T> insertNodeHelper(TreeNode<T> root, TreeNode<T> newNode){
        if (root == null) {
            root = newNode;
            return root;
        }
        else if (newNode.compareTo(root) < 0) {
            root.setLeftNode(insertNodeHelper(root.getLeftNode(), newNode));
            // this will traverse the tree if the current data is less than the current node
            // after it's done, it will assign it to the left position of the current node
        }
        else if (newNode.compareTo(root) > 0){
            root.setRightNode(insertNodeHelper(root.getRightNode(), newNode));
            // this will traverse the tree if the current data is greater than the current node
            // after it's done, it will assign it to the right position of the current node
        }
        return root;
    }

    public void displayTree(){
        displayTreeHelper(this.getRoot());
    }
    private void displayTreeHelper(TreeNode<T> root){
        if (root != null){
            displayTreeHelper(root.getLeftNode());
            System.out.println(root.getData());
            displayTreeHelper(root.getRightNode());
            // this works logically
        }
    }
}

