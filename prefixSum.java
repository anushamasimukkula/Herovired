import java.util.Arrays;
class prefixSum
{
   public static void main(String args[ ])
   {
     
      int y[ ]={3,7,25,36,12};
      int[] prefix = new int[y.length];
      prefix[0] = y[0];
      for(int i=1;i<y.length;i++)
      {
         prefix[i] = prefix[i - 1] + y[i];
         
      }
      System.out.println(Arrays.toString(prefix));

   }
}
