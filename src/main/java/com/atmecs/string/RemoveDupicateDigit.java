package com.atmecs.string;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupicateDigit
{
    static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string");
        String input = scanner.nextLine();
       // char str[] = "Atmecs123123".toCharArray();
        char str[] = input.toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}


