class Node {
    int data;
    Node next = null;
    
    Node(final int data) {
        this.data = data;
    }
}

public class NodeLinkedListHandler {
    public static Node eliminarPares(Node head) {
        // Eliminar nodos pares al inicio
        while (head != null && head.data % 2 == 0) {
            head = head.next;
        }
        
        // Si la lista queda vacía
        if (head == null) {
            return null;
        }
        
        Node current = head;
        while (current.next != null) {
            if (current.next.data % 2 == 0) {
                current.next = current.next.next; // Saltar nodo par
            } else {
                current = current.next;
            }
        }
        
        return head;
    }
    
    // Método para imprimir la lista enlazada
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        
        System.out.println("Lista original:");
        printList(head);
        
        Node result = eliminarPares(head);
        
        System.out.println("Lista después de eliminar pares:");
        printList(result);
    }
}
