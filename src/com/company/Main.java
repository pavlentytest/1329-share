package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int x = scan.nextInt();
	    if(x > 100) {
	        System.out.println("x>100");
        } else {
            System.out.println("x<100");
        }
    }

}
