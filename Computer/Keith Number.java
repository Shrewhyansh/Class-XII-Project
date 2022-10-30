
import java.util.*;
class Keith_number
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        String num=Integer.toString(n);
        int l=num.length();
        int a[]=new int[l];
        int cpy=n;
        int i=l-1;
        while(n>0)
        {
            int d=n%10;
            a[i]=d;
            i--;
            n=n/10;
        }
        int s=0;
        while(true)
        {
            s=0;
            for( i=0;i<l;i++)
                s=s+a[i];
            if(s<cpy)
            {
                for(i=0;i<l-1;i++)
                    a[i]=a[i+1];
                a[l-1]=s;
            }
            else
                break;
        }
        if(s==cpy)
            System.out.println("Keith Number ");
        else
            System.out.println("Not a Keith Number ");
    }
}
