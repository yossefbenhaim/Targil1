package com.company;
import java.util.Scanner;
public class Targil1 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number");
        num = s.nextInt();
        System.out.println(prime(num));
    }

    public static boolean prime(int num) {
        boolean prime = true;
        for(int i = 2; i < num/2; i++) {
            if(num % i == 0) {
                prime = false;
            }


        }
        return prime;

    }
}
