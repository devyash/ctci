import java.util.Stack;

public class SumList {
    public static  class Node
    {
        Node next=null;
        int data;
        public Node(int d)
        {
            this.data=d;

        }
    }
    public static class LinkedList {
        Node head=null;
        public void addtoList(int d) {
            Node temp = new Node(d);
            if (this.head == null) {

                head = temp;
            } else {
                Node reference = head;
                while (reference.next != null) {
                    reference = reference.next;
                }
                reference.next = temp;
            }
        }

        public void display() {
            Node ref = head;
            while (ref != null) {
                System.out.println(ref.data);
                ref=ref.next;

            }
        }
    public LinkedList addlist(LinkedList b,LinkedList c)
    {
        Node head1=b.head;
        Node head2=c.head;
        LinkedList result=new LinkedList();
        int carry=0;
        int sum=0;
        while(head1!=null && head2!=null)
        {


            sum=(head1.data+head2.data+carry);
            carry=(sum)/10;
            sum=sum%10;

            result.addtoList(sum);
            head1=head1.next;
            head2=head2.next;

        }
        while(head1!=null)
        {   System.out.println("IN loop 1");
            sum=(head1.data+carry);
            carry=(sum)/10;
            sum=sum%10;
            result.addtoList(sum);
            head1=head1.next;
        }
        while(head2!=null)
        {   System.out.println("In Loop2");
            sum=(head2.data+carry);
            carry=(sum)/10;
            sum=sum%10;
            result.addtoList(sum);
            head2=head2.next;
        }
        if(carry>0)
        {
            result.addtoList(carry);
        }
        return result;
    }


public LinkedList addListinreverse(LinkedList b,LinkedList c)
{
    Stack<Node> stack1=new Stack<Node>();
    Stack<Node> stack2=new Stack<Node>();
    Stack<Node> stack3=new Stack<Node>();
    Node head1=b.head;
    Node head2=c.head;
    LinkedList result=new LinkedList();
    int carry=0,sum=0;
    while(head1!=null)
    {
        stack1.push(head1);
        head1=head1.next;
    }
    while(head2!=null)
    {
        stack2.push(head2);
        head2=head2.next;
    }
    while(!stack1.isEmpty()&&!stack2.isEmpty())
    {
        sum=(stack1.pop().data+stack2.pop().data+carry);

        carry=sum/10;
        sum=sum%10;
        Node temp=new Node(sum);
        stack3.push(temp);


    }
    while(!stack1.isEmpty())
    {
        sum=(stack1.pop().data+carry);
        carry=sum/10;
        sum=sum%10;
        Node temp=new Node(sum);
        stack3.push(temp);
    }
    while(!stack2.isEmpty())
    {
        sum=(stack2.pop().data+carry);
        carry=sum/10;
        sum=sum%10;
        Node temp=new Node(sum);
        stack3.push(temp);
    }
    if (carry>0)
    {
        Node temp=new Node(carry);
        stack3.push(temp);
    }
    while(!stack3.isEmpty())
    {
        result.addtoList(stack3.pop().data);
    }
    return result;
}
    }

//    public static void main(String[] args)
//        {
//    LinkedList test= new LinkedList();
//    LinkedList test2=new LinkedList();
//    test.addtoList(5);
//    test.addtoList(6);
//    test.addtoList(9);
//    test2.addtoList(7);
//    test2.addtoList(8);
//    test2.addtoList(9);
//    test2.addtoList(5);
//
//
//    LinkedList result=test.addListinreverse(test,test2);
//    result.display();
//
//
//}

}
