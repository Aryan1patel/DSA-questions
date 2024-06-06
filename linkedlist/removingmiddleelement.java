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

public class removingmiddleelement {

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


    static Node removeelement(Node head,int index){

        if(head==null){    // in this condision

            return null;
        }

        if(head.data==0){        // if index is 0 this move head to one 
            head = head.next;

            return head;
        }

       // int count=0;  

        Node temp=head;   

        Node prev=null;   

        while(temp!=null){

           

            
            
            if(head.data==index){

                prev.next= prev.next.next;
                

                break;
                
            }

            prev= head;       // storing temp in previous and increasing temp because if next temp is equal to k then we make previous next to next.next

          //  temp=temp.next;  when using index

            head=head.next;

           // count++; if we want to remove index



        }

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

    //  newhead= removeelement(newhead, 0);

       System.out.println(" ");

       removeelement(newhead, 3);

       print(newhead);



        



    }

    
    
}

