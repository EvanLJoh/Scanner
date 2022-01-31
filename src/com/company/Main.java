package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner user = new Scanner(System.in);
        System.out.println("What is your name?" + " >");

        String name = user.nextLine();

        System.out.println("Hello " +name);
    }
}
