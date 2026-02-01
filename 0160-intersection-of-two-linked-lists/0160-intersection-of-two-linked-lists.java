
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

          while(lenA>lenB){
            lenA--;
            headA = headA.next;
            }
            while(lenA<lenB){
                lenB--;
                headB = headB.next;
            }

            while(headA!=headB){
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
    }
    private int getListLength(ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        return len;
    }
}