package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String contin = "Y";
        int total = 0;


        System.out.println("Hello User. ");
        System.out.println("Welcome to Batting Average Calculator! ");


        do 
            try {
            String playerName;
            System.out.print("Please enter Player Name: ");
            playerName = scan.nextLine();

            System.out.print("Enter number of at bats: ");
            int atBats;
            atBats = scan.nextInt();

            double basesEarned = 0.0;
            int bases = 0;

            int[] earnedBases = new int[atBats];
            System.out.println();
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

            for (int i = 0; i < atBats; i++) {
                System.out.print("Result for at-Bat " + (i + 1) + ":: ");
                earnedBases[i] = scan.nextInt();

                if (earnedBases[i] > 4 || earnedBases[i] < 0) {
                    do {
                        System.out.println("Invalid entry.");
                        System.out.print("Please enter a whole number between 0-4: ");
                        earnedBases[i] = scan.nextInt();
                    } while (earnedBases[i] > 4 || earnedBases[i] < 0);
                }
                bases += earnedBases[i];

                if (earnedBases[i] > 0) {
                    basesEarned++;
                }
            }
            System.out.println();
            double battingAvg = 0.000;
            if (basesEarned > 0 && atBats > 0) {
                battingAvg = basesEarned / (double) atBats;
            }
            String avg = String.format("%.3f", battingAvg);
            double sluggingPercentage = 0.000;
            sluggingPercentage = bases / (double) atBats;

            String slug = String.format("%3f", sluggingPercentage);
            System.out.println(playerName + " 's batting average; " + avg);
            System.out.println(playerName + " 's slugging percentage: " + slug);
            System.out.println();

            System.out.println("Would you like Another batter? (y/n): ");
            scan.nextLine();
            contin = scan.nextLine();
        } catch (Exception e) {
            System.out.println(" Error Stop!! Please restart. ");

        } while (contin.contains("Y") || contin.contains(","));
        System.out.println(" Thanks for Playing! ");
    }
}
