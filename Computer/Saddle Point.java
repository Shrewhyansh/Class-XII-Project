

import java.util.*;

public class SaddlePoint

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        System.out.print(" N = ");

        int n=sc.nextInt();

        if(n<20)

        {

            int a[][]=new int[n][n];

            for(int i=0;i<n;i++)

            {

                for(int j=0;j<n;j++)

                {

                    System.out.print("Enter Number : ");

                    a[i][j]=sc.nextInt();

                }

            }

            System.out.println("Original Matrix ");

            for(int i=0;i<n;i++)

            {

                for(int j=0;j<n;j++)

                {

                    System.out.print(a[i][j]+"\t");

                }

                System.out.println();

            }

            int min,max,f=0;

            for(int i=0;i<n;i++)

            {

                min=a[i][0];

                int p=0;

                for(int j=0;j<n;j++)

                {

                    if(a[i][j]<min)

                    {

                        min=a[i][j];

                        p=j;

                    }

                }

                max=a[0][p];

                for(int j=0;j<n;j++)

                {

                    if(a[j][p]>max)

                        max=a[j][p];

                }

                if(max==min)

                {

                    System.out.println("SADDLE POINT = "+max+" ("+i+", " +p+")");

                    f=1;

                    break;

                }

            }

            if(f==0)

                System.out.println("NO SADDLE POINT ");

        }

        else

            System.out.println("INVALID ORDER ");

    }

}
