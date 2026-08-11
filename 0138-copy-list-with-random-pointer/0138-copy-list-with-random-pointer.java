/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if (head==null)
       {
            return null;
       }
        HashMap<Node,Node> hehe=new HashMap<>();
        Node dummy=new Node(0);
        Node copy=dummy;
        Node kur=head;
        while (kur!=null) 
        {
            copy.next=new Node(kur.val);
            copy=copy.next;
            hehe.put(kur, copy);
            kur=kur.next;
        }
        kur=head;
        copy=dummy.next;

        while(kur!=null) 
        {
            if(kur.random!=null)
                copy.random=hehe.get(kur.random);
            kur=kur.next;
            copy=copy.next;
        }

        return dummy.next; 
    }
}