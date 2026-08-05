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
    public ListNode partition(ListNode head, int x) {
        ListNode smallTail=new ListNode(0);
        ListNode largeTail=new ListNode(0);

        ListNode lesslist=smallTail;
        ListNode greaterlist=largeTail;
        while(head!=null){
            if(head.val<x){
                lesslist.next=head;
                lesslist=lesslist.next;
            }else{
            greaterlist.next=head;
            greaterlist=greaterlist.next;
            }
            head=head.next;
        }
        lesslist.next=largeTail.next;
        greaterlist.next=null;

        return smallTail.next;
    }
}