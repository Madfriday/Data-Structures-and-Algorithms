package BasicStruct;

public class SingeLinklist {
    private int size;
    private Node head;

    public class Node{
        private Object data;
        private Node next;

        public Node(){

        }

        public Node(Object data){
            this.data = data;
        }
    }

    public Object add(Object data){
        Node newNHead = new Node(data);
        if(size == 0){
            head = newNHead;
        }else {
            newNHead.next = head;
            head = newNHead;
            size ++;
        }
        return data;
    }
    //
    public boolean isEmpty(){
        return (size == 0);
    }
    //
    public void play(){
        if(size > 0){
            Node node = head;
            int tmpsize = size;
            if(tmpsize == 1){
                System.out.println(node.data);
            }else {
                while(tmpsize > 0){
                    if(node.equals(head)){
                        System.out.println("["+node.data+"->");
                    }else if(node.next == null){
                        System.out.println(node.data+"]");
                    }else {
                        System.out.println(node.data+"->");
                    }
                    node = node.next;
                    tmpsize --;
                }
            }
        }
    }
    //
    public Object deletehead(){
        Object obj = head.data;
        head = head.next;
        size --;
        return obj;
    }
    //
    public Node find(Object obj){
        Node tmp = head;
        int tem = size;
        while(tem > 0){
            if(obj.equals(tmp.data)){
                return tmp;
            }else {
                tmp = tmp.next;
            }
            tem --;
        }
        return null;
    }
    //
    public boolean delete(Object obj){
        if(size == 0) return false;
        Node curr = head;
        Node pre = head;
        int tmp = size;
        while((curr.data != obj)){
            if(curr.next == null){
                return false;
            }
            else {
                pre = curr;
                curr = curr.next;
            }
        }
        if(curr == head){
            head = curr.next;
            size --;
        }else {
            pre.next = curr.next;
        size --;
    }
        return true;
    }
}
