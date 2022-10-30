import java.util.*;

class Mirror_Image_Of_2D_Array

{

    void main()

    {   Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number of rows :");

        int r=sc.nextInt();

        System.out.println("Enter the Number of Columns :");

        int c=sc.nextInt();

        int arr[][]=new int[r][c];     int arr1[][]=new int[r][c];

        System.out.println("Enter the Elements :");

        for(int i=0;i<r;i++)

        {   for(int j=0;j<c;j++)

            {

                arr[i][j]=sc.nextInt();

            }

        }

        System.out.println("Original Array ");

        for(int i=0;i<r;i++)

        {   for(int j=0;j<c;j++)

            {

                System.out.print(arr[i][j]+"  ");

            }

            System.out.println();

        }

        System.out.println("Mirror Image :");

        for(int i=0;i<r;i++)

        {

            int z=c-1;

            for(int j=0;j<c;j++)

            {

                arr1[i][j]=arr[i][z--];

            }

        }

        for(int i=0;i<r;i++)

        {   for(int j=0;j<c;j++)

            {

                System.out.print(arr1[i][j]+"  ");

            }

            System.out.println();

        }

    }

}

