package pufa;

public class Main15 {
    /*
    题目：反转链表（面试）
    思路：1.先定义一个节点
         2.从头到尾遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表的最前端；
         3.新建的链表就是反转后的链表
     */
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    //pCur是要插入到新链表的节点
    //pNext是临时保存的pCur的next
    //pNext保存下一次要插入的节点，把pCur插入到dummy中，纠正头节点dummy的指向，pCur指向下一次要插入的节点
    public ListNode reverseList(ListNode head){
        ListNode dummy = new ListNode(-1);
        ListNode pCur = head;
        while (pCur != null){
            ListNode pNext = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = pNext;
        }
        return dummy.next;
    }
}
