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

// space O(1) || time O(n)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head; 
        head.next = deleteDuplicates(head.next); 
        return head.next != null && head.val == head.next.val ? head.next : head;
    }
}