import java.util.*;

class Goldbach_Number

{

    void main()

    {

        Scanner in= new Scanner(System.in);

        int i,j,n,p,b=0,c=0,s=0;

        System.out.println("Enter Number");

        n=in.nextInt(); 

        p=n; 

        int ar[]=new int[n];

        int br[]=new int[n];

        if(n%2!=0)

        {

            System.out.println("Invalid Input, Number is Odd "+n); 

        }

        else

        {

            for(i=1;i<=n;i++) 

            {

                for(j=1;j<=i;j++)

                {

                    if(i%j==0) 

                    {

                        c++; 

                    }

                }

                if((c==2)&&(i%2!=0)) 

                {

                    ar[b]=i; 

                    br[b]=i; 

                    b++; 

                }

                c=0; 

            }

            System.out.println("Prime Pairs are :- ");

            for(i=0;i<b;i++)

            {

                for(j=i;j<b;j++)

                {

                    s=ar[i]+br[j]; 

                    if(s==p) 

                    {

                        System.out.print(ar[i]+","+br[j

                        System.out.println();

                    }

                } 

            }

            System.out.println("It is GoldBach Number "+p);

        }

    } 

} 

