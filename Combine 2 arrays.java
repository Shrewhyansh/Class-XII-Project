

import java. util.*;

class Combine

{

    int com [], size;

    public Combine(int nn)

    {

        size = nn;

        com = new int [size];

    }

    void input_array()

    {

        Scanner sc=new Scanner(System.in);

        int i;

        for(i = 0; i < size; i++)

        {

            System.out.print ("Enter a no.");

            com [i] = sc.nextInt();

        }

    }

    void sort()



    {

        int i, j, t;

        for(i = 0; i < size; i++)

        {

            for(j = i + 1; j < size; j++) 

            { 

                if(com[i] > com [j])

                {

                    t = com [i];

                    com [i] = com [j];

                    com [j] = t;

                }

            }

        }

    }

    void mix(Combine A, Combine B)

    

    {

        int i, j;

        for (i = 0, j = 0; i < A.size; i ++, j++)

        {

            com[j] = A.com[i];

        }

        for (i = 0; i < B.size; i++, j++)

        {

            com [j] = B.com [i];

        }

    }

    void display()

    {

        int i;

        for (i = 0; i < size; i ++)

        {

            System.out.println(com[i]);

        }

    }

    public static void main(String args [ ]) 

    {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of elements for first array : ");

        int m=sc.nextInt();

        System.out.print("Enter no. of elements for second array : ");

        int n=sc.nextInt();

        Combine c1 = new Combine(m);

        Combine c2 = new Combine(n);

        Combine c3 = new Combine(m+n);

        System.out.println("Elements for first array : ");

        c1.input_array();

        System.out.println("Elements for second array : ");

        c2.input_array();

        c3.mix (c1, c2);

        c3.sort();

        System.out.println("Merge Eleemnts ");

        c3.display();

    }

}
