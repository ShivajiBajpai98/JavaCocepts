package com.atmecs.string;

import java.util.Scanner;

public class StringProgram
{
   /* public static void main(String args[])
    {
        String str, word;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");
        str = scan.nextLine();

        System.out.print("Enter a Word you want to Delete from the String : ");
        word = scan.nextLine();

        str = str.replaceAll(word, "");

        System.out.print("\nNew String is : ");
        System.out.print(str);
*/

  /*  public static void main(String[] args) {
        String str = " India is great";
       // String strNew = str.replace(" ", ""); //strNew is 'HelloWorldJavaUsers'
        String strNew = str.replace("in", ""); // strNew is 'bcdDCBA123'
        System.out.println(strNew);


    }*/


    // Java program to remove duplicates, the order of
// characters is not maintained in this program


        /*static final int NO_OF_CHARS = 256;

        *//* Returns an array of size 256 containing count
        of characters in the passed char array *//*
        static int[] getCharCountArray(String str)
        {
            int count[] = new int[NO_OF_CHARS];
            for (int i = 0; i < str.length(); i++)
                count[str.charAt(i)]++;

            return count;
        }

        *//* removeDirtyChars takes two
        string as arguments: First
        string (str) is the one from
        where function removes
        dirty characters. Second
        string is the string which
        contain all dirty characters
        which need to be removed
        from first string *//*
        static String removeDirtyChars(String str,
                                       String mask_str)
        {
            int count[] = getCharCountArray(mask_str);
            int ip_ind = 0, res_ind = 0;

            char arr[] = str.toCharArray();

            while (ip_ind != arr.length)
            {
                char temp = arr[ip_ind];
                if (count[temp] == 0) {
                    arr[res_ind] = arr[ip_ind];
                    res_ind++;
                }
                ip_ind++;
            }

            str = new String(arr);

		*//* After above step string is ngring.
		Removing extra "iittg" after string*//*

            return str.substring(0, res_ind);
        }

        // Driver Code
        public static void main(String[] args)
        {
            String str = "India is great ";
            String mask_str = "In";
            System.out.println(removeDirtyChars(str, mask_str));
        }*/



    public static void main(String [] args)
    {
        String s1 = "", s2 = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("\n Enter the String 1 : ");
        s1 =scan.nextLine();
        System.out.print("\n Enter the String 2 : ");
        s2 =scan.nextLine();

        String a = s1;
        String b = s2;
        char temp = s1.charAt(0);
        String search = "";
        String replace = "";

        for(int i= 0; i < s1.length(); i++)
        {
            temp = s1.charAt(i);
            search = Character.toString(temp);

            for(int j = 0; j < s2.length(); j++)
            {
                if(temp == s2.charAt(j))
                {
                    a = a.replace(search, replace);
                    b = b.replace(search, replace);
                }
            }
        }

        System.out.println("\n Common Characters Removed String 1 : " + a);
        System.out.println("\n Common Characters Removed String 2 : " + b);

    }





    }




