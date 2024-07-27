package question.linklist;


class Node{
    int data;
    Node next;   // this give the address or direction of next node

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;

    }

    Node(int data1){   // modifier for header only pointing null for now

        this.data=data1;
        this.next=null;  // default to null

    }
}




public class linklistnext {

   public static Node arraytonode(int [] arr){
        
    Node head= new Node(arr[0]);  // making the arr[0] to the header of the node
    Node mover= head;   // now pointing the mover to the head for now

    for(int i=1;i<arr.length;i++){  // start from 1 because the arr[0] already in header in node

        Node temp= new Node(arr[i]);  // setting temp in tempary possion for this index
        mover.next= temp;
        mover= temp; // now new mover to temp

    }

    return head;



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

    public static void findelement(Node headdd,int no){

        int index=0;

        Node temp1= headdd;   // starting position of temp from printing linklist

        while(temp1!=null){

            if(temp1.data==no){
                System.out.println("present in index of "+index);
            }

            temp1=temp1.next;

            index++;

        }

       

    }


    static Node removeit(Node head){
        // if(head == null){
        //     return head;
        // }
            head = head.next;

            return head;
            
        

    }


    static Node deletetail(Node head){

        if(head==null|| head.next==null){
            return null;
        }

        Node temp= head;

        while(temp.next.next!=null){

           temp=temp.next;
        }

        temp.next= null;

        return head;

    }

    static void print(Node head){

        Node temp1= head;   // starting position of temp from printing linklist

        while(temp1!=null){

            System.out.print(temp1.data+" ");

            temp1=temp1.next;

        }
    }  
    
    static Node deleteelement(Node head,int no){
        if(head==null){
            return null;
        }


        Node temp= head;
        while(temp.data!=no){

            temp=temp.next;

        }

        head=temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        
        int [] arr={8,4,2,3,5,3};


        Node newhead =  arraytonode(arr);

        System.out.println(newhead.data);

        Node temp1= newhead;   // starting position of temp from printing linklist

        while(temp1!=null){

            System.out.print(temp1.data+" ");

            temp1=temp1.next;

        }

        System.out.println(" ");


        System.out.println(Lengthof(newhead));

        findelement(newhead, 4);

        newhead=removeit(newhead);

 

        print(newhead);

        deletetail(newhead);

        System.out.println(" ");


  
        print(newhead);

        deleteelement(newhead, 5);

        print(newhead);
        


    }
}
