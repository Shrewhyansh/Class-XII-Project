

import java.util.*;

class BinarySearch

{

    int a[],size;

    Scanner sc=new Scanner(System.in);

    BinarySearch(int s)

    {

        size=s;

        a=new int[size];

    }

    void accept()

    {

        System.out.println("Enter number in ascending order ");

        for(int i=0;i<size;i++)

        {

            System.out.print("Enter the number : ");

            a[i]=sc.nextInt();

        }

    }

    void check()

    {

        System.out.print("Enter the search number : ");

        int num=sc.nextInt();

        if(search(0,size-1,num)==true)

            System.out.println("Number Present");

        else

            System.out.println("Number not Present");

    }

    public boolean search(int b, int e, int num)

    {

        if(b>e)

            return false;

        else

        {

            int m=(b+e)/2;

            if(a[m]==num)

                return true;

            else if(num>a[m])

                return search(m+1,e,num);

            else

                return search(b,m-1,num);

        }

    } 

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the order : ");

        int n=sc.nextInt();

        BinarySearch ob=new BinarySearch(n);

        ob.accept();

        ob.check();

    }

}
