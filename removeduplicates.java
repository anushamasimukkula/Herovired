import java.util.*;
class Node
{
  int dt;
  Node nxt;
  public Node(int dt)
  {
    this.dt=dt;
    nxt=null;
  }
}
class removeduplicates
{
  public static void displaylist(Node head)
  {
     Node temp=head;
     while(temp.nxt!=null)
     {
        System.out.print(temp.dt+"-->");
        temp=temp.nxt;
     }
     System.out.println(temp.dt);
  }
  
 public static Node removeduplicatesele(Node head)
 {
     HashSet<Integer> hs=new HashSet<>();
     Node temp=head,prev=null;
     if(head==null)
       return null;
     if(head.nxt==null)
       return head;
     while(temp!=null)
     {
         int value=temp.dt;
         if(!hs.contains(value))
          {
            hs.add(value);
            prev=temp;
            temp=temp.nxt;
          }
          else
          {
            prev.nxt=temp.nxt;
            temp=temp.nxt;
          }
     }
    return head;
 }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     Node head=null;
     int n=sc.nextInt();
     int elem;
     
     while(n-->0)
     {
        elem=sc.nextInt();
        Node list=new Node(elem);
        if(head==null)
             head=list;
        else
         {
            Node curt=head;
	    while(curt.nxt!=null)
	       curt=curt.nxt;
	    curt.nxt=list;
            
         }
     }
     displaylist(head);
     head=removeduplicatesele(head);
     displaylist(head); 
  }
}