package com.wmb.algorithms.binarytree;

/**
 *  AVERAGE CASE O(logn)
 *  WORST CASE O(n) if tree is unbalanced
 *
 * Created by rob on 6/17/15.
 */
public class BinaryTree {

    public Node insert(Node root, int key){

        if(root == null) {
            return new Node(key);
        } else if (key < root.getKey()) {
            return insert(root.getLeftNode(), key);
        }else{
            return insert(root.getRightNode(), key);
        }
    }

    /**
     * searches an ordered binary tree
     * @param key
     * @param node
     * @return
     */
    public Node searchRecursive(int key, Node node) {

        if (node == null || node.getKey() == key) {
            return node;
        }
        if (key < node.getKey()) {
            return searchRecursive(key, node.getLeftNode());
        } else {
            return searchRecursive(key, node.getRightNode());
        }

    }

    /**
     * searches an ordered binary tree
     * @param key
     * @param node
     * @return
     */
    public Node searchIterative(int key, Node node) {
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.getKey() == key) {
                return currentNode;
            } else if (currentNode.getKey() < key) {
                currentNode = currentNode.getLeftNode();
            } else {
                currentNode = currentNode.getRightNode();
            }
        }

        return null;
    }
}