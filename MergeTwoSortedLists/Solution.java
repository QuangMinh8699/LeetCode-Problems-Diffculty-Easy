/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Nếu listNode 1 bằng rỗng thì trả về listNode 2
        if (list1 == null)
            return list2;

        // Tương tự với listNode 2
        if (list2 == null)
            return list1;

        // So sánh giá trị của listNode 1 và listNode 2
        if (list1.val > list2.val) {
            // Nếu listNode 1 lớn hơn listNode 2
            // So sánh giá trị tiếp theo của listNode 2 với listNode 1
            list2.next = mergeTwoLists(list1, list2.next);

            // Trả về listNode 2
            return list2;
        } else {
            // Nếu listNode 1 == listNode 2 hoặc listNode 2 > listNode 1
            // So sánh giá trị tiếp theo của listNode 1 với listNode 2
            list1.next = mergeTwoLists(list1.next, list2);

            // Trả về listNode 1
            return list1;
        }
    }
}