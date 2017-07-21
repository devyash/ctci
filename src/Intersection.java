public class Intersection extends SumList {

    public int getlength(LinkedList A)
    {
        Node ref=A.head;
        int length=1;
        while(ref!=null)
        {
            ref=ref.next;
            if(ref!=null)
            {
                length+=1;
            }
        }
    return length;
    }
    public void createintersection(LinkedList a, LinkedList b)
    {
        Node ref1=a.head;
        Node ref2=b.head;
        int i=3;
        while(i>0)
        {
            ref1=ref1.next;
            i--;
        }
        i=4;
        while(i>0)
        {
            ref2=ref2.next;
            i--;
        }
        ref1.next=ref2;
    }

public Node interesection(LinkedList a,LinkedList b)
{
    Node ref=a.head;
    Node ref1=b.head;
    int alength=getlength(a);
    int blength=getlength(b);
    if(alength>blength)
    {
        while(alength-blength!=0)
        {
            ref=ref.next;
            alength--;
        }
    }
    else
    {
        if(blength>alength)
        {
            while(blength-alength!=0)
            {
                ref1=ref1.next;
            }
        }
    }

    while(ref1!=null && ref!=null)
    {
        if(ref1==ref)
        {
            return ref;
        }
        else
        {
            ref1=ref1.next;
            ref=ref.next;
        }
    }
    return null;
}

public static void main(String[] args)
{
    Intersection test1= new Intersection();
    LinkedList test= new LinkedList();
    test.addtoList(3);
    test.addtoList(5);
    test.addtoList(6);
    test.addtoList(9);
    test.addtoList(5);
    test.addtoList(3);
    LinkedList test2= new LinkedList();
    test2.addtoList(9 );
    test2.addtoList(3);
    test2.addtoList(2);
    test2.addtoList(1 );
    test2.addtoList(-1);
    test2.addtoList(7);
    test2.addtoList(5 );
    test2.addtoList(-3);
    test2.addtoList(-2);

    test1.createintersection(test,test2);


    Node result=test1.interesection(test,test2);
    System.out.println(result.data);

}
}
