/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.productdetails.obj;

import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class ProductEntry {

    Scanner sc = new Scanner(System.in);
    String[] Products;
    double[] Price;
    boolean[] Status;
    int[] Quantity;
    int count = 0;
    int stud = 0;
    int j;
    String result = "";
    boolean stat = false;

    public ProductEntry() {

    }

    public ProductEntry(Scanner sc, String[] Products, double[] Price, boolean[] Status, int[] Quantity) {
        this.sc = sc;
        this.Products = Products;
        this.Price = Price;
        this.Status = Status;
        this.Quantity = Quantity;
    }

    public void productEntry() {
        if (count < 3) {
            System.out.print("Enter new product's name: ");
            Products[count] = sc.next();
            stud = count;
            count++;
        } else {
            System.out.println("You have exceeded the limit of entry.");
        }

    }

    public void entryPrice() {
        System.out.print("Enter price for " + Products[stud] + ":");
        Price[stud] = sc.nextDouble();

    }

    public void entryQuantity() {
        System.out.println("Enter the quantity of " + Products[stud] + ":");
        Quantity[stud] = sc.nextInt();

    }

    public void entryStatus() {
        System.out.println("Enter the status of " + Products[stud] + ":");
        Status[stud] = sc.nextBoolean();
    }

    public void productSearch() {
        while (true) {
            System.out.println("Enter the product's name:");
            result = sc.next();

            for (int i = 0; i < count; i++) {
                if (Products[i].equalsIgnoreCase(result)) {

                    if (Status[i] == true) {
                        stat = true;
                        j = i;
                    }
                }

            }

            if (stat == true) {
                System.out.println("Product Details");
                System.out.println(".........................................");
                System.out.println("Product's name: " + Products[j]);
                System.out.println("Product's price: " + Price[j]);
                System.out.println("Product's status: " + stat);
                System.out.println("Product's quantity: " + Quantity[j]);
            } else {
                System.out.println("Product doesn't exist!");
            }
            System.out.println("Do you want to continue (Y/N)?");
            String c = sc.next();
            if (c.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }

    }
}
