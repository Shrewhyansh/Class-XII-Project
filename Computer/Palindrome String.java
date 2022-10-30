import java.util.*;

class palin_string

{

    boolean isPalindrome(String x)

    {

        String rev = "";

        boolean ans = false;

        for (int i = x.length() - 1; i >= 0; i--) {

            rev = rev + x.charAt(i);

        }

        if (x.equals(rev)) 

        {

            ans = true;

        }

        return ans;

    }

    void main()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string to be checked");

        String x = sc.next();

        x= x.toLowerCase();

        boolean A = isPalindrome(x);

        System.out.println(A);

        if(A==true)

        System.out.println("Entered string is Palindrome");

        else

        System.out.println("Entered string is not Palindrome");

    }

}

