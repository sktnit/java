import java.util.LinkedList;
import java.util.Scanner;
class Node
{
    protected int data;
    protected Node next, prev;
    public Node()
    {
        next = null;
        prev = null;
        data = 0;
    }
    public Node(int d, Node n, Node p)
    {
        data = d;
        next = n;
        prev = p;
    }

    public void setLinkNext(Node n)
    {
        next = n;
    }
    public void setLinkPrev(Node p)
    {
        prev = p;
    }    

    public Node getLinkNext()
    {
        return next;
    }
    public Node getLinkPrev()
    {
        return prev;
    }
    public void setData(int d)
    {
        data = d;
    }
    public int getData()
    {
        return data;
    }
}

class linkedList
{
    public Node start;
    public Node end ;
    public int size;
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return start == null;
    }
    public int getSize()
    {
        return size;
    }
    public void insertAtEnd(int val, boolean doubly)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
        	if(doubly==true)
        		nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }
    public void display(boolean doubly)
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        if(doubly)
        	System.out.print(start.getData()+ " <-> ");
        else
        	System.out.print(start.getData()+ " --> ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
        	if(doubly)
        		System.out.print(ptr.getData()+ " <-> ");
        	else
        		System.out.print(ptr.getData()+ " --> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}


class LinkedListTest{
	//DyanmicBuild function
	static linkedList DynamicBuild(boolean doubly) {
		Scanner scan = new Scanner(System.in);
		linkedList list = new linkedList();
		while(true) {
			int ele= scan.nextInt();
			if(ele == -1)
				break;
			list.insertAtEnd(ele,doubly);
		}
		list.display(doubly);
		return list;
	}
	
	//inner_product function
	static void inner_product(linkedList ll_1, linkedList ll_2) {
		Node start_ll_1=ll_1.start;
		Node start_ll_2=ll_2.start;
		int size= Math.max(ll_1.size, ll_2.size);
		int count=0;
		while(start_ll_1!=null && start_ll_2!=null) {
			System.out.println(start_ll_1.getData() * start_ll_2.getData());
			start_ll_1= start_ll_1.getLinkNext();
			start_ll_2=start_ll_2.getLinkNext();
			count++;
		}
		if(count<size) {
			if(start_ll_1!=null) {
				while(start_ll_1.getLinkNext()!=null)
				{
					System.out.println(start_ll_1.getData());
					start_ll_1=start_ll_1.getLinkNext();
				}
			}	
			if(start_ll_2!=null){
				while(start_ll_2!=null)
				{
					System.out.println(start_ll_2.getData());
					start_ll_2=start_ll_2.getLinkNext();
				}
			}
		}
	}
	//Insert val at given position
    static void InsertList(linkedList list, int val , int pos,boolean doubly)
    {
        Node nptr = new Node(val, null, null);    
        if (pos == 1)
        {
            if(list.start == null)
            {
                list.start = nptr;
                list.end = list.start;
            }
            else
            {
                list.start.setLinkPrev(nptr);
                nptr.setLinkNext(list.start);
                list.start = nptr;
            }
            list.size++;
            return;
        }
        
        Node ptr = list.start;
        for (int i = 2; i <= list.size; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.getLinkNext();
                ptr.setLinkNext(nptr);
                if(doubly)
                	nptr.setLinkPrev(ptr);
                nptr.setLinkNext(tmp);
                tmp.setLinkPrev(nptr);
            }
            ptr = ptr.getLinkNext();            
        }
        list.size++ ;
        list.display(doubly);
    }
    //delete value from list 
    static void DeleteList(linkedList list, int val, boolean doubly) {
    	Node nptr = list.start;
    	if(nptr.getData()==val) {
    		
    		list.start=nptr.getLinkNext();
    		nptr.setLinkNext(null);
    		list.start.setLinkPrev(null);
    		list.size--;
    		list.display(doubly);
    		return;
    	}
    	
    	
    	for (int i = 2; i < list.size; i++)
        {
               nptr = nptr.getLinkNext();
          
                if(nptr.getData()==val)
                {
                	nptr.getLinkPrev().setLinkNext(nptr.getLinkNext());
                	nptr.getLinkNext().setLinkPrev(nptr.getLinkPrev());
                	nptr.setLinkNext(null);
                	nptr.setLinkPrev(null);
                	list.display(doubly);
                	return;
                }
        }
    	
    	
    }
    public static void main(String[] args)
    {            
        boolean doubly=true;
        System.out.println("When Doubly is true it prints Doubly Linked List");
        linkedList ll_1=DynamicBuild(doubly);//calling dynamic build  linked list 1
        doubly=true;
        System.out.println("When Doubly is true it prints Singly Linked List");
        linkedList ll_2=DynamicBuild(doubly);//calling dynamic build  linked list 2
        inner_product(ll_1, ll_2);//calling inner product
        InsertList(ll_1,3,2,doubly);//calling InsertList to insert 3 at position2
        DeleteList(ll_1, 4, doubly);
    }
}
