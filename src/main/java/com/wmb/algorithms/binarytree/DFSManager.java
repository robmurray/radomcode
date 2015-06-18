package com.wmb.algorithms.binarytree;

/**
 * Created by rob on 3/11/15.
 */
public class DFSManager {

    public int countNodes( Node root ) {
        if ( root == null )
            return 0;  // The tree is empty.  It contains no nodes.
        else {
            int count = 1;   // Start by counting the root.
            count += countNodes(root.getLeftNode());  // Add the number of nodes
            //     in the left subtree.
            count += countNodes(root.getRightNode()); // Add the number of nodes
            //    in the right subtree.
            return count;  // Return the total.
        }
    }

    public String preorderPrint( Node root ) {
        String ret="";
        if ( root != null ) {  // (Otherwise, there's nothing to print.)
            ret=Integer.toString(root.getKey())+" ";
            ret+=preorderPrint(root.getLeftNode());   // Print items in left subtree.
            ret+=preorderPrint( root.getRightNode() );  // Print items in right subtree.
        }
        return ret;
    } // end preorderPrint()

    public String postorderPrint( Node root ) {
        String ret="";
        if ( root != null ) {  // (Otherwise, there's nothing to print.)
            ret +=postorderPrint( root.getLeftNode() );   // Print items in left subtree.
            ret +=postorderPrint( root.getRightNode() );  // Print items in right subtree.
            ret+=Integer.toString(root.getKey())+" ";
        }
        return ret;
    } // end postorderPrint()

    public String inorderPrint( Node root ) {
        String ret = "";
        if ( root != null ) {  // (Otherwise, there's nothing to print.)
            ret += inorderPrint( root.getLeftNode() );   // Print items in left subtree.
            ret+=Integer.toString(root.getKey())+" ";
            ret +=inorderPrint( root.getRightNode() );  // Print items in right subtree.
        }
        return ret;
    } // end inorderPrint()

    public static void inorderPrint2( Node root ) {
        if ( root != null ) {  // (Otherwise, there's nothing to print.)
            inorderPrint2( root.getLeftNode() );   // Print items in left subtree.
            System.out.print( root.getKey() + " " );  // Print the root item.
            inorderPrint2( root.getRightNode() );  // Print items in right subtree.
        }
    } // end inorderPrint()

}
