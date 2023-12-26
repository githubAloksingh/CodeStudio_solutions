import java.util.*;

public class solution {
	public static int Floor(BinaryTreeNode<Integer> node, int input) {
	{	{ 		/*Your class should be named Solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
	*/ 
    int floor = -1;
     
        while (node != null) {
            if (node.data == input){
                return node.data;
            }
            else if (node.data < input) {
                floor = node.data;
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return floor;
	}
  }
  }
}
