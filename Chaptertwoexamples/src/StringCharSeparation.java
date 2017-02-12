import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringCharSeparation
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        for(int i=0; i<st.length(); i++) {
            System.out.print(st.charAt(i) + " ");
        }

    }
}