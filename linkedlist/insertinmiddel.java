package question.linklist;

public class insertinmiddel {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    static Node head;


    public void inserthead(int data){

        Node newnode= new Node(data);

        newnode.next= head;  // because default is null so we point the addrest of newnode to the head now newnode point to current head
        head=newnode;        
        

    }

    public void inmiddel(int data,int k){  // k is this index in which we want to put

        Node newnode= new Node(data);

      int index=1;// counting index

      Node current= head;
                                // 1234
      while(index!=k-1){        // 0123      to put in k index we want current indext to be k-1
        current= current.next;
        index++;
      }
      

      // now we get the index position

      newnode.next=current.next.next;  // frist assisnge the newnode next position 
      current.next= newnode;           // and now current node to newnode position
      



    }


    static void delete(int data){


        

        Node current= head;
        Node prev =null;

        if (current != null && current.data == data) {  // mean the data is on the head
            head = current.next; // Changed head
            return;
        }

        
        

        while(current!=null&&current.data!=data){

            prev=current;                   // so we get the previous value in which it before it equals to data
            current=current.next;

        }

        //System.out.println(current.data); get 5 in data 

        prev.next= prev.next.next; // or current.next



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
        insertinmiddel list= new insertinmiddel();

        list.inserthead(0);
        list.inserthead(1);
        list.inserthead(2);
        list.inserthead(3);

        list.print();

        list.inmiddel(5, 3);  // k is the index in which we want to change

        list.print();

        list.delete(5);

        list.print();

        



        
    }
}
