class mergelist{
    static node h1 = null;
    static node h2 = null;
    static class node
    {
    int dt;
    node nxt;
    };
    static void setdt(node head)
    {
    node temp;
    temp = head;
    while (temp != null)
    {
        System.out.print(temp.dt + " ");
        temp = temp.nxt;
    }
    }
    static node getdt(node head, int num)
    {
    node temp = new node();
    node tail = head;
    temp.dt = num;
    temp.nxt = null;
    if (head == null)
    {
        head = temp;
        tail = temp;
    }
    else
    {
        while (tail != null)
        {
        if (tail.nxt == null)
        {
            tail.nxt = temp;
            tail = tail.nxt;
        }
        tail = tail.nxt;
        }
    }
    return head;
    }
    static node mergelst()
    {
    node tail = h1;
    while (tail != null)
    {
        if (tail.nxt == null &&
            h2 != null)
        {
        tail.nxt = h2;
        break;
        }
        tail = tail.nxt;
    }
    return h1;
    }
    
    static void sortlst()
    {
    node curt = h1;
    node temp = h1;
    while (curt.nxt != null)
    {
        temp = curt.nxt;
        while (temp != null)
        {
        if (temp.dt < curt.dt)
        {
            int t = temp.dt;
            temp.dt = curt.dt;
            curt.dt = t;
        }
        temp = temp.nxt;
        }
        curt = curt.nxt;
    }
    }
    

    public static void main(String[] args)
    {
    
    h1 = getdt(h1, 30);
    h1 = getdt(h1, 25);
    h1 = getdt(h1, 10);
    h1 = getdt(h1, 3);
    h1 = getdt(h1, 88);
    h1 = getdt(h1, 56);
    
    h2 = getdt(h2,86 );
    h2 = getdt(h2, 2);
    h2 = getdt(h2, 90);
    h2 = getdt(h2, 29);
    h2 = getdt(h2,24 );
    h2 = getdt(h2, 10);

    h1 = mergelst();
    sortlst();
    setdt(h1);
    }
  }
