import java.util.*;
public class missingnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int m=x[n-1];
        int j=0;
        for(int i=1;i<=m;i++)
        {
            if(x[j]!=i)
            {
                System.out.print(i+" ");
                
            }
            else
            j++;
            
        }
    }
}
