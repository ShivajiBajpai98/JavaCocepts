package com.atmecs.string;

import java.util.Scanner;

public class RemoveDuplicateDigitFromString {


    int numbers;
    int[] digits;

    public void getNbr(String str) {
        // Replace each non-numeric number with a space
        str = str.replaceAll("[^\\d]", " ");
        // Remove leading and trailing spaces
        str = str.trim();
        // Replace consecutive spaces with a single space
        str = str.replaceAll(" +", " ");


        // str;


        String str1 = str.replaceAll("\\s", "");
        //  this.number = str1;
        // System.out.println(str);

        int i = Integer.parseInt(str1);
        this.numbers = i;


        int num = i;
        this.digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        for (int d : digits)

            System.out.println(d);


    }

    public void anotherTry() {

        int number = numbers;
//while loop executes until the condition become false
        while (number > 0) {
            int digit = number % 10;
//prints space between the digits
            System.out.print(" ");
//prints the digits
            System.out.print(digit);
//dividing the number by 10
            number = number / 10;


        }
    }


// Java Program to Remove Duplicate Elements
// From the Array using extra space


    public int removeduplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

   /* public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 2};
        int n = a.length;

        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ")*/;


    public int removeDuplicates(int a[], int n) {
        // if(array size if 0 or 1 array is already sorted)
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;

        // check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element
        // will only be added once in the array
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[n - 1];

        return j;
    }







        public static void main (String[]args)
        {
            String string = "texte321 paragraphe12 569 lorem";
            String str = "texte321 paragraphe12 569 lorem";

            RemoveDuplicateDigitFromString obj = new RemoveDuplicateDigitFromString();
            obj.getNbr(str);
            //  System.out.println(obj.numbers);
            // obj.another();


/*

            int a[] = obj.digits;
            int n = a.length;

            n = obj.removeduplicates(a,n);

            // Printing The array elements
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
*/









         //   int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
            int a [] = obj.digits;

            int n = a.length;

            int j=0;

            // the function will modify the array a[]
            // such that the starting j elements
            // will be having all unique elements
            // and no element will be appearing more than
            // once
            j = obj.removeDuplicates(a, n);

            // printing array elements
            for (int i = 0; i < j; i++)
                System.out.print(a[i] + " ");


        }
}