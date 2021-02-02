package com.company;

import java.util.Scanner;

public class Targil3 {
    public static void main(String[] args) {
        boolean flaght = true;
        int i;


        Scanner S = new Scanner(System.in);

        for(int j = 1; j <= 100; j++) {

            i= 2;
            flaght = true;
            while(i <= j/i && flaght == true) {
                if(j % i == 0) {
                    flaght = false;
                }
                i++;
            }
            if(flaght == true) {
                System.out.println("prime number" + j);
            }

            S.close();
        }

    }
}

