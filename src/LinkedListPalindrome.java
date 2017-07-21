import java.util.Stack;

public class LinkedListPalindrome extends SumList{
    public boolean PalindromCheck(LinkedList a)
    {
        Stack<Node> stack= new Stack<Node>();
        Node ref1=a.head;
        Node ref2=a.head;
        while(ref1!=null)
        {
            stack.push(ref1);
            ref1=ref1.next;
        }
        Node temp=null;
        while(!stack.isEmpty())
        {
            if(ref2.data==stack.pop().data)
            {   ref2=ref2.next;
                continue;
            }
            else
            {
                return false;
            }
        }

        return true;
    }

    public static  void main(String[] args)
    {   LinkedListPalindrome test1=new LinkedListPalindrome() ;
    LinkedList test= new LinkedList();
        test.addtoList(4);
        test.addtoList(4);
        test.addtoList(4);
        if(test1.PalindromCheck(test))
        {
            System.out.println("Its a Palindrome");
        }
        else
        {
            System.out.println("Its not a palindrome");
        }

    }
}
