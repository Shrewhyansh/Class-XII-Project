

import java.util.*;

class Paragraph

{

    public static String sort(String s)

    {

        int l=s.length();

        char lc=s.charAt(l-1);

        s=s.substring(0,l-1)+" ";

        StringTokenizer st=new StringTokenizer(s);

        int wc=st.countTokens();

        String t[]=new String[wc];

        for(int i=0;i<wc;i++)

            t[i]=st.nextToken();

        for(int i=0;i<wc-1;i++)

        {

            for(int j=0;j<wc-1-i;j++)

            {

                if(t[j].compareTo(t[j+1])>0)

                {

                    String x=t[j];

                    t[j]=t[j+1];

                    t[j+1]=x;

                }

            }

        } 

        String r="";

        for(int i=0;i<wc;i++)

            r=r+t[i]+" ";

        r=r+lc;

        return r;

    }

    public static void main()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the paragraph : ");

        String a=sc.nextLine();

        a=a.toUpperCase();

        String k[]=new String[50];

        String sen="";

        int index=0;

        for(int i=0;i<a.length();i++)

        {

            char ch=a.charAt(i);

            if(ch!=',' && ch!='.' && ch!='?' && ch!='!')

                sen+=ch;

            else

            {

                k[index++]=sen.trim()+ch;

                sen="";

            }

        }

        for(int i=0;i<index;i++)

        {

            String r=sort(k[i]);

            System.out.print(r+" ");

        }

        System.out.println();

        System.out.print("VOWELS : ");

        for(int i=0;i<index;i++)

        {

            String tt=k[i];

            StringTokenizer st=new StringTokenizer(tt);

            int wc=st.countTokens();

            String t[]=new String[wc];

            for(int j=0;j<wc;j++)

            {

                t[j]=st.nextToken();

                char fc=t[j].charAt(0);

                if(fc=='A' || fc=='E' || fc=='I' || fc=='O' || fc=='U')

                    System.out.print(t[j]+" ");

            }

        }

        System.out.println();

    }

}
