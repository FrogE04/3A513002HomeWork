package com.example.lib;

import java.util.Scanner;
    public class homework10 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("input:");
            char c = input.next().charAt(0);
            change(c);
        }

        private static void change(char c)
        {
            if(c>='A' && c<='Z')
            {
                c+=32;
                System.out.println("input"+(char)(c-32)+"change:"+c);
            }
            else if(c>='a' && c<='z')
            {  
                c-=32;
                System.out.println("input"+(char)(c+32)+"change:"+c);
            }
            else
            {
                System.out.println("Error");
            }
        }
}
