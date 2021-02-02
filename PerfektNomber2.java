package com.company;

import java.util.Scanner;

public class PerfektNomber2 {
    public static void main(String[] args) {

        boolean flaght = false;
        int num, sum = 0;
        int j;
        Scanner S = new Scanner(System.in);

        for(num = 1; num < 10000; num++) {


            j=1;
            flaght = false;
            while ( num <= num - 1 && flaght == false) {
                if(num % j == 0) {
                    sum = sum + j;
                    flaght = true;
                }
                j++;
            }
            if(flaght == true) {
                System.out.println("this is perfect number" + sum);
            }
            sum = 0;
            S.close();
        }
    }

}

