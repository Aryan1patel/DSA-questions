package question.linklist;

public class doublylinkedlist {
    

    class Node{
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

        Node (int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
            
        }
    }

    

    //     Node convertfromarray(int [] arr){  // do not use static (because it is a inner class) and because we referenceing to Node 

    //     if (arr == null || arr.length == 0) {
    //         return null;
    //     }

    //     Node head= new Node(arr[0]);

    //     Node current = head;

    //     for(int i=1;i<arr.length;i++){

    //         Node newnode1= new Node(arr[i]);

    //         current.next=newnode1;
    //         current=newnode1;

    //     }

    //     return head;
    // }

    // now convert to double linked list

    Node convertfromarray (int [] arr){
        
        Node head= new Node(arr[0]);

        if (arr == null || arr.length == 0) {
            return null;
        }

        Node current = head;

        for(int i=1;i<arr.length;i++){
            Node newnode= new Node(arr[i]);

            current.next= newnode;
            newnode.prev=current;
            current= newnode;
            

        }










        return head;
    }


        public static void print(Node head){

        Node current= head;  // starting to print from head

        while(current!=null){
            System.out.print(current.data+" ");

            current=current.next;

        }

        System.out.println();
    }

    public static void main(String[] args) {

        doublylinkedlist newlist = new doublylinkedlist();  // outer class of convertfromarray class so we have to make a object to excess the inner claass

        int [] arr={1,2,3,4,5};

        Node newhead=newlist.convertfromarray(arr);

        print(newhead);

        System.out.println(newhead.next.next.prev.data);

        
        
    }
}
