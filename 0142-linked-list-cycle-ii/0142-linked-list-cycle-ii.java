
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null&& fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
               return cycle(slow, fast,  head);
            }
        }
        return null;
    }
    private ListNode cycle(ListNode slow, ListNode fast, ListNode head){
        slow = head;
        while(slow!= fast){
           slow= slow.next;
            fast= fast.next;
        }
        return slow;
    }
}