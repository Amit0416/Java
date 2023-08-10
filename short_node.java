

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class short_node {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                al.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        Collections.sort(al);
        ListNode head=new ListNode();
        ListNode temp=head;
        for(int i=0;i<al.size();i++){
            temp.next=new ListNode(al.get(i));
            temp=temp.next;
        }
        return head.next;
    }
}
