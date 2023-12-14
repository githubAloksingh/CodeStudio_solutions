public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
            }
            temp=head;
            for(int i=0;i<n/2;i++){
                temp=temp.next;
            }
            head=temp;
            return head;
    }
}
//Tortoise Algorithm
public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
         Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
