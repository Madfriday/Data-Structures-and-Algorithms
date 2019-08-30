package BasicStruct;

public class Stack {
    private int top;
    private int maxsize;
    private Object[] stack;
    public Stack(){

    }
    //
    public Stack(int size){
        this.maxsize = size;
        this.top = -1;
        stack = new Object[this.maxsize];
    }
    //
    public boolean isfull(){
        return (top+1 == maxsize);
    }
    //
    public boolean isnull(){
        return (top == -1);
    }
    //
    public void enstack(Object data){
        stack[++top] = data;
    }
    //
    public void pop(){
        Object data = stack[top--];
    }
}
