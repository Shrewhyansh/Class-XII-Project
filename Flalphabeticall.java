import java.util.*;

class alpha_initial

{

    void main()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER ANY SENTENCE :");

        String a=sc.nextLine();

        String n=a.toUpperCase();

        StringTokenizer st=new StringTokenizer(n); int o=st.countTokens();

        String m;char c;char b;String wrd="";

        String arr[]=new String[o];

        for(int i=0;i<o;i++)

        {

            arr[i]=st.nextToken();

        }

        for(int i=0;i<o;i++)

        {

            String u=arr[i]; 

            c=u.charAt(0); 

            int s=u.length()-1; 

            b=u.charAt(s); 

            wrd=wrd+c+b;

        }

        System.out.println(wrd); String str=""; 

        for(char ch='A';ch<'Z';ch++)

        {

            for(int i=0;i<wrd.length();i++)

            {

                if(wrd.charAt(i)==ch)

                {

                    str=str+wrd.charAt(i);

                }

            }

        }

        System.out.println(“Arranged letters in alphabetical order=”+str);

    }

}

