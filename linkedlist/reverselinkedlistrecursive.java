package question.linklist;

class Node{

    int data;
    Node next;

    Node(int data1,Node next1){
        this.data= data1;
        this.next=next1;
    }

    Node(int data1){     // makeing a header default class in which next set to null 
        this.data= data1;
        this.next= null;
    }
}

public class reverselinkedlistrecursive {

    static Node arraytonode1(int [] arr){

        Node head = new Node(arr[0]);  // setting it to head point
        Node mover= head;

        for(int i=1;i<arr.length;i++){

            Node temp= new Node(arr[i]);

            mover.next= temp; // mover direction to temp
            mover= temp;    
        }

        return head;

    }



    public static Node reverseit(Node head){

        if(head.next==null||head==null){

            return head;
        }


        Node newhead= reverseit(head.next);  // goes to end and get the head from last in if statement

        Node front=head.next;  // fornt is the no next to the head we get of small list (and front recursion it is reverse already so put its next to head and head to null)

        front.next=head;
        head.next=null;

        return newhead;



        
    }



















    static void print(Node head){

        Node temp1= head;   // starting position of temp from printing linklist

        while(temp1!=null){

            System.out.print(temp1.data+" ");

            temp1=temp1.next;

        }

        System.out.println();
    } 

    public static void main(String[] args) {
        
        int [] arr={2,4,3,6,8,4};

        Node newhead = arraytonode1(arr);

        print(newhead);

        Node newhead1=reverseit(newhead);

        print(newhead1);


        



    }

    
    
}
