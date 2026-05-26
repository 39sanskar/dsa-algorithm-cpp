package if_else;

// Program to check Profit or Loss

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking Cost Price input
        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();

        // Taking Selling Price input
        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();

        // Checking Profit
        if (sellingPrice > costPrice) {

            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;

            System.out.println("Seller made a PROFIT");
            System.out.println("Profit Amount = " + profit);
            System.out.println("Profit Percentage = " + profitPercentage + "%");
        }

        // Checking Loss
        else if (costPrice > sellingPrice) {

            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;

            System.out.println("Seller incurred a LOSS");
            System.out.println("Loss Amount = " + loss);
            System.out.println("Loss Percentage = " + lossPercentage + "%");
        }

        // No Profit No Loss
        else {

            System.out.println("No Profit No Loss");
        }

        // Closing scanner
        sc.close();
    }
}

