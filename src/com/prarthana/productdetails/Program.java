/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productdetails;

import com.prarthana.productdetails.obj.ProductEntry;
import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Products = new String[3];
        double[] Price = new double[Products.length];
        int[] Quantity = new int[Products.length];
        boolean[] Status = new boolean[Products.length];

        ProductEntry pentry = new ProductEntry(sc, Products, Price, Status, Quantity);
        while (true) {
            System.out.println("Product Details");
            System.out.println(".............................");
            System.out.println("1. Enter Product's name: ");
            System.out.println("2. Enter Product's Status: ");
            System.out.println("3. Enter Products's Price: ");
            System.out.println("4. Enter Product's Quantity: ");
            System.out.println("5. Search a Product: ");
            System.out.println("6. Exit: ");
            System.out.println("Enter your choice[1-6]: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pentry.productEntry();
                    break;
                case 2:
                    pentry.entryStatus();
                    break;

                case 3:
                    pentry.entryPrice();
                    break;
                case 4:
                    pentry.entryQuantity();
                    break;
                case 5:
                    pentry.productSearch();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            System.out.println("Do you want to continue (Y/N)?");
            String str = sc.next();
            if (str.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }

    }

}
