package com.atmecs.string;

class Main
{
    public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args)
    {
       // String str = "XYBYBYX";
       // String str = "s1221s";
        String str2 = "sSs1221SsS";
      String str=  str2.toUpperCase();


        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
