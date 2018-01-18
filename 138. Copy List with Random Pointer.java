/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode dummy = new RandomListNode(0);
        
        dummy.next = head;
        
        RandomListNode current = dummy;
        
        while (current.next != null) {
            RandomListNode temp = new RandomListNode(current.next.label);
            temp.next = current.next.next;
            current.next.next = temp;
            current = temp;
        }
        
        current = dummy;
        
        RandomListNode answerDummy = new RandomListNode(0);
        RandomListNode answerCurrent = answerDummy;

        while (current.next != null) {
            if (current.next.random != null) 
                current.next.next.random = current.next.random.next;
            current = current.next.next;
        }
        
        current = dummy;
        
        while (current.next != null) {
            answerCurrent.next = current.next.next;
            current.next.next = answerCurrent.next.next;
            current = current.next;
            answerCurrent = answerCurrent.next;
        }
        
        return answerDummy.next;
        
    }
}
