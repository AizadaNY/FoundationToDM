package week23;

public class DesignCircularDequeue {


    class Node {

        public int val;
        public Node next;
        public Node prev;

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    class MyCircularDeque {

        Node head;
        Node rear;
        int size;
        int capacity;

        public MyCircularDeque(int k) {
            size = 0;
            capacity = k;
        }

        public boolean insertFront(int value) {
            if(isFull()) return false;
            if(head == null){
                head = new Node(value,null, null);
                rear = head;

            }else {
                Node newNode = new Node(value, head, null);
                head.prev = newNode;
                head = newNode;
            }
            size++;
            return true;
        }


        public boolean insertLast(int value) {
            if(isFull()) return false;
            if(head == null){
                head = new Node(value, null, null);
                rear = head;
            }else{
                rear.next = new Node(value, null, rear);
                rear = rear.next;
            }
            size++;
            return true;
        }

        public boolean deleteFront() {
            if(isEmpty()) return false;
            if(size == 1){
                head = null;
                rear = null;
            }else{
                head = head.next;
            }
            size--;
            return true;
        }

        public boolean deleteLast() {
            if(isEmpty()) return false;
            if(size == 1){
                head = null;
                rear = null;
            }else{
                rear = rear.prev;
            }
            size--;
            return true;
        }

        public int getFront() {
            if(isEmpty()) return -1;
            return head.val;
        }

        public int getRear() {
            if(isEmpty()) return -1;
            return rear.val;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

    }
}
