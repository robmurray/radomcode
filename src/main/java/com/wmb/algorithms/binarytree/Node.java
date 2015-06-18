package com.wmb.algorithms.binarytree;

/**
 * Created by rob on 6/17/15.
 */
public class Node {
    private int key;
    private Node leftNode;
    private Node rightNode;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (key != node.key) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return key;
    }
}
