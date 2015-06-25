package com.wmb.algorithms.binarytree;

/**
 *  AVERAGE CASE O(logn)
 *  WORST CASE O(n) if tree is unbalanced
 *
 * Created by rob on 6/17/15.
 */
public class BinaryTree {

    private Node root;


    public void insert(int key){
       root= insert(root, key);
    }

    protected Node insert(Node node, int key){

        if(node == null) {
            return  new Node(key);
        } else if (key < node.getKey()) {
            node.setLeftNode(insert(node.getLeftNode(), key));
        }else{
            node.setRightNode(insert(node.getRightNode(), key));
        }
        return node;
    }

    public void delete(int key){
        root = delete(key,root);

    }
    public Node delete(int key,Node node){

        if(node == null){
            return node;
        }
        if(key<node.getKey()){
            node.setLeftNode(delete(key,node.getLeftNode()));
        }else if(key>node.getKey()) {
            node.setRightNode(delete(key, node.getRightNode()));
        }else if(node.getLeftNode()!=null && node.getRightNode()!=null){
            node.setKey(findMin(node.getRightNode()).getKey());
            node.setRightNode(delete(node.getKey(),node.getRightNode()));
        } else
            node = ( node.getLeftNode() != null ) ? node.getLeftNode() : node.getRightNode();
        return node;
    }

    private Node findMin( Node node )
    {
        if( node == null )
            return null;
        else if( node.getLeftNode() == null )
            return node;
        return findMin( node.getLeftNode() );
    }

    public Node searchRecursive(int key) {
        return searchRecursive(key,root);
    }

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


    public Node searchIterative(int key) {
        return  searchIterative(key,root);
    }

    private Node searchIterative(int key, Node node) {
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


    public int size() {
        return countNodes(root);
    }
    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int count = 1;
        count += countNodes(node.getLeftNode());
        count += countNodes(node.getRightNode());
        return count;
    }

    public String toStringPreOrder( ) {
        return toStringPreOrder(root);
    }
    private String toStringPreOrder( Node node ) {
        String ret="";
        if ( node != null ) {

            ret=Integer.toString(node.getKey())+ ",";
            ret+=toStringPreOrder(node.getLeftNode());
            ret+=toStringPreOrder( node.getRightNode() );
        }
        return ret;
    }
    public String toStringPostOrder( ) {
        return  toStringPostOrder(root);
    }
    private String toStringPostOrder( Node node ) {
        String ret="";
        if ( node != null ) {
            ret +=toStringPostOrder(node.getLeftNode());
            ret +=toStringPostOrder(node.getRightNode());
            ret+=Integer.toString(node.getKey())+",";
        }
        return ret;
    }

    public String toStringInOrder() {
        return toStringInOrder(root);
    }

    private String toStringInOrder( Node node ) {
        String ret = "";
        if ( node != null ) {
            ret += toStringInOrder(node.getLeftNode());
            ret+=Integer.toString(node.getKey())+",";
            ret +=toStringInOrder(node.getRightNode());
        }
        return ret;
    }
}