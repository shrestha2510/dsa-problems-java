
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midnode = slow;
        ListNode prev = null;
        ListNode next;
        while(midnode!=null){
            next = midnode.next;
            midnode.next = prev;
            prev = midnode;
            midnode = next;
        }
        slow = head;
        while(slow!=null&&prev!=null){
            if(slow.val!=prev.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }
}