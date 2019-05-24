public class MyQueue
{
    protected Node start;
    protected Node end;
    protected int size;
    MyQueue()
    {
        start=null;
        end=null;
        size=0;
    }
    public boolean isEmpty()
    {
        return start==null;
    }
    public int getSize()
    {
        return size;
    }
    public void insertToStart(int val)
    {
        Node ptr=new Node(val,null);
        size++;
        if(start==null)
        {
            start=ptr;
            end=start;
        }
        else
        {
            ptr.setLink(start);
            start=ptr;
        }
    }
    public void insertToEnd(int val)
    {
        Node ptr = new Node(val,null);
        size++ ;
        if(start == null)
        {
            start = ptr;
            end = start;
        }
        else
        {
            end.setLink(ptr);
            end = ptr;
        }
    }
    public void insertToPos(int val,int pos)
    {
        Node ptr = new Node(val,null);
        Node pptr=start;
        pos=pos-1;
        for(int i=1;i<size;i++)
        {
            if(i==pos)
            {
                Node temp=pptr.getLink();
                pptr.setLink(ptr);
                ptr.setLink(temp);
                break;
            }
            pptr=pptr.getLink();
        }
        size++;
    }
    public void deleteFromPos(int pos)
    {
        if (pos == 1)
        {
            start = start.getLink();
            size--;
            return ;
        }
        if (pos == size)
        {
            Node s = start;
            Node t = s;
            while (s != end)
            {

                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        Node pptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++)
        {
            if (i == pos)
            {
                Node temp = pptr.getLink();
                temp = temp.getLink();
                pptr.setLink(temp);
                break;
            }
            pptr = pptr.getLink();
        }
        size-- ;
    }
    public void display()
    {
        System.out.print("Singly LinkedList = ");
        if(size==0)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(start.getLink()==null)
        {
            System.out.print(start.getData());
            return;
        }
        Node pptr = start;
        System.out.print(start.getData()+" ");
        pptr = start.getLink();
        while (pptr.getLink() != null)
        {
            System.out.print(pptr.getData()+" ");
            pptr = pptr.getLink();
        }
        System.out.print(pptr.getData()+ "\n");
    }
}
