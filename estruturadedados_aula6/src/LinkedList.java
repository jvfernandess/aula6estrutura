public class LinkedList {
    private Node head;
    private int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    // Inserir dado no início da Lista
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Inserir dado no fim da Lista
    public void insertAtEnd(int data) {
        if (head == null) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    // Inserir dado no meio da Lista
    public void insertAtMiddle(int data) {
        if (head == null || data <= head.data) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // Remove dado no início da Lista
    public void removeFromBeginning() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    // Remove dado no fim da Lista
    public void removeFromEnd() {
        if (head == null || head.next == null) {
            removeFromBeginning();
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // Remove dado no meio da Lista
    public void removeFromMiddle(int data) {
        if (head == null) return;
        if (head.data == data) {
            removeFromBeginning();
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    // Retorna o Tamanho da Lista
    public int size() {
        return size;
    }

    // Retorna se a Lista está vazia
    public boolean isEmpty() {
        return head == null;
    }

    // Imprimir os dados da Lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
