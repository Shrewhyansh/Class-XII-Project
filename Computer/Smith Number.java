

 

 

 

 

 

 

 

import java.util.*;

class Smith_Number

{

    public static int sod(int n)

    {

        int s=0;

        while(n>0)

        {

            int d=n%10;

            s=s+d;

            n=n/10;

        }

        return s;

    }

    public static boolean check(int n)

    {

        int cpy=n;

        int i=2,s=0; 

        while(i<=n)

        {

            if(n%i==0)

            {

                s=s+sod(i);

                n=n/i;

            }

            else

                i++;

        }

        if(sod(cpy)==s)

            return true;

        else

            return false;

    }

    public static void main()

    {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the range : ");

        int n=sc.nextInt();

        System.out.println("All the Smith Numbers from 1 to "+n+" : ");

        for(int i=1;i<=n;i++)

        {

            if(check(i)==true)

                System.out.print(i+" ");

        }

        System.out.println();

    }

}
