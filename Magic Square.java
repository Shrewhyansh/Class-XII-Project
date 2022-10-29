import java.util.*;

class magic_square

{

    void main()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an odd number:");

        int n=sc.nextInt();

        int c=n/2;int r=n-1;

        int ar[][]=new int[n][n];

        ar[r][c]=1;

        for(int i=2;i<=n*n;i++)

        {

            if(ar[(r+1)%n][(c+1)%n]==0)

            {

                r=(r+1)%n;

                c=(c+1)%n;

            }

            else

            {

                r=(r-1+n)%n;

            }

            ar[r][c]=i;

        }

        for(int i=0;i<n;i++)

        {

            for(int j=0;j<n;j++)

            {

                if(ar[i][j]<10) 

                System.out.print("0"+ar[i][j]+"  ");

                else

                System.out.print(ar[i][j]+"  ");

            }

            System.out.println();

        }

    }

}

