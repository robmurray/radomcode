package com.wmb.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by rob on 3/11/15.
 */
public class BinaryTreeSearchTest {
    @Test
    public void searchIterativeFailTest() {
        BinaryTree bt = buildTree();
        Node returnedNode =bt.searchIterative(7);
        assertNull(returnedNode);

    }
    @Test
    public void searchRecursiveiveFailTest() {
        BinaryTree bt = buildTree();
        Node returnedNode =bt.searchRecursive(7);

        assertNull(returnedNode);

    }
    @Test
    public void searchIterativeSuccessTest() {
        BinaryTree bt = buildTree();
        Node returnedNode =bt.searchIterative(7);

        assertNotNull(returnedNode);
        assertEquals(returnedNode.getKey(), 7);

    }
    @Test
    public void searchRecursiveiveSuccessTest() {
        BinaryTree bt = buildTree();
        Node returnedNode =bt.searchRecursive(7);

        assertNotNull(returnedNode);
        assertEquals(returnedNode.getKey(), 7);

    }
    @Test
    public void insertTest(){
        int key =10;
        BinaryTree bt = new BinaryTree();

        bt.insert(key);
        assertNotNull(bt.searchRecursive(key));
        assertEquals(key,bt.searchRecursive(key).getKey());
    }

    @Test
    public void insertTest2(){
        BinaryTree bt = buildTree();
        int key =1;
        assertNotNull(bt.searchRecursive(key));
        assertEquals(key,bt.searchRecursive(key).getKey());
    }
    @Test
    public void countTest2(){
        BinaryTree bt = buildTree();

        assertEquals(5,bt.size());
    }


    public BinaryTree buildTree(){
        int key1 =10;
        int key2 =1;
        int key3 =100;
        int key4 =11;
        int key5 =7;
        BinaryTree bt = new BinaryTree();

        bt.insert(key1);
        bt.insert(key2);
        bt.insert(key3);
        bt.insert(key4);
        bt.insert(key5);
        return bt;
    }

    @Test
    public void preorderTest(){
        String expected ="10,1,7,100,11,";
        BinaryTree bt = buildTree();
        System.out.println(bt.toStringPreOrder());
        assertEquals(expected,bt.toStringPreOrder());
    }

    @Test
    public void postorderTest(){
        String expected ="7,1,11,100,10,";
        BinaryTree bt = buildTree();
        System.out.println(bt.toStringPostOrder());
        assertEquals(expected,bt.toStringPostOrder());
    }

    @Test
    public void inorderTest(){
        String expected ="1,7,10,11,100,";
        BinaryTree bt = buildTree();
        System.out.println(bt.toStringInOrder());
        assertEquals(expected,bt.toStringInOrder());
    }
}
