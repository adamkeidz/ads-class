public class Stack {
    //attributes
    private int items[];
    private int count;
    private int maxItems;

    //constructor
    public Stack(int maxItems){
        this.maxItems = maxItems;
        this.items = new int[maxItems];
        this.count = 0;
    }

    //methods
    //pop
    public int pop(){
        //check if stack is empty
        if(isEmpty()) return -1;
        //remove item from stack
        int item = items[count-1];
        //decrement count
        count--;
        //return item
        return item;
    }
    //push
    public boolean push(int item){
        //check if stack is full
        if(isFull()) return false;
        //add item to stack
        items[count] = item;
        //increment count
        count++;
        //return true
        return true;
    }
    //isEmpty
    public boolean isEmpty(){
        if(count == 0) return true; else return false;
    }
    //isFull
    public boolean isFull(){
        if(count >= maxItems) return true; else return false;}
    //getCount
    public int getCount(){
        return count;}
    //toString
    public String toString(){
        String stackStr = "";
        for(int i = 0; i < count; i++){
            stackStr += items[i] + " ";
        }
        return stackStr;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
