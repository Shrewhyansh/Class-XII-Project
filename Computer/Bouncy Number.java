

 

 

 

 






import java.util.*;

class BouncyNumber

{

    public static void main()

    {

        Scanner sc= new Scanner (System.in);

        System.out.println("Enter a number :");

        int a=sc.nextInt();

        String num=Integer.toString(a);

        int in=1,dc=1;

        for(int i=0;i<num.length()-1;i++)

        {

            char ch=num.charAt(i);

            char ch2=num.charAt(i+1);

            if(ch<=ch2)

                in++;

            if(ch>=ch2)

                dc++;

        }

        if(in==num.length())

            System.out.println("The number "+a+" is Increasing and Not Bouncy");

        else if(dc==num.length())

            System.out.println("The number "+a+" is Decreasing and Not Bouncy");

        else

            System.out.println("The number "+a+" is Bouncy");

    }

}
