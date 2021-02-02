package com.company;

public class PerfektNomber {
    public static void main(String[] args) {
        boolean flaght = true;
        int num, sum = 0;

        for(num = 1; num < 1000000; num++) {


            for(int j = 1; num <= num - 1; j++) {
                if(num % j == 0) {
                    sum = sum + j;
                }
            }
            if(sum == num) {
                System.out.println(sum);
            }
            sum = 0;
        }
    }

}

