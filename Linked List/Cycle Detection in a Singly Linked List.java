import java.util.*;
public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head==null || head.next==null)
        return false;
        Node curr=head;
        HashSet<Integer> hs=new HashSet<Integer>();
        while(curr!=null){
            if(hs.contains(curr.data)){
                return true;
            }
            hs.add(curr.data);
            curr=curr.next;
            }
            return false;
            }
      }
