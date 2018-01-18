/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        
        dummy1.next = l1;
        dummy2.next = l2;
        
        int count1 = 0;
        int count2 = 0;
        
        while (l1 != null) {
            count1++;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            count2++;
            l2 = l2.next;
        }
        
        l1 = dummy1.next;
        l2 = dummy2.next;
        
        if (count1 < count2) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        System.out.println(count1 + " " + count2);
        
        
        int diff = Math.abs(count1 - count2);
        
        ListNode answerDummy = new ListNode(0);
        ListNode head = answerDummy;
        
        while (diff > 0) {
            System.out.println(diff);

            ListNode temp = new ListNode(l1.val);
            l1 = l1.next;
            head.next = temp;
            head = head.next;
            diff--;
        }
        
        while (l1 != null || l2 != null) {
            ListNode temp = new ListNode(l1.val + l2.val);
            l1 = l1.next;
            l2 = l2.next;
            head.next = temp;
            head = head.next;
        }
        
        int temp = calculateCarry(answerDummy.next);
        
        if (temp == 1) {
            ListNode carryNode = new ListNode(1);
            carryNode.next = answerDummy.next;
            answerDummy.next = carryNode;
        }
        
        return answerDummy.next;
    }
    
    
    public int calculateCarry(ListNode node) {
        if (node == null) return 0;
        else {
            int carry = calculateCarry(node.next);
            int temp = node.val + carry;
            node.val = temp % 10;
            return temp / 10;
        }
    }
 }
