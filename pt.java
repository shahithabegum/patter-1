import java.util.*;
class pt	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,l,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=n;i>=1;i--)
             {
                   for(j=1;j<=i;j++)
                    {
                                System.out.print(j);
                    }
                     System.out.println();
               }
            for(l=1;l<=n;l++)
	{
	   for(k=1;k<=l;k++)
	       {
                           System.out.print(k);
	         }
	           System.out.println();
	}
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
