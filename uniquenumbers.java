import java.util.*;
public class uniquenumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!list.contains(x[i]))
            list.add(x[i]);
        }
        System.out.print(list);
    }
}
