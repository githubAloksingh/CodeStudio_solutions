public class Solution
{
    public static Node insertAtTail(Node list, int K) {
        Node new_node=new Node(K);
        Node temp=list;
        Node head=list;
        if(head==null){
            head=new_node;
            head.prev=null;
            head.next=null;
            return head;
            }
            while(temp.next!=null){
                temp=temp.next;
                }
                temp.next=new_node;
                new_node.prev=temp;
                new_node.next=null;
                return head;
    }
}
