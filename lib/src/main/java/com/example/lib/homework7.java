package com.example.lib;

public class homework7 {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);
        int inp,sum;

        System.out.println("input N:");
         inp=scanner.nextInt();
         sum=0;
        for (int n=1;n<=inp;n++)
        {
            sum+=n;
        }
        System.out.println("The 1 add to N Ans:"+sum);
    }
}
