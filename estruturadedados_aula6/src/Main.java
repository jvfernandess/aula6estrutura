public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtEnd(7);
        list.insertAtMiddle(6);
        list.printList(); // Output: 3 5 6 7
        list.removeFromBeginning();
        list.removeFromEnd();
        list.removeFromMiddle(5);
        list.printList(); // Output: 6
        System.out.println("Size: " + list.size()); // Output: 1
        System.out.println("Is Empty: " + list.isEmpty()); // Output: false
    }
}
