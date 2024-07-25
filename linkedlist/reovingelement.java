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

public class reovingelement {

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


    static Node deletehead(Node head){

        if(head == null){
            return head;
        }

        else{

        
            head = head.next;

            return head;
            
        }

    }

    public static int Lengthof(Node headdd){

        int cnt=0;

        Node temp1= headdd;   // starting position of temp from printing linklist

        while(temp1!=null){

            temp1=temp1.next;

            cnt++;

        }
        return cnt;


    }

    static Node deletetail(Node head){

        if(head==null|| head.next==null){
            return null;
        }

        Node temp= head;

        while(temp.next.next!=null){  // mean it is pointing to last second element from which next to next element point to null

           temp=temp.next;
        }

        temp.next= null;  // now when we are in last second element we make it null 

        return head;

    }


    static Node deleteelement(Node head,int no){
        if(head==null){
            return null;
        }


        Node temp= head;

        Node prev=null;

        int count =0;
        while(temp!=null){
            count++;

           if(count==no){

            prev.next=prev.next.next;

           }

            

        }

         temp=temp.next.next;

        return head;
    }

    static void print(Node head){

        Node temp1= head;   // starting position of temp from printing linklist

        while(temp1!=null){

            System.out.print(temp1.data+" ");

            temp1=temp1.next;

        }
    } 

    public static void main(String[] args) {
        
        int [] arr={2,4,3,6,8,4};

        Node newhead = arraytonode1(arr);

        print(newhead);

        System.out.println(" ");


       deleteelement(newhead, 8);

        print(newhead);

        System.out.println(" ");

        System.out.println(newhead.data);

        // System.out.println(newhead.data);

        // newhead =deletehead(newhead);

        // System.out.println(newhead.data);

        



    }

    
    
}
