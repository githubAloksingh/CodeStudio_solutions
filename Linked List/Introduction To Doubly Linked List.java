public class Solution
{
    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            prev=temp;

        }
        return head;


    }
}