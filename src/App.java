public class App {
    private static Node head=null;  
     
   public static void printData(){
       int sixe=0;
       Node currNode=head;
      
       while (currNode != null) {
           System.out.print(currNode.data + " ");
           currNode=currNode.next;
           sixe++;
           
       }       
      
    System.out.println("NULL");
    System.out.println("Size of Your Eelements =" + sixe);
   
}
   public static void addFrontElement(int data){   
       if (head ==null) {
        Node addNewElement= new Node(data);
       head=addNewElement;  
       }else{
        Node addNewElement= new Node(data);
        System.out.print(addNewElement.data + " ");
       addNewElement=addNewElement.next;

       }


   }

public static void addElementToEnd(int data){    
    if (head ==null) {
        Node newElement =new Node(data);
        head=newElement;
       
    }else{
        Node newElement =new Node(data);
        Node temp=head;
        while(temp.next !=null){           
            temp=temp.next;
        }
        temp.next=newElement;

    }


}
/*
h=null
h=1 2 3 4 5
h= 2 3 4 5 
*/
public static void deleteFirstElement(){
    while (head ==null) {
        System.out.println("Can not fiend Elements");    
        
    }
    head=head.next;
    
}
public static void deleteLostElement(){
    while(head ==null){
        System.out.println("Not getting Element!");
        return;
    }
    if (head.next ==null) {
        head=null;
        return;
    }
    Node lostSecondElement=head;
    Node lostElement=head;
    if (lostElement.next !=null) {
        lostElement=lostElement.next;
        lostSecondElement=lostSecondElement.next;        
    }
    lostSecondElement.next=null;
}

public static int count() {
    Node temp = head;
    int count = 0;
    while (temp != null) {
        count++;
        temp = temp.next;

    }

    return count;
}
public static void reverseElements(){
    if(head ==null || head.next==null){
        return;
    }
    Node prevsNode=head;
    Node currNode=head.next;
    while (currNode !=null) {
        Node newNode=currNode.next;
        currNode.next=prevsNode;

        //update 
        prevsNode=currNode;
        currNode=newNode;
    }
    head.next=null;
    head=prevsNode;
}
    public static void main(String[] args) throws Exception {        
    Node a=new Node(4);
    Node b=new Node(6);
    Node c=new Node(8);
    Node d=new Node(9);
    head=a;
    a.next=b;
    b.next=c;
    c.next=d;
    
    printData();
reverseElements();
printData();


  
    }
 
    
}
