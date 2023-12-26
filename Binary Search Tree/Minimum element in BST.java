/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node left;
     public Node right;

     Node()
     {
         this.data = 0;
         this.left = null;
         this.right = null;
     }

     Node(int data)
     {
         this.data = data;
         this.left = null;
         this.right = null;
     }

     Node(int data, Node left, Node right)
     {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 }

 *****************************************************************/


public class Solution
{
    public static int minValue(Node root) {
        // Write your code here.
        int mini=-1;
        while(root!=null){
            mini=root.data;
            root=root.left;
        }
        return mini;
    }
}