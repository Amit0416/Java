class Add_two_number {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            ListNode new_node=new ListNode(sum%10);
            ans.next=new_node;
            ans=ans.next;
        }
        return dummy.next;
    }
}