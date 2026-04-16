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

class Solution {
    public ListNode reverseList(ListNode head) {
    //[1 -> 2]. [1 < - 2]  

ListNode prev = null;  

    while(head != null) {
        ListNode nxt = head.next;

    head.next = prev; //[null <- 0 < - 1 < - 2 < - 3 < - 4]
    prev = head;
    head = nxt; 
    }

    return prev;
}
}
