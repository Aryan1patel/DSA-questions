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

public class add2linkedlist {

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

    public static Node addTwoNumbers(Node l1, Node l2) {
        
        Node dummynode= new Node(-1);

        Node current= dummynode;

        int carry=0;

        while(l1!=null||l2!=null||carry!=0){

            int sum=carry;

            if(l1!=null){ 
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){ 
                sum+=l2.data;
                l2=l2.next;
            }

            int digit=sum%10;  // add last no like for 10 0 simple adding
            carry=sum/10;
            
            Node newnode= new Node(digit);

            
            current.next=newnode;

            current=current.next;


            
        }

        

        Node head= dummynode.next;
        dummynode.next=null;

        return head;
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

        int [] arr2={1,1,1,1,1};

        Node newhead2 = arraytonode1(arr2);

        print(newhead);
        print(newhead2);

        Node newaddhead= addTwoNumbers(newhead, newhead2);

       print(newaddhead); 
        



    }

    
    
}
