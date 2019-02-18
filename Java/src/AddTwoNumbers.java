
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;


        int carryOver = 0;
        while(l1 != null || l2 != null || carryOver != 0) {
            int sum = carryOver;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {

                sum += l2.val;
                l2 = l2.next;
            }
            carryOver = sum/10;
            sum = sum%10;

            ListNode node = new ListNode(sum);
            current.next = node;
            current = current.next;
        }
        return result.next;
    }


    public static void main(String[] args){
        AddTwoNumbers s = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        ListNode temp = l2;
//        while (temp != null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }

        ListNode result = s.addTwoNumbers(l1, l2);
        ListNode temp = result;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}