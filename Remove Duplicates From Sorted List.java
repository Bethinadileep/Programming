/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        if(head == null)
        {
            return null;
        }
        Node curr = head;
        while(curr != null){
            if((curr.next != null) && curr.data == curr.next.data){
                curr.next = curr.next.next;
                Node t = curr.next;
                t = null;
            }
            else
            {
                curr = curr.next;
            }
        }
        return head;
    }
}
