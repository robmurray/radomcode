package com.wmb.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by rob on 3/11/15.
 */
public class BinaryTreeSearchTest {

    public static Node rootTree;

    {
        rootTree = new Node(0);//
        // init nodes

        Node tree1 = new Node(1);//
        Node tree2 = new Node(2);//
        Node tree3 = new Node(3);//
        Node tree4 = new Node(4);//
        Node tree5 = new Node(5);//
        Node tree6 = new Node(6);//
        Node tree7 = new Node(7);//
        Node tree8 = new Node(8);

        // assemble
        rootTree.setLeftNode(tree7);
        rootTree.setRightNode(tree2);
        //7
        tree7.setLeftNode(tree3);
        //2
        tree2.setRightNode(tree5);
        tree2.setLeftNode(tree6);
        //5
        tree5.setRightNode(tree8);

        //8
        tree8.setRightNode(tree4);
        // tree2.setLeftNode(tree9);

    }


    @Test
    public void searchSuccessTest() {
        BinaryTree bt = new BinaryTree();

        Node returnedNode = bt.searchRecursive(3, rootTree);
        assertNotNull(returnedNode);
        assertEquals(returnedNode.getKey(), 3);

    }




/*
    @Test
    public void countTest(){

        DFSManager manager = new DFSManager();

        int count = manager.countNodes(rootTree);
        int expectedCount = 8;
        assertTrue(count == expectedCount);


    }

    @Test
    public void preorderTest(){

        DFSManager manager = new DFSManager();

        String expectValue = "0 7 3 2 6 5 8 4";
        String value=manager.preorderPrint(rootTree);
        assertTrue(expectValue.equals(value.trim()));
    }


    @Test
    public void postorderTest(){

        DFSManager manager = new DFSManager();

        String expectValue = "3 7 6 4 8 5 2 0";
        String value=manager.postorderPrint(rootTree);
        assertTrue(expectValue.equals(value.trim()));
    }
    @Test
    public void inorderTest(){

        DFSManager manager = new DFSManager();

        String expectValue = "3 7 0 6 2 5 8 4";
        String value=manager.inorderPrint(rootTree);
        assertTrue(expectValue.equals(value.trim()));
        DFSManager.inorderPrint2(rootTree);
    }
    */

}
