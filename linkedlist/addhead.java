package question.linklist;

public class addhead {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    static Node head;


    public void inserthead(int data){

        Node newnode= new Node(data);

        newnode.next= head;  // because default is null so we point the addrest of newnode to the head now newnode point to current head
        head=newnode;        
        

    }

    public void inserttail(int data){
        Node newnode = new Node(data);  // we make a new node using node class

        Node current1=head;

        while(current1.next!=null){
            current1= current1.next;

        } 
        // now current1 is tail node and current1 next is null

        current1.next= newnode;  // automatic next will be the null
        

    }

    static void print(){
        Node current= head;  // starting to print from head

        while(current!=null){
            System.out.print(current.data+" ");

            current=current.next;

        }

        System.out.println();
    }




    public static void main(String[] args) {

        addhead list= new addhead();

        list.inserthead(1);
        list.inserthead(2);
        list.inserthead(3);
        list.inserttail(99);

        list.print();
        


        
        
        

    }

    
}
