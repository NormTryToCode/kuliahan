package com.libraries;
// T extends Comparable<T> for making T is comparable with other T
// TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> for making TreeNode<T> comparable with other TreeNode<T>
public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> {
    private T data;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;

    public TreeNode(T data){
        setData(data);
        setLeftNode(null);
        setRightNode(null);
    }

    public TreeNode(T data, TreeNode<T> leftNode, TreeNode<T> rightNode){
        setData(data);
        setLeftNode(leftNode);
        setRightNode(rightNode);
    }
    
    public T getData(){
        return this.data;
    }
    public TreeNode<T> getLeftNode(){
        return this.leftNode;
    }
    public TreeNode<T> getRightNode(){
        return this.rightNode;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setLeftNode(TreeNode<T> leftNode){
        this.leftNode = leftNode;
    }
    public void setRightNode(TreeNode<T> rightNode){
        this.rightNode = rightNode;
    }

    @Override
    public int compareTo(TreeNode<T> o) {
        // TODO Auto-generated method stub
        return this.getData().compareTo(o.getData());
        // negative means the current object < other
        // positive means the current object > other
        // 0 means the current object = other
    }
}   
