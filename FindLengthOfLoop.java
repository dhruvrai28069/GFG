public class FindLengthOfLoop {

    public static class Node {
        int val;
        FindLengthOfLoop.Node next;
    }

    public int lengthOfLoop(Node head) {
        // code here

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int count = 1;
                slow = slow.next;

                while(slow != fast){
                    slow = slow.next;
                    count++;

                }
                return count;
            }
        }
        return 0;
    }
}