package BasicStruct;

public class RecycleQueue {
    public static void main(String[] args) {
        Sequequ<Integer> seq = new Sequequ<Integer>(5);
        seq.initqueue();
        seq.inque(12);
        seq.inque(1);
        seq.inque(2);
        seq.getDates();

        seq.outque();
        System.out.println(seq.getDates());

    }


}
class Sequequ<T>{
    private T[] dates;
    private int maxsize;
    private int font;
    private int rear;

    public Sequequ(int max){
        if(maxsize < 1){
            maxsize=1;
        }
        //
        this.maxsize = max;
        this.dates = (T[])new Object[this.maxsize];
    }
    //
    public boolean isfull(){
        if(this.font == ((rear+1)%maxsize)){
            return true;
        }else return false;
    }
    public boolean isnull(){
        if(this.font == this.rear){
            return true;
        }else return false;
    }
    //
    public void initqueue(){
        this.font = 0;
        this.rear = 0;
    }
    //
    public boolean inque(T data){
        if(isfull()){
            return false;
        }else {
            dates[rear] = data;
            rear = (rear+1)%maxsize;
            return true;
        }
    }
    //
    public boolean outque(){
        if(isnull()){
            return false;
        }else {
            T data = dates[font];
            font = (font+1) % maxsize;
            return true;
        }
    }

    public T[] getDates() {
        return dates;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public int getFont() {
        return font;
    }

    public int getRear() {
        return rear;
    }
}