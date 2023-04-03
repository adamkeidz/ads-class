public class LinkedListStack<T> {
    private Node<T> head;
    
    // Node class representing a single node in the linked list
    private static class Node<T> {
        T data; // Data stored in the node
        Node<T> next; // Reference to the next node in the linked list
        
        Node(T data) {
            this.data = data;
        }
    }
    
    // Add an element to the top of the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node with the given data
        newNode.next = head; // Set the next pointer of the new node to the current head of the linked list
        head = newNode; // Set the head of the linked list to the new node, making it the new top of the stack
    }
    
    // Remove and return the element at the top of the stack
    public T pop() {
        if (head == null) {
            // If the stack is empty, throw a NoSuchElementException
            throw new NoSuchElementException();
        }
        T data = head.data; // Get the data from the current head of the linked list
        head = head.next; // Set the head of the linked list to the next node, removing the current head from the stack
        return data; // Return the data from the removed node
    }
    
    // Return the element at the top of the stack without removing it
    public T peek() {
        if (head == null) {
            // If the stack is empty, throw a NoSuchElementException
            throw new NoSuchElementException();
        }
        return head.data; // Return the data from the current head of the linked list
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null; // If the head is null, the stack is empty
    }
    
    // Return the number of elements in the stack
    public int size() {
        int size = 0; // Start with a size of 0
        Node<T> curr = head; // Start at the head of the linked list
        while (curr != null) { // Iterate through the linked list until the end is reached
            size++; // Increment the size counter
            curr = curr.next; // Move to the next node in the linked list
        }
        return size; // Return the final size
    }
}
