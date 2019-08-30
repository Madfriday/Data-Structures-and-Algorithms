package BasicStruct;

public class Queue {
    private Object[] que;
    private int head = 1;

    public Queue(){

    }
    public Queue(int max){
        que = new Object[max];
    }
    public void enque(Object data){
        que[head++] = data;
    }
    public void outque(){
        for(int i=0;i<head;i++){
            que[i] = que[i+1];
        }
        head--;
    }
}
