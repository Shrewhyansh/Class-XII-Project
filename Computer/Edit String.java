import java.util.*;

class menu

{

    void main()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");

        String a=sc.nextLine();

        System.out.println("    Menu Driven     ");

        System.out.println("1. Append a string ");

        System.out.println("2. Remove a String ");

        System.out.println("3. Insert a String ");

        System.out.println("4. To exit the program ");

        System.out.print("Enter your choice: ");

        int n=sc.nextInt();

        StringBuffer sb=new StringBuffer(a);

        switch(n)

        {

            case 1:

                System.out.print("Enter the String to append :");

                String s=sc.next();

                String s1=" " + s ;

                sb=sb.append(s1);

                System.out.println("New String : " + sb);

                break;

            case 2:

                System.out.println("Enter the string to delete :");

                String i=sc.next();

                int p=a.indexOf(i);

                int q=p+i.length()+1;

                sb=sb.delete(p,q);

                System.out.println("New String : "+sb);            

                break;

            case 3:

                StringTokenizer st=new StringTokenizer(a);

                int nim=st.countTokens();

                String arr[]=new String[nim];

                for(int l=0;l<nim;l++)

                {

                    arr[l]=st.nextToken();

                }

                System.out.println("Enter the position :");

                int pos=sc.nextInt();

                int pos_a=pos-1;

                String op=arr[pos];

                int ins=a.indexOf(op);

                System.out.println("Enter the String:");

                String y=sc.next();

                String iy=y+" ";

                sb=sb.insert(ins,iy);

                System.out.println("New String : " +sb);

                break;

            case 4:

                System.exit(0);

        }

    }

}

