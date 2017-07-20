package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String contin;
        int total =0;


        System.out.println("Hello User. ");
        System.out.println("Welcome to Batting Average Calculator! ");



        do {
            System.out.println("Please enter a number of at bats: ");
            int atBat = scan.nextInt();
            int[] bases = new int[atBat];
            int i = 0;

            for (i = 0; i < bases.length ; i++){
                System.out.println("Enter number of bases earned: ");
                bases[i] = scan.nextInt();
                total += bases[i];

            }

             double sluggingPercentage = (double)total / bases.length;
            System.out.printf("%.3f", sluggingPercentage);

                contin = scan.nextLine();
            }
            while (contin.contains("Y") || contin.contains("y")) ;
            System.out.println("Thanks, have a great day! ");
        }

    }

