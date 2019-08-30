package tree;

public class Tree {
    private Node root;
    public Tree(){
        root = null;
    }
    //
    public Node find(int key){
        Node curr = root;
        while(curr.key != key){
            if(curr.key < key){
                curr = curr.rightChild;
            }else {
                curr = curr.leftChild;
            }
            if(curr == null){
                return null;
            }
        }
        return curr;
    }
    //
    public void insert(int id,int data){
        Node newNode = new Node(id,data);
        if(root == null){
            root = newNode;
        }else {
            Node curr = root;
            Node pre;
            while(true){
                pre = curr;
                if(id < curr.key){
                    curr = curr.leftChild;
                    if(curr == null){
                        pre.leftChild = newNode;
                        return;
                    }
                }else {
                    curr = curr.rightChild;
                    if(curr == null){
                        pre.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }
    //
    public boolean delete(int key){
        Node curr = root;
        Node pre = root;
        boolean isLeftnode =true;
        while(curr.key != key){
            pre = curr;
            if(key < curr.key){
                isLeftnode = true;
                curr = curr.leftChild;
            }else {
                isLeftnode = false;
                curr = curr.rightChild;
            }
            if(curr == null){
                return false;
            }
        }

        if(curr.leftChild == null && curr.rightChild == null){
            if(curr == root){
                root =null;
            }else if(isLeftnode){
                pre.leftChild = null;
            }else {
                pre.rightChild =null;
            }
        }else if(curr.leftChild == null){
            if(curr ==root){
                root = pre.rightChild;
            }else if(isLeftnode){
                pre.leftChild = curr.rightChild;
            }else {
                pre.rightChild = curr.rightChild;
            }
        }else if(curr.rightChild == null){
            if(curr == root){
                root = curr.leftChild;
            }else if(isLeftnode){
                pre.leftChild = curr.leftChild;
            }else {
                pre.rightChild = curr.leftChild;
            }
        }else {
            Node succ = getSucessor(curr);
            if(curr == root){
                root = succ;
            }else if(isLeftnode){
                pre.leftChild = succ;
            }else {
                pre.rightChild = succ;
            }
            succ.leftChild = curr.leftChild;
        }

        return true;
    }

    public Node getSucessor(Node del){
        Node curr = del;
        Node pre = del;
        Node succ = curr.rightChild;
        while(succ != null){
            pre = curr;
            curr = succ;
            succ = succ.leftChild;
        }
        if(curr != del.rightChild){
            pre.leftChild = curr.rightChild;
            curr.rightChild = del.rightChild;
        }
        return curr;
    }
    //
    public void preorder(Node node){
        if(node != null){
            System.out.println(node.data);
            preorder(node.leftChild);
            preorder(node.rightChild);
        }
    }
    //
    public void midOrder(Node node){
        if(node != null){
            midOrder(node.leftChild);
            System.out.println(node.data);
            midOrder(node.rightChild);
        }
    }

}


class Node{
    public int key;//数据关键字key
    public int data;
    public Node leftChild;
    public Node rightChild;

    public Node(int id,int data){
        this.key = id;
        this.data = data;
    }

}