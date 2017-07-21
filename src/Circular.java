import java.util.HashMap;

public class Circular extends SumList {
    public void createCircular(LinkedList a)
    {   int i=4;                        //Creating a Random Circular List
        Node ref=a.head;
        Node ref1=a.head;

        ref=ref.next.next;
        while(i>0)
        {   i--;
            ref1=ref1.next;

        }
        ref1.next=ref;
    }

public Node Checkcircular(LinkedList a)
{
    Node slow=a.head;
    HashMap<Node,Integer> map=new HashMap<Node, Integer>();


    while(slow!=null)
    {
       if(map.containsKey(slow))
       {
           return slow;
       }
       else
       {
           map.put(slow,1);
           slow=slow.next;
       }
    }
return null;
}
public static  void main(String[] args)
{
    LinkedList test= new LinkedList();
    test.addtoList(3);
    test.addtoList(5);
    test.addtoList(6);
    test.addtoList(9);
    test.addtoList(5);
    test.addtoList(3);
    Circular test1=new Circular();
    test1.createCircular(test);
    Node result=test1.Checkcircular(test);
    System.out.println(result.data);

}
}
