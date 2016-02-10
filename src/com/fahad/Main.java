package com.fahad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Inventory inventory = new Inventory();

        while(true){

            System.out.println(" What do you want to Do : ( Press 1 or 2 ) ");

            System.out.println(" 1. Insert product ");
            System.out.println(" 2. Show product ");


            Scanner scanner = new Scanner(System.in);
            int chosenOption = scanner.nextInt();

            if(chosenOption == 1){

                System.out.println("What is the name of your product : ");
                String productName = scanner.next();

                System.out.println( "What is the name of your quantity : " );
                int quantity = scanner.nextInt();

                Product product = new Product();
                product.setName(productName);
                product.setQuantity(quantity);

                inventory.getProducts().add(product);

            }else if(chosenOption == 2){

                for(int I = 0 ; I < inventory.getProducts().size() ; I++){

                    System.out.println("----------------------");
                    Product product = inventory.getProducts().get(I);

                    System.out.println(" Product Name is:  " + product.getName());
                    System.out.println(" product quantity is:  "+ String.valueOf(product.getQuantity()));

                    System.out.println("----------------------");
                }
            }
        }
    }
}
