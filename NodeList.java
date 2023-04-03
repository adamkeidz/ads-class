public class NodeList {
    //attributes 
    private Node start = null;
    private int count = 0;
    private int maxSize = 0;

    //methods
    public NodeList(int maxSize){
        this.maxSize = maxSize;
    }

    public Node getStartNode(){
        return start;
    }

    // public boolean addDataAtStart(int d){
    //     if(isFull()) return false; 
    //     start = new Node(d);
    //     start.setNextNode(start);
    // }

    public boolean isFull(){
        if(count >= maxSize) return true; else return false;
    }

    public String toString(){
        if (start == null){
            return "";
        }else{
            return start.toString();
        }
    }

    public static void main(String[] args) {
        NodeList items = new NodeList(9);
        System.out.println(items);
    }
}
