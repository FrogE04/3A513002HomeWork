package com.example.lib;

public class homework6 {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("input Year :");
        int inp=scanner.nextInt();

        if(inp%4==0)
            System.out.println("Yes!It'is Leap year");
        else
            System.out.println("NO!It'is N year");
    }
}
