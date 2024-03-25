class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

 class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;


            if (slow == fast) {
                break;
            }
        }


        if (fast == null || fast.next == null) {
            return null;
        }

        // Move slow pointer back to head
        slow = head;

        // Move both pointers at the same pace until they meet
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Return the node where the cycle begins
        return slow;
    }

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();


        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Cycle

        ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}