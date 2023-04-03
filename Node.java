public class Node {
    //attributes 
    private int data;
    private Node nextNode;

    //methods
    public Node(int data){
        this.data = data;
        this.nextNode = null;
    }

    //getter for data
    public int getData() {
        return this.data;
    }

    //setter for data
    public void setData(int data) {
        this.data = data;
    }

    //setter for nextNode
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    //getter for nextNode
    public Node getNextNode() {
        return this.nextNode;
    }

    //toString method
    public String toString() {
        String nodeStr = "";
        nodeStr += "Data: " + this.data + ", ";
        nodeStr += "Next Node: " + (this.nextNode != null ? this.nextNode.toString() : "null");
        return nodeStr;
    }

    public static void main(String[] args) {
        Node n1Node = new Node(21);
        Node n2Node = new Node(42);
        int d = n1Node.getData();
        n2Node.getData();

        System.out.println("data = "+d);
        System.out.println(n1Node.toString());
    }
}
