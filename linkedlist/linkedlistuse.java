package linkedlist;

public class linkedlistuse {
    public static Node<Integer> createlinkedlist(){
        Node<Integer> n1;
        n1=new Node<Integer>(10);
        Node<Integer> n2=new Node<Integer>(20);
        Node<Integer> n3=new Node<Integer>(30);
        Node<Integer> n4=new Node<Integer>(40);

        n1.next=n2;
      //  System.out.println("n1:"+n1+"data:"+n1.data+"next:"+n1.next);
        n2.next=n3;
        // System.out.println("n2:"+n2+"data:"+n2.data+"next:"+n2.next);
         n3.next=n4;
        // System.out.println("n3:"+n3+"data:"+n3.data+"next:"+n3.next);
        // System.out.println("n4:"+n4+"data:"+n4.data+"next:"+n4.next);
        return n1;
    }
    public static void print(Node<Integer> head)
    {
       // System.out.println("print "+head);
       Node<Integer> temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
        //temp=head;
        // while(head!=null)
        // {
        //     System.out.print(head.data+"->");
        //     head=head.next;
        // }
        

    //    System.out.println(head.data);
    //    System.out.println(head.next);
    //    System.out.println(head.next.data);
    //    System.out.println(head.next.next.data);
    }

    public static void main(String[] args)
    {
        // Node<Integer> n1=new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
        Node<Integer> head=createlinkedlist();
        
        //System.out.println("main "+ head);
         print(head);
        // print(head);
    }
    
}
